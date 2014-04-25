package TravelJournal;

import java.util.Date;

public interface TravelLog {

	
	
	/**
	 * modifies given travel log
	 * @param field
	 * @param toChange
	 * @return
	 */
	public boolean modifyTravelLog(String field, String toChange);
	
	/**
	 * create a new Travel log
	 * @param destination
	 * @param date
	 * @return - returns id of log
	 */
	public int create(String destination, Date date);
	
	/**
	 * retrieves all data from the log
	 * @return - data in the format of a string
	 */
	String getData();
	
	/**
	 * Allows the user to create a new log with just destination, to be used for 
	 * future trips
	 * @param destination - location of trip
	 * @return - the newly created log
	 */
	TravelLog createNew(String destination);
	
	/**
	 * retrieves the distance traveled on the trip
	 * @return - total distance from trip
	 */
	int getDistance();
	
	/**
	 * allow the user to rate the trip
	 * @param rating - rating of the trip
	 * @return - if the rating was added
	 */
	boolean rateTrip(int rating);

}
