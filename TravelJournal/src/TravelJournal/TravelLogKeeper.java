package TravelJournal;

import java.util.Date;
import java.util.List;

public interface TravelLogKeeper {

	
	/**
	 * login
	 * @param name
	 * @param password
	 * @return - true if successful login. false otherwise
	 */
	public boolean login(String name, String password);
	
	/**
	 * logout
	 * @param name
	 * @return - true if successful logout. false otherwise
	 */
	public boolean logout(String name);
	
	/**
	 * creates log
	 * @param destination
	 * @param date
	 * @param Journal
	 * @return log id
	 */
	public int createLog(String destination, Date date, String Journal);
	
	/**
	 * modify's log
	 * @param id
	 * @param field
	 * @param toChange
	 * @return returns true if able to change. false otherwise
	 */
	public boolean modifyLog(int id, String field, String toChange);
	
	/**
	 * delete log
	 * @param id
	 * @param jid
	 * @return - return true if log is deleted. false otherwise
	 */
	public boolean deleteLog(int id, int jid);
	
	/**
	 * add a new user. 
	 * @param name
	 * @param password
	 * @return - returns true if a new user is registered. false otherwise
	 */
	public boolean addUser(String name, String password);
	
	/**
	 * change user information
	 * @param name
	 * @param field
	 * @param toChange
	 * @return - return true if able to change. false otherwise
	 */
	public boolean editUser(String name, String field, String toChange);
	
	/**
	 * remove user from db
	 * @param name
	 * @return - return true if user is removed. false otherwise
	 */
	public boolean removeUser(String name);
	/**
	 * change name of journal
	 * @param currentName
	 * @param newName
	 * @return - return true if journal name is true, otherwise false
	 */
	public boolean nameJournal(String currentName, String newName);
	

	/**
	 * Change the attributes of travel log
	 * @param t
	 * @return - true if modification is true. false otherwise
	 */
	public boolean modifyLog(TravelLog t);
	
	/**
	 * delete a travel log
	 * @param id
	 * @return - true if log is deleted, false otherwise
	 */
	public boolean deleteLog(int id);
	
	
	/**
	 * creates a new journal?
	 * @return
	 */
	public boolean create();
	
	List<TravelLog> viewAllLogs();
	String viewData();
	boolean addWish(String destination);
	boolean planTrip(String destination);
	int viewTripDistance(int tid, int jid);
	List<TravelLog> sortDate();
	List<TravelLog> sortRating();
	boolean addAttributes(String attribute);
	Journal createJournal();
	boolean rateTrip(int jid, int tid, int rating);
	boolean deleteJournal(int id);

	
	
}
