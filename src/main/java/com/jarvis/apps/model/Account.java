package com.jarvis.apps.model;

import java.util.Date;

abstract class Account {
	
    private Date date;
	
	private String transactionDesc;
	
	private String category;
	
	private float debit;
	
	private float credit;
	
	private float balance;
	
	private long invoiceNumber;
	
	private String from;
	
	private String to;
	
	private String reference;

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTransactionDesc() {
		return transactionDesc;
	}

	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getDebit() {
		return debit;
	}

	public void setDebit(float debit) {
		this.debit = debit;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Account [date=" + date + ", transactionDesc=" + transactionDesc + ", category=" + category
				+ ", debit=" + debit + ", credit=" + credit + ", balance=" + balance + ", invoiceNumber="
				+ invoiceNumber + ", from=" + from + ", to=" + to + ", reference=" + reference + "]";
	}
	

}
