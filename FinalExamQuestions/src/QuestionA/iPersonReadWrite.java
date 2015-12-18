package QuestionA;

import java.util.Date;

public class iPersonReadWrite {
private Date DOB;
private String LastName;
private String MiddleName;
private String FirstName;
private String address;
private String phone_number;
private String email_address;

	//setvalues
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}
	public void setAddress(String newAddress) {
		String address = newAddress;
	}

	public void setPhone(String newPhone_number) {
		String phone_number = newPhone_number;
	}
	public void setEmail(String newEmail) {
		String email_address = newEmail;
	}
	public iPersonReadWrite(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email) {
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.DOB = DOB;
		this.address = Address;
		this.phone_number = Phone_number;
		this.email_address = Email;
		
	}
}

