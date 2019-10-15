package Hotelexercise;

public class Adress {
	
	//Teil 1/3
	
	private String street;
	private String number;
	private String postcode;
	private String city;
	//Teil 2/3
	public Adress (String street, String number, String postcode, String city) {
		this.street = street;
		this.number = number;
		this.postcode = postcode;
		this.city = city;
	}
	//Teil 3/3
	public void setStreet(String value) {
		street = value;
	}
	
	@Override
	public String toString() {
		return "Adress [street=" + street + ", number=" + number + ", postcode=" + postcode + ", city=" + city + "]";
	}
	public void setNumber(String value) {
		number = value;
	}
	public void setPostcode(String value) {
		postcode = value;
	}
	public void setCity(String value) {
		city = value;
	}
	public String getStreet() {
		return street;
	}
	public String getNumber() {
		return number;
	}
	public String getpostcode() {
		return postcode;
	}
	public String getCity() {
		return city;
	}
	
	
}

