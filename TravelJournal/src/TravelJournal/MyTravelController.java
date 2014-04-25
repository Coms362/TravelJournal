package TravelJournal;

import java.util.Date;
import java.util.List;

public class MyTravelController implements TravelController {

	private MyTravelLogKeeper keeper = new MyTravelLogKeeper();
	
	@Override
	public boolean login(String name, String password) {
		
		boolean login = keeper.login(name, password);
		
		return login;
	}

	@Override
	public boolean logout(String name) {

		boolean logout = keeper.logout(name);
		return logout;
	}

	@Override
	public int createLog(String destination, Date date, String Journal) {
		
		int logID = keeper.createLog(destination, date, Journal);
		return logID;
	}

	@Override
	public boolean modifyLog(int id, String field, String toChange) {
		
		keeper = new MyTravelLogKeeper();
		boolean success = keeper.modifyLog(id, field, toChange);
		return success;
	}

	@Override
	public boolean deleteLog(int id, int jid) {
		
		boolean delete = keeper.deleteLog(id, jid);
		return delete;
	}

	@Override
	public boolean addUser(String name, String password) {

		boolean createUser = keeper.addUser(name, password);
		
		return createUser;
	}

	@Override
	public boolean editUser(String name, String field, String toChange) {

		boolean editUser = keeper.editUser(name, field, toChange);
		
		
		return editUser;
	}

	@Override
	public boolean removeUser(String name) {

		boolean removeUser = keeper.removeUser(name);
		
		return removeUser;
	}

	@Override
	public boolean nameJournal(String currentName, String newName) {
		
		boolean reName = keeper.nameJournal(currentName, newName);
		
		return reName;
	}

	@Override
	public boolean modifyLog(TravelLog t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteLog(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Journal createJournal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelLog> viewAllLogs() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return 0;
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
	public boolean rateTrip(int jid, int tid, int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteJournal(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
