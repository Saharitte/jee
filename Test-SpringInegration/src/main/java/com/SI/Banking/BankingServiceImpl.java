package com.SI.Banking;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.SI.Payment.Payment;
import com.SI.Payment.PaymentException;

@Service
public class BankingServiceImpl 	 implements BankingService {
		 
		    private final Random rand = new Random();
		 
		    @Override
		    public void pay(Payment payment) throws PaymentException {
		        if (rand.nextDouble() > 0.9) {
		            throw new PaymentException("Banking services are offline, try again later!");
		        }
		 
		        System.out.println("Processing payment " + payment);
		    }
}
