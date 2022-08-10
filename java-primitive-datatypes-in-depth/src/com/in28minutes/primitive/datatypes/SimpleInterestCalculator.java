package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int numOfYears) {
		BigDecimal numOfYearsBigDecimal = new BigDecimal(numOfYears);
		// totalValue = principal + principal * interest * numOfYears
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(numOfYearsBigDecimal));
		return totalValue;
	}

}
