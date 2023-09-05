package DTODemo;

import java.io.Serializable;

public class CustomerMaster implements Serializable {
	private int customerId;
	private String custName,custAddress;
	private long custTelephone;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public long getCustTelephone() {
		return custTelephone;
	}
	public void setCustTelephone(long custTelephone) {
		this.custTelephone = custTelephone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((custAddress == null) ? 0 : custAddress.hashCode());
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + (int) (custTelephone ^ (custTelephone >>> 32));
		result = prime * result + customerId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerMaster other = (CustomerMaster) obj;
		if (custAddress == null) {
			if (other.custAddress != null)
				return false;
		} else if (!custAddress.equals(other.custAddress))
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (custTelephone != other.custTelephone)
			return false;
		if (customerId != other.customerId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CustomerMaster [customerId=" + customerId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", custTelephone=" + custTelephone + "]";
	}
	
}
