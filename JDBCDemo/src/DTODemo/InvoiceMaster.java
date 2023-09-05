package DTODemo;

import java.io.Serializable;
import java.sql.Date;

public class InvoiceMaster implements Serializable{
	private int invoice_id,discount,customerId;
	private Date invoiceDate;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result + discount;
		result = prime * result + ((invoiceDate == null) ? 0 : invoiceDate.hashCode());
		result = prime * result + invoice_id;
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
		InvoiceMaster other = (InvoiceMaster) obj;
		if (customerId != other.customerId)
			return false;
		if (discount != other.discount)
			return false;
		if (invoiceDate == null) {
			if (other.invoiceDate != null)
				return false;
		} else if (!invoiceDate.equals(other.invoiceDate))
			return false;
		if (invoice_id != other.invoice_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InvoiceMaster [invoice_id=" + invoice_id + ", discount=" + discount + ", customerId=" + customerId
				+ ", invoiceDate=" + invoiceDate + "]";
	}
	
}
