package com.webcore.app.loandisbursementandledger.main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LedgerDetails {
@Id
private int ledgerDetailsId;
private int customerId;
private String caseNumber;

private double totalAmount;
private int tenure;
private double emi;
private double advanceEmi;
private String emiStartDate;
private String emiEndDate;
private String ledgerCreatedDate;
private double ledgerDetailsEmiPaidAmount;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="loan_disbursement_id")
private LoanDisbursementDetails loanDisbursementDetails;

public int getLedgerDetailsId() {
	return ledgerDetailsId;
}
public void setLedgerDetailsId(int ledgerDetailsId) {
	this.ledgerDetailsId = ledgerDetailsId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCaseNumber() {
	return caseNumber;
}
public void setCaseNumber(String caseNumber) {
	this.caseNumber = caseNumber;
}
public LoanDisbursementDetails getLoanDisbursementDetails() {
	return loanDisbursementDetails;
}
public void setLoanDisbursementDetailsId(LoanDisbursementDetails loanDisbursementDetails) {
	this.loanDisbursementDetails = loanDisbursementDetails;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public int getTenure() {
	return tenure;
}
public void setTenure(int tenure) {
	this.tenure = tenure;
}
public double getEmi() {
	return emi;
}
public void setEmi(double emi) {
	this.emi = emi;
}
public double getAdvanceEmi() {
	return advanceEmi;
}
public void setAdvanceEmi(double advanceEmi) {
	this.advanceEmi = advanceEmi;
}
public String getEmiStartDate() {
	return emiStartDate;
}
public void setEmiStartDate(String emiStartDate) {
	this.emiStartDate = emiStartDate;
}
public String getEmiEndDate() {
	return emiEndDate;
}
public void setEmiEndDate(String emiEndDate) {
	this.emiEndDate = emiEndDate;
}
public String getLedgerCreatedDate() {
	return ledgerCreatedDate;
}
public void setLedgerCreatedDate(String ledgerCreatedDate) {
	this.ledgerCreatedDate = ledgerCreatedDate;
}
public double getLedgerDetailsEmiPaidAmount() {
	return ledgerDetailsEmiPaidAmount;
}
public void setLedgerDetailsEmiPaidAmount(double ledgerDetailsEmiPaidAmount) {
	this.ledgerDetailsEmiPaidAmount = ledgerDetailsEmiPaidAmount;
}


}
