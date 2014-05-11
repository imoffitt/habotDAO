package info.habot.tm470.dao;

import java.util.List;

import info.habot.tm470.dao.NetworkNodeImpl;
import info.habot.tm470.dao.pojo.NetworkNode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testNetworkNode {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:Beans.xml");
		
		NetworkNodeImpl networkNodeImpl = 
			      (NetworkNodeImpl)applicationContext.getBean("networkNodeImpl");
		
		
		List<NetworkNode> networkNodeList = networkNodeImpl.listNetworkNode();
		
		// Add to knowledge base
		for (NetworkNode networkNode : networkNodeList) {
			System.out.println(networkNode.getNodeId());
			break;
		}
		
	}

}
