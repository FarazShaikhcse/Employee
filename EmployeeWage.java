import java.util.Scanner;

public class EmployeeWage {

	final int wageperhour;
	private final String company;
	int totworkinghours;
	int totworkingdays;
	int empwage;


	public EmployeeWage(String company, int wageperhour, int workingdays, int workinghours)
	{
		this.company = company;
		this.wageperhour = wageperhour;
		this.totworkingdays = workingdays;
		this.totworkinghours = workinghours;
	
	}


	public void calculateWage() {
		
		empwage = totworkinghours * wageperhour;
		
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation program");

		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of companies");
		n = scanner.nextInt();
		EmployeeWage empwage[] = new EmployeeWage[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the company name:");
			String name = scanner.next();
			System.out.println("Enter the wage per hour:");
			int wage = scanner.nextInt();
			System.out.println("Enter the number of working days:");
			int days = scanner.nextInt();
			System.out.println("Enter the number of working hours per month:");
			int hours = scanner.nextInt();
			empwage[i] = new EmployeeWage(name,wage,days,hours);
			empwage[i].calculateWage();
			
		}
		for(int i=0;i<n;i++) {
			System.out.println("Company details:");
			System.out.println("Name: "+empwage[i].company);
			System.out.println("Wage per hour: " +empwage[i].wageperhour);
			System.out.println("Number of working days: "+empwage[i].totworkingdays);
			System.out.println("Number of working hours per month: "+empwage[i].totworkinghours);
			System.out.println("Total wage of employee of the company "+empwage[i].company+ " is "+empwage[i].empwage);
		}

	}
}
