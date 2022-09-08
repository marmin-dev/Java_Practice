package pro1;

import java.util.TreeMap;

public class PhonebookEx {

	public static void main(String[] args) {
		
		phonebook phone1 = new phonebook("박태욱", "01095528693");
		TreeMap<String , String> phone = new TreeMap<>();
		phone1.save(phone);
		
		
		
	}

}
