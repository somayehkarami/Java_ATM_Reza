package domain;

public class Address {

	private String addressNumber;
	private String streetName;
	private String city;
	private String postalCode;

	public Address(String addressNumber, String streetName, String city, String postalCode) {
		this.addressNumber = addressNumber;
		this.streetName = streetName;
		this.city = city;
		this.postalCode = postalCode;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address: addressNumber=" + addressNumber + ", streetName=" + streetName + ", city=" + city
				+ ", postalCode=" + postalCode;
	}
	
	

}
