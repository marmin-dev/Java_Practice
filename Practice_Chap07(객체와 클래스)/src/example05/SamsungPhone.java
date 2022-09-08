package example05;

public class SamsungPhone {
private String company;
private String model;
private String color;
private int release;

public String getCompany() {
	return company;
	
}
public void setCompany(String company) {
	if(!company.equals("삼성"))
	{
	System.out.println("삼성 제품이 아닙니다");
	}
	this.company = company;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getRelease() {
	return release;
}
public void setRelease(int release) {
	this.release = release;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getCompany()+"회사의 "+ this.getModel() +"모델이며 "
		+ this.getColor()+ "색상이며, 출시일은" + this.getRelease()+"입니다.";
	}


}
