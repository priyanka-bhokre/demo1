package com.crts.app.ldal.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanDisbursementDetails {
@Id
private int loanDisbursementId;
private int loanMasterDetailsId;
private int loanNo;
private double loanAmount;
private int tenure;
private double emi;
private int statusCode;

}
