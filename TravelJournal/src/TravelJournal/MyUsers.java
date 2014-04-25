package TravelJournal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyUsers implements Users {
	String username;
	String password;
	String field;
	private MyDataBase db = new MyDataBase();
	MyUsers()
	{
		
	}

	@Override
	public int createLog(String destination, Date date, String Journal) {
		
		Journal toEdit = db.getJournal(Journal);
		toEdit.createLog(destination, date);
		db.putJournal(toEdit);
		return 0;
	}

	@Override
	public boolean modifyLog(int id, String field, String toChange) {
		
		Journal toEdit = db.getJournal(id);
		TravelLog tl = toEdit.getLog(0);//need new id field
		boolean success = toEdit.modifyLog(tl, field, toChange); //needs extra parameters
		db.putJournal(toEdit);
		
		return success;
	}

	@Override
	public boolean deleteLog(int id, int jid) {

		Journal j = db.getJournal(jid);
		j.deleteLog(id);
		return false;
	}

	@Override
	public boolean editUser(String field, String toChange) {

		this.field = toChange;
		return false;
	}

	@Override
	public boolean nameJournal(String currentName, String newName) {
		
		Journal j = db.getJournal(currentName);
		boolean change = j.editName(newName);
		db.putJournal(j);
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
	public boolean createJournal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create(String name, String password) {
		
		username = name;
		this.password = password;
		
		return false;
	}

	@Override
	public boolean modify(String field, String change) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TravelLog> viewAllLogs() {
		
		List<Journal> journals = db.getAllJournals();
		List<TravelLog> tl = new ArrayList<TravelLog>();
		for(Journal j : journals )
		{
			tl.addAll(j.getAllLogs());
		}
		
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
		// TODO Auto-generated method stub
		Journal j = db.getJournal(jid);
		TravelLog tl = j.getLog(tid);
		int distance = tl.getDistance();
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
	public Journal createJournalAlt() {
		// TODO Auto-generated method stub
		Journal j = new MyJournal();
		int id = j.create();
		db.putJournal(j);
		return j;
	}

	@Override
	public boolean rateTrip(int jid, int tid, int rating) {
	
		Journal j = db.getJournal(jid);
		TravelLog tl = j.getLog(tid);
		boolean rate = tl.rateTrip(rating);
		return rate;
	}

	@Override
	public boolean deleteJournal(int id) {
		
		boolean delete = db.removeJournal(id);
		return delete;
	}	
	
}
