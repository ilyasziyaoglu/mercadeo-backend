package com.andriambavy.ecom.client.order;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-05-02
 */

public enum OrderStatus {
	WAITING_CONFIRM(1, "Order waiting for approval"),
	PREPARING(2, "Preparing order"),
	SHIPPED(3, "Order shipped"),
	ON_WAY(4, "Order is on the way"),
	ARRRIVED(5, "Order reached the delivery branch"),
	ON_DELIVERY(6, "Order is on delivery"),
	DELIVERED(7, "Order delivered"),
	REJECTED(8, "Order rejected"),
	CANCELED(9, "Order canceled");

	private Integer value;
	private String desc;

	OrderStatus(Integer value, String desc) {
		this.value = value;
		this.desc = desc;
	}
}
