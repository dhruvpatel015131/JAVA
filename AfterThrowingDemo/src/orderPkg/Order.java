package orderPkg;

public class Order {
	int orderId;
	String supplierNm;
	int orderQty;
	
	public Order() {
		super();
	}

	public Order(int orderId, String supplierNm, int orderQty) {
		super();
		this.orderId = orderId;
		this.supplierNm = supplierNm;
		this.orderQty = orderQty;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getSupplierNm() {
		return supplierNm;
	}

	public void setSupplierNm(String supplierNm) {
		this.supplierNm = supplierNm;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		if(orderQty<0)
			throw new IllegalArgumentException("Order value cannot be negative");
		else
			this.orderQty = orderQty;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", supplierNm=" + supplierNm + ", orderQty=" + orderQty + "]";
	}
}
