package com.java8.payment;

public class Payment {

	String paymentId;
	double amount;
	String status;
	String referenceId;
	
	public Payment(String paymentId, double amount, String status, String referenceId) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.status = status;
		this.referenceId = referenceId;
	}
	
	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", status=" + status + ", referenceId="
				+ referenceId + "]";
	}

	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
