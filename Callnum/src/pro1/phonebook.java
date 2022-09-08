package pro1;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class phonebook implements Frame{

	private String name;
	private String phonenum;
	@Override
	public void save(TreeMap<String ,String> phone) {
		phone.put(name, phonenum);
	}

	@Override
	public void remove(TreeMap<String ,String> phone) {
		phone.remove(name);
		phone.remove(phonenum);
	}
	

	public phonebook(String name, String phonenum) {
		this.name = name;
		this.phonenum = phonenum;
	}

	public String getName() {
		return name;
	}

	public String getPhonenum() {
		return phonenum;
	}
	
	
	
	
	
	
	

}
