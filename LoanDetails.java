package MiniProject;

import java.util.HashMap;

import org.springframework.stereotype.Component;


public class LoanDetails {

	private String loan_type;
	private float amount;
	private int duration;
	private String roi;
	private int creditScore;
	private float income;
	private HashMap<String,Float> assets = new HashMap<String,Float>();
	private HashMap<String,Float> liabilities = new HashMap<String,Float>();
	
	
	@Override
	public String toString() {
		return "LoanDetails [loan_type=" + loan_type + ", amount=" + amount + ", duration=" + duration + ", assets="
				+ assets + ", liabilities=" + liabilities + "]";
	}

	

	public String getRoi() {
		return roi;
	}
	
	public void setRoi(String roi) {
		this.roi = roi;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public float getIncome() {
		return income;
	}

	public void setIncome(float income) {
		this.income = income;
	}

	public String getLoan_type() {
		return loan_type;
	}


	public String setLoan_type(String loan_type) {
		this.loan_type = loan_type;
		return "";
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public HashMap<String, Float> getAssets() {
		return assets;
	}


	public void setAssets(HashMap<String, Float> assets) {
		this.assets = assets;
	}


	public HashMap<String, Float> getLiabilities() {
		return liabilities;
	}


	public void setLiabilities(HashMap<String, Float> liabilities) {
		this.liabilities = liabilities;
	}

	
}
