import java.util.Scanner;

public class EmployeeWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public final int wageperhour;
	public final String company;
	public int totworkinghours;
	public int totworkingdays;
	public int totalWage;


	public EmployeeWage(String company, int wageperhour, int workingdays, int workinghours)
	{
		this.company = company;
		this.wageperhour = wageperhour;
		this.totworkingdays = workingdays;
		this.totworkinghours = workinghours;
	
	}


	public void calculateWage() {
		
		int empWage, totalHours, totalDays, empHour;
		empWage = totalHours = totalDays = empHour = 0;

		while (totalHours < totworkinghours && totalDays < totworkingdays) {
			totalDays += 1;
			int attendance = (int) Math.floor(Math.random() * 10) % 3;

			switch (attendance) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
			case IS_PART_TIME:
				empHour = 4;
				break;
			default:
				empHour = 0;
			}
			totalHours += empHour;
			System.out.println("Day "+totalDays+ " Working hours: "+empHour);

		}
		empWage = wageperhour * totalHours;
		totalWage += empWage;
		
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
			
			
		}
		for(int i=0;i<n;i++) {
			System.out.println("Company details:");
			System.out.println("Name: "+empwage[i].company);
			System.out.println("Wage per hour: " +empwage[i].wageperhour);
			System.out.println("Number of working days: "+empwage[i].totworkingdays);
			System.out.println("Number of working hours per month: "+empwage[i].totworkinghours);
			empwage[i].calculateWage();
			System.out.println("Total wage of employee of the company "+empwage[i].company+ " is "+empwage[i].totalWage);
		}

	}
}
