package com.SI.Payment;

import java.math.BigDecimal;

import com.google.common.base.Objects;

public class Payment {

	private final String senderAccount;
	private final String receiverAccount;
	private final BigDecimal dollars;

	public Payment(String senderAccount, String receiverAccount,
			BigDecimal dollars) {
		this.senderAccount = senderAccount;
		this.receiverAccount = receiverAccount;
		this.dollars = dollars;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("senderAccount", senderAccount)
				.add("receiverAccount", receiverAccount)
				.add("dollars", dollars).toString();
	}

}
