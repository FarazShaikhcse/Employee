public class EmployeeWage{
        public static void main(String[] args) {

                System.out.println("Welcome to Employee wage Computation program");
		final int IS_FULL_TIME =1;
		final int IS_PART_TIME =2;
		int wageperhour=20,fulldayhour=0;
		int empwage=0,totalwage=0;
		for(int i=1;i<=20;i++)
		{
		int attendance=(int)Math.floor(Math.random()*10)%3;
		switch (attendance) {
			case  IS_FULL_TIME: fulldayhour=16;break;
			case IS_PART_TIME: fulldayhour=8;break;
			default: System.out.println("Employee is absent on day"+i);
		}
		empwage=fulldayhour*wageperhour ;
		totalwage+=empwage;		
		System.out.println("Employee wage for day"+i+" is "+empwage);
		}
		System.out.println("Total wage of employee: "+totalwage);
}
}

