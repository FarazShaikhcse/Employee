public class EmployeeWage{
        public static void main(String[] args) {

                System.out.println("Welcome to Employee wage Computation program");
		final int IS_FULL_TIME =1;
		
	
		double attendance=Math.floor(Math.random()*10)%2;
		if (attendance==IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent"); 
}
}
