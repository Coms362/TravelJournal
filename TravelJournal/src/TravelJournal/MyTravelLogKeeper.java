package TravelJournal;

import java.util.Date;

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
		
		Users theUser = new MyUsers();
		int logID = theUser.createLog(destination, date, Journal);
		return logID;
	}

	@Override
	public boolean modifyLog(int id, String field, String toChange) {
		// TODO Auto-generated method stub
		Users theUser = new MyUsers();
		boolean success = theUser.modifyLog(id, field, toChange);
		return success;
	}

	@Override
	public boolean deleteLog(int id, int jid) {
		// TODO Auto-generated method stub
		Users theUser = new MyUsers();
		boolean delete = theUser.deleteLog(id, jid);
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
		
		Users theUser = new MyUsers();
		boolean change = theUser.nameJournal(currentName, newName);
		return change;
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
}
