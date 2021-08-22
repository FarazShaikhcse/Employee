public class EmployeeWage{
        public static void main(String[] args) {

                System.out.println("Welcome to Employee wage Computation program");
		final int IS_FULL_TIME =1;
		final int IS_PART_TIME =2;
		int wageperhour=20,fulldayhour=0,totworkinghours=0,totworkingdays=0;
		int empwage=0,totalwage=0;
		while(totworkinghours<100||totworkingdays<20)
		{
		int attendance=(int)Math.floor(Math.random()*10)%3;
		switch (attendance) {
			case  IS_FULL_TIME: fulldayhour=16; totworkingdays+=1; break;
			case IS_PART_TIME: fulldayhour=8; totworkingdays+=1; break;
			default: fulldayhour=0; break;
		}
		empwage=fulldayhour*wageperhour ;
		totalwage+=empwage;
		totworkinghours+=fulldayhour;		
		System.out.println("Employee wage for day is "+empwage);
		}
		System.out.println("Total wage of employee: "+totalwage);
}
}

