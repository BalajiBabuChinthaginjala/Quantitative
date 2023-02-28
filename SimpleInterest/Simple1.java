package SimpleInterest;

import java.util.Scanner;

public class Simple1 {

	public static void main(String[] args) {

		double principle, roi, time, si;

		Scanner sc = new Scanner(System.in);

		System.out.println("1.To Find Simple Interest");
		System.out.println("2.To Find Principle amount");
		System.out.println("3.To Find Rate of Interest");
		System.out.println("4.To Find Time years");
		System.out.println("5.To find rate of interest using si1,t1,si2,t2");
		System.out.println("6.AT wahat rate sum wull double in t years");
		
		System.out.println();

		System.out.println("enter your chice");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter principle amount");
			principle = sc.nextInt();
			System.out.println("enter rate of interest");
			roi = sc.nextInt();
			System.out.println("enter time in years");
			double years = sc.nextInt();
			System.out.println("enter time in months");
			double months = sc.nextInt();
			System.out.println("enter time in days");
			double days = sc.nextInt();

			time = years + months / 12.0 + days / 365;
			System.out.println("Simple Interest=" + " principle*rateofinterest*time/100");
			System.out.println("simple interst=" + principle + "*" + roi + "*" + time + "/" + 100);
			double simpleinterest = (principle * time * roi) / 100;
			System.out.println("Simple interest= RS  " + simpleinterest);

			break;

		case 2:
			System.out.println("enter Simple Interest amount");
			si = sc.nextInt();
			System.out.println("enter rate of interest");
			roi = sc.nextInt();
			System.out.println("enter time in years");
			years = sc.nextInt();
			System.out.println("enter time in months");
			months = sc.nextInt();
			System.out.println("enter time in days");
			days = sc.nextInt();

			time = years + months / 12.0 + days / 365;
			System.out.println("Principal amount=100*simpleinterest/time*rateofinterest");
			System.out.println(100 + "*" + si + "/" + roi + "*" + time);

			double Amount = (100 * si) / (roi * time);
			System.out.println("Principal Amount= RS" + Amount);

			break;

		case 3:
			System.out.println("enter principle amount");
			principle = sc.nextInt();
			System.out.println("enter simple interest");
			si = sc.nextInt();
			System.out.println("enter time in years");
			years = sc.nextInt();
			System.out.println("enter time in months");
			months = sc.nextInt();
			System.out.println("enter time in days");
			days = sc.nextInt();

			time = years + months / 12.0 + days / 365;
			System.out.println();

			System.out.println("R=100*si/P*T");
			System.out.println("R=" + 100 + "*" + si + "/" + principle + "*" + time);

			double RateofInterrest = (100 * si) / (principle * time);
			System.out.println("Interest rate =" + RateofInterrest + "%" + "  PA");

			break;
		case 4:
			System.out.println("enter simple interest");
			si = sc.nextInt();
			System.out.println("enter principle amount");
			principle = sc.nextInt();
			System.out.println("enter rate of interest");
			roi = sc.nextDouble();

			System.out.println("T=100*SI/P*R");
			System.out.println("T=" + 10 + "*" + si + "/" + principle * roi);

			double timetaken = (100 * si) / (principle * roi);
			System.out.println("Total time to get " + si + "   :" + timetaken + "years");

			break;
		case 5:
			System.out.println("enter first SI value");
			double si1=sc.nextDouble();
			System.out.println("enter first time in years");
			double t1=sc.nextDouble();
			System.out.println("enter second SI value");
			double si2=sc.nextDouble();
			System.out.println("eneter second time in years ");
			double t2=sc.nextDouble();
			double rate=rate(si1, si2, t1, t2);
			System.out.println("The rate of interest is: "+rate+" %");
			break;
		case 6:
			System.out.println("enter time in years");
		    time=sc.nextDouble();
		    double ROI=rate(time);
			System.out.println(ROI);
			

		default:
			System.out.println("********you chosed wrong value**********");
			System.out.println("enter correct value:");

		}
		
		sc.close();
	}
	static double rate (double si1,double si2,double t1,double t2) {
		
		double si_difference=si2-si1;
		double time_difference=t2-t1;
		
		double oneyear_si=si_difference/time_difference;
		double amount1=oneyear_si*t1;
		
		double principle=si1-amount1;
		double rate=(100*oneyear_si)/principle;
		System.out.println("The Principle amount is:"+(si1-amount1));
		return rate;	
	}
	static double rate(double time) {
		double rate1=100/time;
		return rate1;
		
		
	}
	
	
}
