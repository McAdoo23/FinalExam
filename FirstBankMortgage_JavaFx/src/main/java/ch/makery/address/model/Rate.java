package ch.makery.address.model;

import base.RateDAL;
import domain.RateDomainModel;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.UUID;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Rate extends RateDomainModel {
	int rate = RateDAL.getRate(myCredit);
	double PV;
	double FV = 0;
	double mnthExpenses;
	
	
	public double getPayment(int NumberOfPayments){
		
		
		
		PV = FinanceLib.pv(rate, NumberOfPayments, MnthExpenses, FV, true);
		//	Figure out payment based on:
		//	Interest rate
		//	PV
		//	FV (make FV = 0, unless you want a balloon payment
		//	Compounding = True
		//	Number of Payments (passed in)
		
		
		
		return 0;
	}
	public IntegerProperty getMnthExpenses(){
    	return new SimpleIntegerProperty(mnthExpenses);    	
    }
}
