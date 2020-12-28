package day9;
public class TestEmployee{
	public static void main(String[] args){

	}
}

class Employee{
    private String name;
    private int birthMonth;

    public Employee(String name,int birthMonth){
    	super();
    	this.name=name;
    	this.birthMonth = birthMonth;
    }

   public double getSalary(int month){
   	 if(this.birthMonth==month) return 100;
   	 return 0;
   }

}

class SalariedEmployee extends Employee{
     private double salary;
     public SalariedEmployee(String name,int birthMonth,double salary){

        super(name,birthMonth);
     	this.salary=salary;
     }
    
    public double getSalary(int month){
    	return this.salary +super.getSalary(month);  
    }

}

class HourlyEmployee extends Employee{
    private double salaryPerHour;
    private int hours;

    public HourlyEmployee(String name,int birthMonth,double salaryPerHour,int hours){
    	super(name,birthMonth);
    	this.salaryPerHour =salaryPerHour;
    	this.hours = hours;
    }

    public double getSalary(int month){    	
    	return this.salaryPerHour * hours +super.getSalary(month);
    }

}

class SalesEmployee extends Employee{
    private int sales;
    private int rate;
    public SalesEmployee(String name,int birthMonth,double sales,int rate){
    	super(name,birthMonth);
    	this.sales =sales;
    	this.rate = rate;
    }

    public double getSalary(int month){    	
    	return this.sales*this.rate  +super.getSalary(month);
    }

}

class BasedPlusSalesEmployee extends SalesEmployee{
    private double basedSalary;
    public SalesEmployee(String name,int birthMonth,double sales,int rate,double basedSalary){
    	super(name,birthMonth,sales,rate);
    	this.basedSalary =basedSalary;
    }
    public double getSalary(int month){    	
    	return this.basedSalary  +super.getSalary(month);
    }
}