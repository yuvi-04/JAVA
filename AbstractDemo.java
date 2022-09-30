package com.uv.inh;

abstract class Account
{
	long Acno;
	double balance;
	@Override
	public String toString() {
		return "Account [Acno=" + Acno + ", balance=" + balance + "]";
	}
	public long getAcno() {
		return Acno;
	}
	public void setAcno(long acno) {
		Acno = acno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(long acno, double balance) {
		super();
		Acno = acno;
		this.balance = balance;
	}
	
	abstract public void addInterest();
}

class SavingAc extends Account
{
	public SavingAc(long acno, double balance) {
		super(acno, balance);
	}

	private static double currentInterestRate=2.3;

	@Override
	public void addInterest() {
		System.out.println("adding interest to saving ac at rate " + currentInterestRate);
		balance = balance + balance * currentInterestRate/100;
	}
	
}

class LoanAc extends Account
{

	public LoanAc(long acno, double balance) {
		super(acno, balance);
	}
	@Override
	public void addInterest()
	{
		System.out.println("Charging interest to loan account");
	}
	
}

class FixedDepositAc
{
	int duration;
	double maturityAmount;
	double initialAmount;
}
public class AbstractDemo {
	public static void main(String[] args) {
		Account ac1 = new SavingAc(101,56320.5);
		Account ac2 = new LoanAc(101,56320.5);
		ac1.addInterest();
		ac2.addInterest();
		ac1.balance=5000;
	}
}
