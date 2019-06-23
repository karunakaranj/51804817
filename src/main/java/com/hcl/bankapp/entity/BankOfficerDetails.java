package com.hcl.bankapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankOfficerDetails {
	@Id
	private int bankOfficerDetailsId;
	private String bankOfficerName;
	private Level levelId;

	public int getBankOfficerDetailsId() {
		return bankOfficerDetailsId;
	}

	public void setBankOfficerDetailsId(int bankOfficerDetailsId) {
		this.bankOfficerDetailsId = bankOfficerDetailsId;
	}

	public String getBankOfficerName() {
		return bankOfficerName;
	}

	public void setBankOfficerName(String bankOfficerName) {
		this.bankOfficerName = bankOfficerName;
	}

	public Level getLevelId() {
		return levelId;
	}

	public void setLevelId(Level levelId) {
		this.levelId = levelId;
	}

}
