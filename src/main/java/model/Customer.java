package model;
import java.util.List;

public class Customer extends User{
	
	private List<Order> historic;
	private String birthdate;
	
	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String phoneNumber, String email, String adress,
			String bankingDetails, String birthdate) {
		super(id, firstName, lastName, phoneNumber, email, adress, bankingDetails);
		this.birthdate = birthdate;
	}

	public List<Order> getHistoric() {
		return historic;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public void addOrderToHistoric(Order order) {
		historic.add(order);
	}
	
	
}




