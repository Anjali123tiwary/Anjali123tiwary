package dao;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDTO implements Serializable, Comparable<CustomerDTO>{
	private int cust_id;
	private String cust_name;
	private String cust_pwd;
	private int flag;
	
	@Override
	public int compareTo(CustomerDTO o) {
		// TODO Auto-generated method stub
		return this.cust_name.compareTo(o.cust_name);
	}
	
	@Override
	public String toString() {
		return "CustomerDTO [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_pwd=" + cust_pwd + ", flag="
				+ flag + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cust_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		return Objects.equals(cust_name, other.cust_name);
	}

	/**
	 * @return the cust_id
	 */
	public int getCust_id() {
		return cust_id;
	}
	/**
	 * @param cust_id the cust_id to set
	 */
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	/**
	 * @return the cust_name
	 */
	public String getCust_name() {
		return cust_name;
	}
	/**
	 * @param cust_name the cust_name to set
	 */
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	/**
	 * @return the cust_pwd
	 */
	public String getCust_pwd() {
		return cust_pwd;
	}
	/**
	 * @param cust_pwd the cust_pwd to set
	 */
	public void setCust_pwd(String cust_pwd) {
		this.cust_pwd = cust_pwd;
	}
	/**
	 * @return the flag
	 */
	public int getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}
