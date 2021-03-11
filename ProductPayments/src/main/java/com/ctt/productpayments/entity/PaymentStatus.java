package com.ctt.productpayments.entity;

import lombok.Data;

@Data
public final class PaymentStatus {

	public static final String APPROVED = "APPROVED";

	public static final String WAITING = "WAITING";

	public static final String REPROVED = "REPROVED";

}
