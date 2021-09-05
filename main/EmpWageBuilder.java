package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmpWageBuilder implements EmpWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;

	private List<CompanyEmpWage> companywage;

	EmpWageBuilder() {
		companywage = new ArrayList<>();
	}

	/**
	 * @param company
	 * @param wagePerHour
	 * @param maxHoursPerMonth
	 * @param maxDaysPerMonth
	 * this method creates new company employee wage object when new employee is added
	 */
	public void addCompanyEmpWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {
		companywage.add(new CompanyEmpWage(company, wagePerHour, maxHoursPerMonth, maxDaysPerMonth));
		numOfCompany += 1;
		
	}

	/**
	 * this method calculates the total wage for each company employees
	 */
	public void calculateWage() {

		for (CompanyEmpWage company: companywage) {
			int empWage, totalHours, totalDays, empHour;
			empWage = totalHours = totalDays = empHour = 0;

			while (totalHours < company.totworkinghours && totalDays < company.totworkingdays) {
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
				System.out.println("Day " + totalDays + " Working hours: " + empHour);

			}
			company.setTotalWage(totalHours * company.wageperhour);
			System.out.println(company + "\n");
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation program");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of companies");
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the company name:");
			String name = scanner.next();
			System.out.println("Enter the wage per hour:");
			int wage = scanner.nextInt();
			System.out.println("Enter the number of working days:");
			int days = scanner.nextInt();
			System.out.println("Enter the number of working hours per month:");
			int hours = scanner.nextInt();
			empWageBuilder.addCompanyEmpWage(name, wage, hours, days);
			empWageBuilder.calculateWage();
		}

	}
}
