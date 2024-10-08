//create account with no,name,balance,create an arrayList to store the 6 objects of account obj display all objects



package assignment1;

public class Class {
	private int accNo;
	   private String name;
	   private double balance;
	public Class() {
		accNo=0;
		name=null;
		balance=0.0;
	}
	public Class(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Class [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	   
	   
}
