package TravelJournal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


public class MyDataBase implements DataBase {

	HashMap<String, Journal> journals = new HashMap<String, Journal>();
	ArrayList<MyUsers> users = new ArrayList<MyUsers>(); 
	MyDataBase()
	{
		
	}
	@Override
	public Users getUser(String name, String password) {

		for(int i = 0; i < users.size(); i++){
			if(users.get(i).password.equals(password) && users.get(i).username.equals(name)){
				return users.get(i);
			}
		}
		return null;
	}

	@Override
	public Users getUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean putUser(Users u) {
		users.add((MyUsers) u);
		return true;
	}

	@Override
	public Journal getJournal(String name) {
		return journals.get(name);
	}

	@Override
	public Journal getJournal(int id) {
		
		Collection<Journal> theJournal = journals.values();
		for(Journal j : theJournal)
		{
			if(j.getID() == id)
				return j;
		}
		return null;
	}

	@Override
	public boolean putJournal(Journal j) {
		String key = j.getName();
		journals.put(key, j);
		return false;
	}

}
