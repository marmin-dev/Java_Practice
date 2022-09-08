package mylittletv;

public class TV {
private String company;
private int year;
private int size;

public TV(String company, int year, int size) {
	super();
	this.company = company;
	this.year = year;
	this.size = size;
}

public String getCompany() {
	return company;
}

public int getYear() {
	return year;
}

public int getSize() {
	return size;
}

public void info() {
	System.out.println(getCompany()+"에서 만든"+getYear()+"년도"+getSize()+"인치");
}

}
