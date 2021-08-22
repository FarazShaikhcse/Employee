public class EmployeeWage{
        public static void main(String[] args) {

                System.out.println("Welcome to Employee wage Computation program");
		final int IS_FULL_TIME =1;
		final int IS_PART_TIME =2;
		int wageperhour=20;
		int fulldayhour=0,empwage=0;
	
		int attendance=(int)Math.floor(Math.random()*10)%3;
		switch (attendance) {
			case  IS_FULL_TIME: fulldayhour=16;break;
			case IS_PART_TIME: fulldayhour=8;break;
			default: System.out.println("Employee is absent");
		}
		empwage=fulldayhour*wageperhour ;
				
		System.out.println("Employee wage= "+empwage);
}
}

