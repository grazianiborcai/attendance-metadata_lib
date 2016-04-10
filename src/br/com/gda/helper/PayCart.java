package br.com.gda.helper;

import java.util.ArrayList;

import moip.sdk.api.CreditCard;

public class PayCart {

	// private CreditCardAG creditCard;
	private CreditCard creditCard;
	private ArrayList<PlanningTime> planningTime = new ArrayList<PlanningTime>();

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public ArrayList<PlanningTime> getPlanningTime() {
		return planningTime;
	}

	public void setPlanningTime(ArrayList<PlanningTime> planningTime) {
		this.planningTime = planningTime;
	}

	public boolean isComplete() {
		return creditCard.getHash() != null && creditCard.getHolder() != null
				&& creditCard.getHolder().getFullname() != null && creditCard.getHolder().getBirthDate() != null
				&& creditCard.getHolder().getTaxDocument() != null
				&& creditCard.getHolder().getTaxDocument().getType() != null
				&& creditCard.getHolder().getTaxDocument().getNumber() != null;
	}

}
