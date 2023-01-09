package di.example.bean.aware;

import org.springframework.beans.factory.BeanNameAware;

public class Address implements BeanNameAware {
	// Instance variables
	private int doorNo;
	private String streetName;
	private String city;
	private String beanName;

	// Getter and setter methods
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName
				+ ", city=" + city + "]";
	}
	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
		System.out.println("Bean Name : " + beanName);
	}
	
}
