package com.SI.Payment;

import com.SI.invoices.Invoice;

public interface PaymentCreator {
	 
    Payment createPayment(Invoice invoice) throws PaymentException;
 
}

