package com.webcore.app.loandisbursementandledger.main.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmiPaymentDetails {
@Id
private int emiPaymentId;
private int loanNo;
private double emiAmount;
private double totalAmount;
private String emiLastDate;
private double emiPaidAmount;
private String emiPaidDate;
public int getEmiPaymentId() {
	return emiPaymentId;
}
public void setEmiPaymentId(int emiPaymentId) {
	this.emiPaymentId = emiPaymentId;
}
public int getLoanNo() {
	return loanNo;
}
public void setLoanNo(int loanNo) {
	this.loanNo = loanNo;
}
public double getEmiAmount() {
	return emiAmount;
}
public void setEmiAmount(double emiAmount) {
	this.emiAmount = emiAmount;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public String getEmiLastDate() {
	return emiLastDate;
}
public void setEmiLastDate(String emiLastDate) {
	this.emiLastDate = emiLastDate;
}
public double getEmiPaidAmount() {
	return emiPaidAmount;
}
public void setEmiPaidAmount(double emiPaidAmount) {
	this.emiPaidAmount = emiPaidAmount;
}
public String getEmiPaidDate() {
	return emiPaidDate;
}
public void setEmiPaidDate(String emiPaidDate) {
	this.emiPaidDate = emiPaidDate;
}


}
