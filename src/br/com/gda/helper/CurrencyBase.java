package br.com.gda.helper;

import java.util.ArrayList;
import java.util.List;

public class CurrencyBase {

	private String baseCode;
	private String baseCodeText;
	private List<ExchangeRate> exchangeRateGDA = new ArrayList<ExchangeRate>();

	public String getBaseCode() {
		return baseCode;
	}

	public void setBaseCode(String baseCode) {
		this.baseCode = baseCode;
	}

	public String getBaseCodeText() {
		return baseCodeText;
	}

	public void setBaseCodeText(String baseCodeText) {
		this.baseCodeText = baseCodeText;
	}

	public List<ExchangeRate> getExchangeRateGDA() {
		return exchangeRateGDA;
	}

	public void setExchangeRateGDA(List<ExchangeRate> exchangeRateGDA) {
		this.exchangeRateGDA = exchangeRateGDA;
	}

}
