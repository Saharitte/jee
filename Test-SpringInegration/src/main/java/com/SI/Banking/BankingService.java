package com.SI.Banking;

import com.SI.Payment.Payment;
import com.SI.Payment.PaymentException;

public interface BankingService {
	
	void pay(Payment payment) throws PaymentException;

}
