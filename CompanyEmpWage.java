

public class CompanyEmpWage {
	
	public final int wageperhour;
	public final String company;
	public int dailyWage;
	public int totworkinghours;
	public int totworkingdays;
	public int totalWage;

	public CompanyEmpWage(String company, int wageperhour, int workingdays, int workinghours) {
		this.company = company;
		this.wageperhour = wageperhour;
		this.totworkingdays = workingdays;
		this.totworkinghours = workinghours;

	}

	public int getDailyWage() {
		return dailyWage;
	}
	
	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}
	
	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	@Override
	public String toString() {
		return "Company[ name=" + company + "  totalWage=" + totalWage + "]";
	}
}
