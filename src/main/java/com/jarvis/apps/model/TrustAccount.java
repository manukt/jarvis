package com.jarvis.apps.model;


public class TrustAccount extends Account {
	
	private static enum AccountType {
		TRUST_MANAGEMENT("trust_management"),
		EVENT("event"),
		PAYABLE("payable"),
		RECEIVABLE("receivable"),
		OTHERS("others");
		
		private String type;
		
		private AccountType(String type){
			this.type = type;
		}
		
		public String getType(){
			return this.type;
		}
	}
	
	private AccountType accountType;

	public TrustAccount(AccountType accountType) {
		super();
		this.accountType = accountType;
	}

	public AccountType getAccountType() {
		return accountType;
	}

}
