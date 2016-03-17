package br.com.gda.helper;

public class ExchangeRate {

	private String targetCode;
	private String targetCodeText;
	private Double factor;

	public String getTargetCode() {
		return targetCode;
	}

	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}

	public String getTargetCodeText() {
		return targetCodeText;
	}

	public void setTargetCodeText(String targetCodeText) {
		this.targetCodeText = targetCodeText;
	}

	public Double getFactor() {
		return factor;
	}

	public void setFactor(Double factor) {
		this.factor = factor;
	}

}
