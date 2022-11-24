package domain;


public class Client {

	private String name;
	private int age;
	private char gender;
	private Address address;
	private BankCard bankCard;

	public Client(String name, int age, char gender, Address address, BankCard bankCard) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.bankCard = bankCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BankCard getBankCard() {
		return bankCard;
	}

	public void setBankCard(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	@Override
	public String toString() {
		return "Client: name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", bankCard="
				+ bankCard;
	}
	
	

}

