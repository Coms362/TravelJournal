package TravelJournal;

import java.util.Date;
import java.util.List;

public interface Journal {
	
	/**
	 * creates a travel log returning an id of said id
	 * @param destination
	 * @param date
	 * @return - id of travel log
	 */
	public int createLog(String destination, Date date);
	
	/**
	 * returns travel log given id
	 * @param id
	 * @return - travel log
	 */
	public TravelLog getLog(int id);
	
	/**
	 * Change the attributes of travel log
	 * @param t
	 * @return - true if modification is true. false otherwise
	 */
	public boolean modifyLog(TravelLog t, String field, String toChange);
	
	/**
	 * delete a travel log
	 * @param id
	 * @return - true if log is deleted, false otherwise
	 */
	public boolean deleteLog(int id);
	
	/**
	 * change name of travel log given new name
	 * @param name
	 * @return true if name is changed. false otherwise
	 */
	public boolean editName(String name);
	
	/**
	 * a way to get the name of the journal
	 * @return the name of the journal
	 */
	public String getName();
	
	/**
	 * a way to get the id of the journal
	 * @return the id of the journal
	 */
	public int getID();
	
	Journal create();
	List<TravelLog> getAllLogs();
	String getAllData();
	List<TravelLog> sort(String by);
	
	
	

}
