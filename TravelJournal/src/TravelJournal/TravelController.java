package TravelJournal;

import java.util.Date;
import java.util.List;

public interface TravelController {

	
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
	
	/**
	 * Allows User to view all of his travel logs
	 * @return A list of the travel logs associated with the logged in user
	 */
	public List<TravelLog> viewAllLogs();
	
	/**
	 * Allows user to view all the different data from the travel logs
	 * @return - the data as a string
	 */
	public String viewData();
	
	/**
	 * Allows the User to add wish destinations
	 * @param destination - location they wish to go to
	 * @return true - if the wish is successfully added, false otherwise
	 */
	public boolean addWish(String destination);
	
	/**
	 * Allows the user to plan a future trip
	 * @param destination - location of future trip
	 * @return - if the future trip was successfully added
	 */
	public boolean planTrip(String destination);
	
	/**
	 * Allows the user to view how far they traveled on a trip
	 * @param tid - id of the travel log
	 * @param jid - id of the journal
	 * @return - the distance traveled on specified trip
	 */
	public int viewTripDistance(int tid, int jid);
	
	/**
	 * Allows user to sort trips by date
	 * @return - a list of sorted logs
	 */
	public List<TravelLog> sortDate();
	
	/**
	 * Allows user to sort trips based on their rating of the trip
	 * @return - a list of the sorted logs
	 */
	public List<TravelLog> sortRating();
	
	/**
	 * Allows the user to add a favorite location to their profile
	 * @param attribute - Users favorite location
	 * @return - true if the attribute was added, false otherwise
	 */
	public boolean addAttributes(String attribute);
	
	/**
	 * Create a new journal
	 * @return - the created journal
	 */
	public Journal createJournal();
	
	/**
	 * Allows the user to rate the trips they take
	 * @param jid - journal id
	 * @param tid - trip id
	 * @param rating - rating of the trip
	 * @return - if the rating was applied
	 */
	public boolean rateTrip(int jid, int tid, int rating);
	
	/**
	 * Allows user to delete a Journal
	 * @param id - journal id of journal to be deleted
	 * @return - if the journal was successfully deleted
	 */
	public boolean deleteJournal(int id);

	
	
	
	
}
