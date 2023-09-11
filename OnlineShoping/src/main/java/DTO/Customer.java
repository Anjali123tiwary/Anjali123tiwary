package DTO;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable{
	String CustName,email,Address,password;
	int flag;

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return Address;
	}

	@Override
	public String toString() {
		return "Customer [CustName=" + CustName + ", email=" + email + ", Address=" + Address + ", password=" + password
				+ ", flag=" + flag + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, CustName, email, flag, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(CustName, other.CustName)
				&& Objects.equals(email, other.email) && Objects.equals(flag, other.flag)
				&& Objects.equals(password, other.password);
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	


	
	

}
