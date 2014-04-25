package TravelJournal;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyJournal implements Journal {

	HashMap<Integer, TravelLog> travelLogs = new HashMap<Integer, TravelLog>();
	String journalName = "";
	int journalID = 0;
	
	MyJournal()
	{
		//create();
	}
	
	@Override
	public int createLog(String destination, Date date) {
		TravelLog tl = new MyTravelLog();
		int logID = tl.create(destination, date);
		travelLogs.put(logID, tl);
		return logID;
	}

	@Override
	public TravelLog getLog(int id) {
		
		TravelLog tl = travelLogs.get(id);
		return tl;
	}

	@Override
	public boolean modifyLog(TravelLog t, String field, String toChange) {
		boolean success  = t.modifyTravelLog(field, toChange);
		
		return success;
	}

	@Override
	public boolean deleteLog(int id) {
		
		boolean delete = travelLogs.remove(id) != null;
		return delete;
	}

	@Override
	public boolean editName(String name) {
		
		journalName = name;
		
		return true;
	}

	@Override
	public int create() {
		
		journalID = (int)(Math.random()*100);
		return journalID;
	}

	@Override
	public String getName() {
		
		return journalName;
	}

	@Override
	public int getID() {
		
		return journalID;
	}

	@Override
	public List<TravelLog> getAllLogs() {
		
		Collection<TravelLog> tl = travelLogs.values();
		List<TravelLog> logs  = (List<TravelLog>) tl;
		return logs;
	}

	@Override
	public String getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelLog> sort(String by) {
		// TODO Auto-generated method stub
		return null;
	}

}
