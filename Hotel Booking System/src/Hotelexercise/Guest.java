package Hotelexercise;

public class Guest {
	private String gender;
	private int age;
	private String name;
	private int reservationnumber;
	private String privateAddress;
	private String businessAddress;
	public Guest(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Guest [gender=" + gender + ", age=" + age + ", name=" + name + ", reservationnumber="
				+ reservationnumber + "]";
	}
	
}

	


