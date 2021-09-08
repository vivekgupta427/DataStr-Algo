package datastructure.hackerrank;

import java.util.Date;
import java.util.Scanner;

public class CalendarFindDayOfADate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String dateString = sc.nextLine();
		String[] split = dateString.split(" ");

		int month = Integer.parseInt(split[0]);
		int date = Integer.parseInt(split[1]);
		int year = Integer.parseInt(split[2]);
		
		Date date1 = new Date(year-1, month-1,date-1);
		int DayOfWeek = date1.getDay();
		switch (DayOfWeek) {
		case 0:
			System.out.println("SUNDAY");
			break;
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("WEDNESDAY");
			break;
		case 3:
			System.out.println("THURSDAY");
			break;
		case 4:
			System.out.println("FRIDAY");
			break;
		case 5:
			System.out.println("SATURDAY");
			break;
		}
		
		sc.close();
	}

}
