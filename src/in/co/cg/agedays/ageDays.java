package in.co.cg.agedays;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import javax.xml.bind.ValidationException;

//THis class find number of days that a person has lived
public class ageDays {
	public long daysAlive(String inputDate) throws ValidationException {

		String arrDate[] = inputDate.split("/");

		int day, days, years, months, month, year;
		day = Integer.parseInt(arrDate[0]);
		month = Integer.parseInt(arrDate[1]);
		year = Integer.parseInt(arrDate[2]);

		Period p;
		if (day > 31 || day < 1 || month < 1 || month > 12 || year < 0) {
			throw new ValidationException("Inavlid Date");// throw ValidationException
		} else {
			LocalDate today, dob;
			today = LocalDate.now();
			dob = LocalDate.of(year, Month.of(month), day);
			p = Period.between(dob, today); // Difference Period between two dates
		}

		return (long) (p.toTotalMonths() * 30.4362934 + p.getDays());
//		return months;
	}
}
