package info.habot.tm470.dao;

import info.habot.tm470.dao.SqlLookupBean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
* SqlLookupBean implements Serializable
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class SqlLookupBean implements Serializable {
	private Connection Conn;
	private static String driverName;
	private static String dbUrl;
	private static String userId;
	private static String passWord;
	private boolean bSingleTransaction;

	private String logText = "";

	private static final Logger log = Logger.getLogger(SqlLookupBean.class
			.getName());

	private DataSource dataSource = null;
	private JdbcTemplate jdbcTemplateObject = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public static DriverManagerDataSource getDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverName);
		dataSource.setUrl(dbUrl);
		dataSource.setUsername(userId);
		dataSource.setPassword(passWord);
		return dataSource;
	}

	public SqlLookupBean() {
		this.bSingleTransaction = true;
		logText = "";
	}

	public ArrayList<Map<String, Object>> getValue(String sSQL) {

//		log.debug("SQL=" + sSQL);
//		logText = logText + sSQL + "<br>";

		ArrayList<Map<String, Object>> vResultList = null;

		if (this.dataSource == null) {
			try {
				getConnection();
			} catch (SQLException e) {
//				log.error("47=" + e.getMessage());
				logText = logText + "47=" + e.getMessage() + "<br>";
			}
		}
		
		try {
			vResultList = (ArrayList<Map<String, Object>>) jdbcTemplateObject
					.query(sSQL, new LookupRowMapper());

//			log.debug("vResult.size()=" + vResultList.size());
//			logText = logText + "vResult.size()=" + vResultList.size() + "<br>";

		} catch (Exception ex) {
			logText = logText + "91 ex=" + ex.getMessage() + "<br>";
		}

		if (this.bSingleTransaction) {
			try {
				releaseConnection();
			} catch (Exception e) {
//				log.error(e.getMessage());
				logText = logText + "99 ex=" + e.getMessage() + "<br>";
			}
		}

		return vResultList;
	}

	/**
	 * @author Ian
	 * 
	 */
	public class LookupRowMapper implements RowMapper<Map<String, Object>> {

		public Map<String, Object> mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			ResultSetMetaData metaData = resultSet.getMetaData();

			int colCount = metaData.getColumnCount();

			Map<String, Object> columns = new HashMap<String, Object>();
			for (int i = 1; i <= colCount; i++) {
//				log.debug("I=" + i);
//				log.debug("metaData.getColumnLabel(i)="
//						+ metaData.getColumnLabel(i)
//						+ ", metaData.getColumnLabel(i)="
//						+ metaData.getColumnLabel(i));

				columns.put(metaData.getColumnLabel(i), resultSet.getObject(i));
			}
			return columns;
		}
	}

	public void setdriverName(String thedriverName) {
		this.driverName = thedriverName;
	}

	public void setdbUrl(String thedbUrl) {
		this.dbUrl = thedbUrl;
	}

	public void setuserId(String theuserId) {
		this.userId = theuserId;
	}

	public void setpassWord(String thepassWord) {
		this.passWord = thepassWord;
	}

	public void releaseConnection() throws Exception {
		try {
			this.Conn.close();
		} catch (SQLException e) {
			throw new Exception(e);
		}
	}

	public void getConnection() throws SQLException {
		setDataSource(getDataSource());
	}

	public void setBSingleTransaction(boolean bSingleTransaction) {
		this.bSingleTransaction = bSingleTransaction;
	}

	public boolean isBSingleTransaction() {
		return this.bSingleTransaction;
	}

	public String getLogText() {
		return logText;
	}

	public void setLogText(String logText) {
		this.logText = logText;
	}
}