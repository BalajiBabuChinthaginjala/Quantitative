package ChainRule;

public class TimeandWork {

	public static void main(String[] args) {

		double Type1 = Type1(30, 15);
		System.out.println(Type1);
		System.out.println();
		double result1 = Type1(30, 15, 10);
		System.out.println(result1);
		System.out.println();
		 Type2(6, 8, 3);
		 System.out.println();
		double result3=Type3(3, 60);

		System.out.println(result3);
		System.out.println();
		double leaving=leaving(6, 12, 3);
		System.out.println(leaving);
		System.out.println();
		System.out.println(leaving2(18, 15, 10));
	}

	/*
	 * If A and B can do a piece of work in X and Y days respectively while working
	 * alone, they will together take time to complete it.
	 */
	static double Type1(double x, double y) {
		double workdone = x * y / (x + y);
		return workdone;
	}

	/*
	 * If A , B , C can do a piece of work in X , Y , Z days respectively while
	 * working alone , they will together take time to finish it
	 */
	static double Type1(double x, double y, double z) {
		double workdone = x * y * z / ((x * y) + (y * z) + (z * x));
		return workdone;

	}

	/*
	 * If A can finish work in X days and B in Y days and A, B and C together in S
	 * day then :
	 * 
	 * C can finish work alone in
	 * 
	 * B + C can finish in time
	 * 
	 * A + C can finish in time
	 */
	static void Type2(double x, double y, double z) {
		double c_work = (x * y * z) / ((x * y) - (y * z) - (z * x));
		double B_C_work = (z * x) / (x - z);
		double A_C_work = (z * y) / (y - z);
		double A_B_work=  x * y / (x + y);
		System.out.println("C alone finish the work in:" + c_work + "days");
	    System.out.println("A and B can finish the work in: "+A_B_work);
		System.out.println("B and c can finish the work in:" + B_C_work + "days");
		System.out.println("A and C can finish the work in: " + A_C_work + "days");

	}
	/*
	 * A is K times as good a worker as B and takes X days less than B to finish the
	 * work. Then the amount of time required by A and B working together is
	 * time-work k*x/k^2-1 days.
	 */
	static double Type3(double k,double x) {
		double time=(k*x)/(Math.pow(k, 2)-1);
		return time;
	}
	/* A and B can do alone a job in x days and y days. They began the work together but z days
	 *  before the completion of job, A leaves off. In how many days will the work be completed?*/
	static double leaving(double x,double y,double z) {
		double time=(y*(x+z))/(x+y);
		return time;
	}
	/* A and B can do alone a job in x days and y days. They began the work together but z days
	 *  before the completion of job, B leaves off. In how many days will the work be completed?*/

	static double leaving2(double x,double y,double z) {
		double time=(x*(y+z))/(x+y);
		return time;
	}
}
