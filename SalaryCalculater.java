package Assignment_02;


//import java.util.Scanner;

public class SalaryCalculater {
  
	float basicPay;
	float pf = 0.12f;
	float monthlyGross;
	float yearlyGross;
	float yearlyTax;
	float calculatePf;
	float boa;
	float bonus;
	float taxRate =0;
	float calculateMths;
    float monthlyTax;
	//calculating pf
	 float calculatePf () {
		 float calculatePf = basicPay*pf;
		 System.out.println("The pf is "+calculatePf);
		return calculatePf;
	 }
	 
	 //calculating monthly gross
	 float monthlyGross() {
		 float monthlyGross =(basicPay+boa+bonus)-pf;
		 System.out.println("The monthly Gross is "+monthlyGross);
		 return monthlyGross;
		 
	 }
	 //calculating yearly gross
	 float yearlyGross() {
		 float yearlyGross =monthlyGross*12;
		 System.out.println("The Yearly Gross is "+yearlyGross);
		 return yearlyGross;
	 }
	 //calculating yearly tax
	 float yearlyTax() {
		 float yearlyTax = yearlyGross*taxRate;
		 System.out.println("The Yearly Tax is "+yearlyTax);
		 return yearlyTax;
	 }
	 //calculating monthly tax
	 float monthlyTax() {
		 float monthlyTax = yearlyTax/12;
		 System.out.println("The monthly Tax is "+monthlyTax);
		 return monthlyTax;
	 }
	 //calculating monthly take home SalaryCalculater
	 void calculateMths() {
		pf= calculatePf();
		monthlyGross=monthlyGross();		
		
		yearlyGross=yearlyGross();
		taxRate = taxRate();
		yearlyTax=yearlyTax();
		monthlyTax=monthlyTax();
		calculateMths = monthlyGross-monthlyTax;
		 		 
	 }
	 		 
	  float taxRate() {
		 if (yearlyGross >250000) {
			  taxRate =0.05f;
			 
		 } 
		 if(yearlyGross>500000) {
			 taxRate =0.2f;
		 }
		 	 
		return taxRate;
	}

	public static void main(String[] args) {
		 SalaryCalculater emp1 = new SalaryCalculater();
		 emp1.basicPay = 7000;
		 emp1.boa = 5000;
		 emp1.bonus = 2000;
		emp1.calculateMths();
		System.out.println("The monthly take home Salary of employee1 is "+emp1.calculateMths);
		 
		SalaryCalculater emp2 = new SalaryCalculater();
		 emp2.basicPay= 10000;
		 emp2.boa = 7000;
		 emp2.bonus = 2500;
		emp2.calculateMths();
		System.out.println("The monthly take home Salary of employee2 is "+emp2.calculateMths);
		 
		SalaryCalculater emp3 = new SalaryCalculater();
		 emp3.basicPay = 12000;
		 emp3.boa = 9000;
		 emp3.bonus = 3000;
		emp3.calculateMths();
		System.out.println("The monthly take home Salary of employee3 is "+emp3.calculateMths);
		 
		SalaryCalculater emp4 = new SalaryCalculater();
		 emp4.basicPay = 15000;
		 emp4.boa = 17000;
		 emp4.bonus = 4000;
		emp4.calculateMths();
		System.out.println("The monthly take home Salary of employee is "+emp4.calculateMths);
		 	 
		
	}
}
	 
	 
	 
	 
		 
		 
	 
	 




