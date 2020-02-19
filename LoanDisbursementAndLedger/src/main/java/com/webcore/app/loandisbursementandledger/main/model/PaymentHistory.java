package com.webcore.app.loandisbursementandledger.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class PaymentHistory {
	@Id
private int phid;
private String loanNo;
private double paymentAmount;
private String remark;
private String modeOfPayment;
private int statusCode;

public int getPhid() {
	return phid;
}
public void setPhid(int phid) {
	this.phid = phid;
}
public String getLoanNo() {
	return loanNo;
}
public void setLoanNo(String loanNo) {
	this.loanNo = loanNo;
}
public double getPaymentAmount() {
	return paymentAmount;
}
public void setPaymentAmount(double paymentAmount) {
	this.paymentAmount = paymentAmount;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public String getModeOfPayment() {
	return modeOfPayment;
}
public void setModeOfPayment(String modeOfPayment) {
	this.modeOfPayment = modeOfPayment;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}

}
