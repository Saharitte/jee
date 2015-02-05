package com.SI.Banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.SI.Payment.Payment;
import com.SI.Payment.PaymentException;


/**
 * Endpoint that picks Payments from the system and dispatches them to the
 * service provided by bank.
 */


@Component
public class PaymentProcessor {

	@Autowired
	BankingService bankingService;

	@ServiceActivator
	public void processPayment(Payment payment) throws PaymentException {
		bankingService.pay(payment);
	}

}