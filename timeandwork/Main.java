package com.timeandwork;

public class Main {
	static double x;
	static double y;
	static double z;

	/*
	 * If A and B can do a piece of work in X and Y days respectively while working
	 * alone, they will together take time to complete it.
	 */
	static double Type1(double x, double y) {
		double workdone = x * y / (x + y);
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

	static double c_work(double x, double y, double z) {
		double c_work = (x * y * z) / ((x * y) - (y * z) - (z * x));
		return c_work;

	}

	static double B_C_work(double x, double y, double z) {
		double B_C_work = (z * x) / (x - z);
		return B_C_work;
	}

	static double A_C_work(double x, double y, double z) {

		double A_C_work = (z * y) / (y - z);
		return A_C_work;
	}

	static double A_B_work(double x, double y, double z) {
		double A_B_work = x * y / (x + y);
		return A_B_work;
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
	 * A is K times as good a worker as B and takes X days less than B to finish the
	 * work. Then the amount of time required by A and B working together is
	 * time-work k*x/k^2-1 days.
	 */
	static double Type3(double k, double x) {
		double time = (k * x) / (Math.pow(k, 2) - 1);
		return time;
	}

	/*
	 * A and B can do alone a job in x days and y days. They began the work together
	 * but z days before the completion of job, A leaves off. In how many days will
	 * the work be completed?
	 */
	static double leaving(double x, double y, double z) {
		double time = (y * (x + z)) / (x + y);
		return time;
	}
	/*A and B and C can do alone a job in x days and y days and Z days. They began the work together
	 * but z days before the completion of job, A leaves off. In how many days will
	 * the work be completed?*/
	
	
	
	
	
	
	
	

	/*
	 * A and B can do alone a job in x days and y days. They began the work together
	 * but z days before the completion of job, B leaves off. In how many days will
	 * the work be completed?
	 */

	static double leaving2(double x, double y, double z) {
		double time = (x * (y + z)) / (x + y);
		return time;
	}
	/*
	 * A and B complete a work in x days and B and C complete in y days and A and
	 * C complete in z days how many days A and B and C together to complete
	 */

	static double Type4(double x, double y, double z) {
		double totalwork = (((1 / x) + (1 / y) + (1 / z))) / 2;
		return 1 / totalwork;
	}

	/*
	 * A and B complete a work in x days and B and C complete in y days and A and
	 * C complete in z days how many days B alone to complete
	 */
	static double Type4_2(double x, double y, double z) {
		double Bwork = ((1 / x) + (1 / y) - (1 / z)) / 2;
		return 1 / Bwork;
	}

	/*
	 * A and B complete a work in x days and B and C complete in y days and A and
	 * C complete in z days how many days A alone to complete
	 */
	static double Type4_3(double x, double y, double z) {
		double totalwork = (((1 / x) - (1 / y) + (1 / z))) / 2;

		return Math.round(1 / totalwork);

	}
	/*
	 * A and B complete a work in x days and B and C complete in y days and A and C
	 * complete in z days how many days C alone to complete
	 */
	static double Type4_4(double x, double y, double z) {
		double totalwork = ((-(1 / x) +(1 / y) + (1 / z))) / 2;

		return Math.round(1 / totalwork);

	}

}
