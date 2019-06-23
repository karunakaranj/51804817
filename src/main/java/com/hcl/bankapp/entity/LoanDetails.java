package com.hcl.bankapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanDetailsId;
	private String loanAccountNumber;
	private String loanStatus;
	private long loanAmount;
	private BankOfficerDetails approvingManagerId;

	public int getLoanDetailsId() {
		return loanDetailsId;
	}

	public void setLoanDetailsId(int loanDetailsId) {
		this.loanDetailsId = loanDetailsId;
	}

	public String getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(String loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BankOfficerDetails getApprovingManagerId() {
		return approvingManagerId;
	}

	public void setApprovingManagerId(BankOfficerDetails approvingManagerId) {
		this.approvingManagerId = approvingManagerId;
	}

}
