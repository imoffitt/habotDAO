package info.habot.tm470.dao.interfaces;

import info.habot.tm470.dao.pojo.StrategicEvent;

import java.util.List;

/**
* EventDAO interface
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public interface EventDAO {

	   /** 
	    * This method will return a list of all events that are active.
	    */
	   public List<StrategicEvent> getActiveEvents();
}
