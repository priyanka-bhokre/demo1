package com.crts.app.ldal.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmaiPaymentDetails {
@Id
private int emiPaymentId;
private int loanNo;
private double emiAmount;
private double totalAmount;
private String emiLastDate;
private double emiPaidAmount;
private String emiPaidDate;


}
