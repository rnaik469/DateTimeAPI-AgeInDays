package in.co.cg.agedays;

import java.util.Scanner;

import javax.xml.bind.ValidationException;

//test class for ageDays
public class Test {
	public static void main(String[] args) {
		ageDays days = new ageDays();
		Scanner get = new Scanner(System.in);
		System.out.println("Enter any date in (dd/MM/yyyy) format: ");
		String inputDate = get.next();// input date
		try {
			System.out.println("You have been alive for: " + days.daysAlive(inputDate) + " days");
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}
}
