package TravelJournal;

import java.util.Date;
import java.util.List;

public class MyTravelLogKeeper implements TravelLogKeeper {

	//holds all of the users registered.
	MyDataBase data = new MyDataBase();
	MyUsers currentLoggedIn = null;
	MyTravelLogKeeper()
	{
		
	}

	@Override
	public boolean login(String name, String password) {

		if(data.getUser(name, password) == null){
			System.out.println("User is not registered in database");
			return false;
		}
		else{
		currentLoggedIn = (MyUsers) data.getUser(name, password);	
		return true;
		
		}
	}

	@Override
	public boolean logout(String name) {

		currentLoggedIn = null;
		return true;
	}

	@Override
	public int createLog(String destination, Date date, String Journal) {
		
		//Users theUser = new MyUsers();
		int logID = currentLoggedIn.createLog(destination, date, Journal);
		return logID;
	}

	@Override
	public boolean modifyLog(int id, String field, String toChange) {
		
		//Users theUser = new MyUsers();
		boolean success = currentLoggedIn.modifyLog(id, field, toChange);
		return success;
	}

	@Override
	public boolean deleteLog(int id, int jid) {
		
		//Users theUser = new MyUsers();
		boolean delete = currentLoggedIn.deleteLog(id, jid);
		return delete;
	}

	@Override
	public boolean addUser(String name, String password) {

		if(data.getUser(name) != null){
			System.out.println("Username already exists");
			return false;
		}
		
		MyUsers user = new MyUsers();
		user.create(name, password);
		data.putUser(user);
		
		return true;
	}

	@Override
	public boolean editUser(String name, String field, String toChange) {
		
		data.getUser(name).editUser(field, toChange);
		
		return true;
	}

	@Override
	public boolean removeUser(String name) {
		
		if(data.getUser(name) == null){
			System.out.println("Username doesn't exists");
			return false;
		}
		
		data.users.remove(data.getUser(name));
		
		return false;
	}

	@Override
	public boolean nameJournal(String currentName, String newName) {
		
		//Users theUser = new MyUsers();
		boolean change = currentLoggedIn.nameJournal(currentName, newName);
		return change;
	}

	@Override
	public boolean modifyLog(TravelLog t) {
		
		return false;
	}

	@Override
	public boolean deleteLog(int id) {
		
		return false;
	}

	@Override
	public boolean create() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TravelLog> viewAllLogs() {
		
		List<TravelLog> tl = currentLoggedIn.viewAllLogs();
		return tl;
	}

	@Override
	public String viewData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addWish(String destination) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean planTrip(String destination) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int viewTripDistance(int tid, int jid) {
		
		int distance = currentLoggedIn.viewTripDistance(tid, jid);
		return distance;
	}

	@Override
	public List<TravelLog> sortDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelLog> sortRating() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAttributes(String attribute) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Journal createJournal() {
		
		Journal j = currentLoggedIn.createJournalAlt();
		return j;
	}

	@Override
	public boolean rateTrip(int jid, int tid, int rating) {
		
		boolean rate = currentLoggedIn.rateTrip(jid, tid, rating);
		return rate;
	}

	@Override
	public boolean deleteJournal(int id) {
		
		boolean delete = currentLoggedIn.deleteJournal(id);
		return delete;
	}
}
