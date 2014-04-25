package TravelJournal;

import java.util.List;

public interface DataBase {

	/**
	 * returns a user given a username and password
	 * @param name
	 * @param password
	 * @return - user
	 */
	public Users getUser(String name, String password);
	
	/**
	 * returns a user given a username
	 * @param userName
	 * @return - user
	 */
	public Users getUser(String userName);
	
	
	/**
	 * Able to register a given user
	 * @param u
	 * @return - true if able to store user. false otherwise
	 */
	public boolean putUser(Users u);
	
	
	/**
	 * retrieves a journal given a string name
	 * 
	 * @param name
	 * @return -  journal
	 */
	public Journal getJournal(String name);
	
	
	/**
	 * retrieves a journal given an id
	 * @param id
	 * @return - journal
	 */
	public Journal getJournal(int id);
	
	
	/**
	 * stores journal in db
	 * @param j
	 * @return - true if journal is stored. false otherwise
	 */
	public boolean putJournal(Journal j);
	
	/**
	 * retrieves all journals
	 * @return - list of each journal object
	 */
	List<Journal> getAllJournals();
	
	/**
	 * Stores the user wish list
	 * @return - true if the list is stored, false otherwise
	 */
	boolean storeWishList();
	
	/**
	 * Allows user to store a future trip
	 * @param tl - trip to be stored
	 * @return - true if trip is stored
	 */
	boolean storeFutureTrip(TravelLog tl);
	
	/**
	 * Removes a journal from the database for good
	 * @param id - id of journal to remove
	 * @return - true f remove is successful
	 */
	boolean removeJournal(int id);
	
}
