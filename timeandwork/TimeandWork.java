package com.timeandwork;

import java.util.Scanner;

public class TimeandWork {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1.If A and B can do a piece of work in X and Y days respectively while alone, they will together take time to complete it");
		System.out.println();
		System.out.println();
		System.out.println("2.If A , B , C can do a piece of work in X , Y , Z days respectively while\r\n"
				+ "working alone , they will together take time to finish it");
		System.out.println();
		System.out.println();
		System.out.println("3.If A can finish work in X days and B in Y days and A, B and C together in  day then :");

		System.out.println();
		System.out.println();
		System.out.println("4.A is K times as good a worker as B and takes X days less than B to finish the\r\n"
				+ " work. Then the amount of time required by A and B working together is");
		System.out.println();
		System.out.println();
		System.out.println("5.A and B can do alone a job in x days and y days. They began the work together\r\n"
				+ " but z days before the completion of job, A or B leaves off. In how many days will\r\n"
				+ "	the work be completed?");
		System.out.println();
		System.out.println();
		System.out.println("6.If x people can do W1 work in D1 days while putting in H1 hours per day,\r\n"
				+ "  and if x people can complete W2 work in D2 days while putting in H2 hours per day,\r\n"
				+ "	 then the relationship between them will be. P1D1H1W2 = P2D2H2W1... ");
		System.out.println();
		System.out.println();
		System.out
				.println("7.if m1 men or w1 women can do a work in d1 days ,then in how many days will m2 men and,\r\n"
						+ " w2 women do the same work");
		System.out.println();
		System.out.println();
		System.out.println(
				"8.A and B compleate a work in x days and B and C compleate in y days and A and C compleate in z days\r\n"
						+ " how many days A and B and C together to compleate");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter A alone work");
			double x = sc.nextInt();
			System.out.println("enter B alone work");
			double y = sc.nextInt();
			double work = Main.Type1(x, y);
			System.out.println("A and B together can compleat in :" + work + " days");
			break;

		case 2:
			System.out.println("enter A alone work:");
			double A = sc.nextInt();
			System.out.println("enter B alone work:");
			double B = sc.nextInt();
			System.out.println("enter C alone work:");
			double C = sc.nextInt();
			double work1 = Main.Type1(A, B, C);
			System.out.println("A , B and C together can compleat in :" + work1 + " days");
			break;
		case 3:
			System.out.println("enter A alone work:");
			double A1 = sc.nextInt();
			System.out.println("enter B alone work:");
			double B1 = sc.nextInt();
			System.out.println("enter A+B+C work:");
			double C1 = sc.nextInt();

			System.out.println("1.C alone work");
			System.out.println("2.B_C work");
			System.out.println("3.A_C work");
			System.out.println("4.A_B work");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				double cwork = Main.c_work(A1, B1, C1);
				System.out.println("C alone can do in: " + cwork + " days");
				break;
			case 2:
				double B_Cwork = Main.B_C_work(A1, B1, C1);
				System.out.println("B and C compleat the work in: " + B_Cwork + " days");
				break;
			case 3:
				double A_Cwork = Main.A_C_work(A1, B1, C1);
				System.out.println("A and C compleat the work in: " + A_Cwork + " days");
				break;

			case 4:
				double A_Bwork = Main.A_B_work(A1, B1, C1);
				System.out.println("A and B compleat the work in: " + A_Bwork + " days");
				break;
			}
			break;
		case 4:
			System.out.println("Enter the A is how times better than B");
			double k = sc.nextDouble();
			System.out.println("Enter how many days less than B");
			double k1 = sc.nextDouble();
			double result = Main.Type3(k, k1);
			System.out.println("total time taken to compleat the work By A and B is: " + result + " days");
			break;
		case 5:
			System.out.println("enter A alone work");
			double A2 = sc.nextDouble();
			System.out.println("enter B alone work");
			double B2 = sc.nextDouble();
			System.out.println("Enter how many days before completion A/B leaves ");
			double C2 = sc.nextDouble();
			System.out.println("1.A leaves");
			System.out.println("2.B leaves");
			int choice1 = sc.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("Total days to compleat the work is: " + Main.leaving(A2, B2, C2) + " days");
				break;
			case 2:
				System.out.println("Total days to compleat the work is: " + Main.leaving2(A2, B2, C2) + " days");
				break;
			}
			break;
		case 6:
			ChainRule.main(args);
		case 7:
			System.out.println("enter value for no of mans");
			double m1 = sc.nextDouble();
			System.out.println("Enter value for no of womens/boys");
			double w1 = sc.nextDouble();
			System.out.println("enter value for no days take to compleat");
			double d1 = sc.nextDouble();
			System.out.println("enter no of mens to do the work");
			double m2 = sc.nextDouble();
			System.out.println("enter no of womens to do work");
			double w2 = sc.nextDouble();
			double result1 = ChainRule.type1(m1, w1, d1, m2, w2);
			System.out.println("The total no of days to compleat the work by " + m2 + " men and " + w2 + " women is: "
					+ result1 + " days");
			break;
		case 8:
			System.out.println("Enter Work of A and B");
			double x1 = sc.nextDouble();
			System.out.println("Enter Work of B and C");
			double y1 = sc.nextDouble();
			System.out.println("Enter work of A and C");
			double z1 = sc.nextDouble();
			System.out.println("1.A and B and C together to complete ");
			System.out.println("2.A alone to complete");
			System.out.println("3.B alone to complete");
			System.out.println("4.C alone to complete");

			int choice2 = sc.nextInt();
			switch (choice2) {
			case 1:
				System.out.println(Main.Type4(x1, y1, z1));
				break;
			case 2:
				System.out.println(Main.Type4_3(x1, y1, z1));
				break;
			case 3:
				System.out.println(Main.Type4_2(x1, y1, z1));
				break;
			case 4:

				System.out.println(Main.Type4_4(x1, y1, z1));
			default:
				System.out.println("enter wrong choice");

			}

			break;

		default:
			System.out.println("PLEASE ENTER VALID INPUT");

		}

		sc.close();

	}
}
