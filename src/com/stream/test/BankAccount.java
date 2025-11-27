package com.stream.test;

public class BankAccount {

	private Double depositeAmt;
	private Double withdrawAmt;
	private Double balanace;

	public BankAccount(Double depositeAmt, Double withdrawAmt, Double balanace) {
		this.depositeAmt = depositeAmt;
		this.withdrawAmt = withdrawAmt;
		this.balanace = balanace;
	}

	public Double getDepositeAmt() {
		return depositeAmt;
	}

	public void setDepositeAmt(Double depositeAmt) {
		this.depositeAmt = depositeAmt;
	}

	public Double getWithdrawAmt() {
		return withdrawAmt;
	}

	public void setWithdrawAmt(Double withdrawAmt) {
		this.withdrawAmt = withdrawAmt;
	}

	public Double getBalanace() {
		return balanace;
	}

	public void setBalanace(Double balanace) {
		this.balanace = balanace;
	}

	@Override
	public String toString() {
		return "BankAccount [depositeAmt=" + depositeAmt + ", withdrawAmt=" + withdrawAmt + ", balanace=" + balanace
				+ "]";
	}

}
