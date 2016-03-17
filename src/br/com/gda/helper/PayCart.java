package br.com.gda.helper;

import java.util.ArrayList;

public class PayCart {

	private CreditCardAG creditCard;
	private ArrayList<PlanningTime> planningTime = new ArrayList<PlanningTime>();

	public CreditCardAG getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCardAG creditCard) {
		this.creditCard = creditCard;
	}

	public ArrayList<PlanningTime> getPlanningTime() {
		return planningTime;
	}

	public void setPlanningTime(ArrayList<PlanningTime> planningTime) {
		this.planningTime = planningTime;
	}

}
