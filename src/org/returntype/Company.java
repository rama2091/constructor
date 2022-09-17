package org.returntype;

public class Company {
	private void empId() {
		System.out.println("emp id 34562");
	}
	private int anand(int amount) {
		return amount+1000;
	}
	private int bala(int amount) {
		return amount+1000;
	}
	private String dinesh(int amount) {
		return "After one month";
	}
	private String ram(int amount) {
		return "thanks";
	}
	public static void main(String[] args) {
		Company company=new Company();
		int anand = company.anand(10000);
		int bala = company.bala(10000);
		String dinesh = company.dinesh(10000);
		company.empId();
		System.out.println("Total amount collected is "+(anand+bala));
		String ram = company.ram(anand+bala);
		System.out.println(ram);
	}
	
}
