package com.crts.app.ldal.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LedgerDetails {
@Id
private int ledgerDetailsId;
private int customerId;
private String caseNumber;
private String loanMasterDetailsId;
private double totalAmount;
private int tenure;
private double emi;
private double advanceEmi;
private String emiStartDate;
private String emiEndDate;
private String ledgerCreatedDate;
private double ledgerDetailsEmiPaidAmount;

}
