package froo;

public class Student {
	private int rollnum;
	private String name;
	private String clgname;
	private  String city;
	private double percentage;
	Student(int rollnum,String name,String clgname,String city,double percentage){
		this.rollnum=rollnum;
		this.name=name;
		this.clgname=clgname;
		this.city=city;
		this.percentage=percentage;
		
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
	

}
