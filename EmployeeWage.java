public class EmployeeWage{
        public static void main(String[] args) {

                System.out.println("Welcome to Employee wage Computation program");
		final int IS_FULL_TIME =1;
		final int IS_PART_TIME =2;
		int wageperhour=20;
		int fulldayhour=0,empwage=0;
	
		double attendance=Math.floor(Math.random()*10)%3;
		if (attendance==IS_FULL_TIME)
		{
			fulldayhour=16;
		}
		else if(attendance==IS_PART_TIME)
		{
			fulldayhour=8;
		}
		else
		{
			System.out.println("Employee is absent");
		}
		empwage=fulldayhour*wageperhour ;
				
		System.out.println("Employee wage= "+empwage);
}
}

