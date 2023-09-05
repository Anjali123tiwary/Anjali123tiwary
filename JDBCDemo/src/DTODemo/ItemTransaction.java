package DTODemo;

import java.io.Serializable;

public class ItemTransaction implements Serializable{
	private int invoiceId,itemId,quantity;

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + invoiceId;
		result = prime * result + itemId;
		result = prime * result + quantity;
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
		ItemTransaction other = (ItemTransaction) obj;
		if (invoiceId != other.invoiceId)
			return false;
		if (itemId != other.itemId)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemTransaction [invoiceId=" + invoiceId + ", itemId=" + itemId + ", quantity=" + quantity + "]";
	}
	
}
