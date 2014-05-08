package info.habot.tm470.main;
import java.awt.geom.Point2D;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.habot.tm470.dao.NetworkNodeImpl;
import info.habot.tm470.dao.pojo.NetworkNode;


public class MainApp {

	public static void main(String[] args) {
	      ApplicationContext context = 
		             new ClassPathXmlApplicationContext("Beans.xml");

		      NetworkNodeImpl networkNodeImpl = 
		      (NetworkNodeImpl)context.getBean("networkNodeImpl");
		      
		      double latitude = 1234.56;
		      double longitude = 5678.90;
		      Point2D.Double location = new Point2D.Double();
		      location.setLocation(latitude, longitude);
		      
		      NetworkNode networkNode = new NetworkNode();
		      networkNode.setNodeId("1");
		      networkNode.setLocation(location);
		      
		      System.out.println("------Records Creation--------" );
		      networkNodeImpl.create(networkNode);

//		      System.out.println("------Listing Multiple Records--------" );
//		      List<NetworkNode> networkNode = networkNodeJDBCTemplate.listNetworkNode();
//		      for (NetworkNode record : networkNode) {
//		         System.out.print("ID : " + record.getNodeId() );
//		         System.out.print(", Point : " + record.getLocation().toString());
//		      }
	}

}
