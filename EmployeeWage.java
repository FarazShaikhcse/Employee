public class EmployeeWage{
		
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int wageperhour = 20;
		int fulldayhour;
		int totworkinghours; 
		int totworkingdays;
		int empwage;
		int totalwage;
		
		public EmployeeWage() {
			
			totworkinghours = 0;
			totworkingdays = 0;
			totalwage = 0;
			
		}
		public void empAttendance() {
			int attendance=(int)Math.floor(Math.random()*10)%3;
			switch (attendance) {
				case  IS_FULL_TIME: fulldayhour = 16; 
									totworkingdays += 1; 
									break;
									
				case IS_PART_TIME: fulldayhour = 8; 
								   totworkingdays += 1; 
								   break;
								   
				default: fulldayhour=0; 
						 break;
			}
			totworkinghours += fulldayhour;
		}
		public void calculateWage() {
			empwage = fulldayhour * wageperhour ;
			totalwage += empwage;
			totworkinghours += fulldayhour;		
			System.out.println("Employee wage for day is "+empwage);
		}
        public static void main(String[] args) {

        System.out.println("Welcome to Employee wage Computation program");
		
		EmployeeWage emp = new EmployeeWage();
		
		while(emp.totworkinghours<100 || emp.totworkingdays<20)
		{
			emp.empAttendance();
			emp.calculateWage();
		}
		
		
		System.out.println("Total wage of employee: "+emp.totalwage);
}
}

