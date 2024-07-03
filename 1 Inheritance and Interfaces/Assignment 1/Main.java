
/**
 * Main file to test the different classes and implementations.
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.time.LocalTime;

public class Main {
  public static void main(String[] args) {
    // create a college
    College college = new College("Bellevue College", 10_000.0);
    // create a student named adi
    Student adi = new Student("Aditya", "Bankoti");
    // add school email
    adi.setEmail("aditya.bankoti@bellevuecollege.edu");
    // enroll in two courses
    adi.enroll("Fundamentals of Computer Science II", "CS211");
    adi.enroll("Calculus IV", "Math&254");

    // add a student named ekam
    Student ekam = new Student("Ekam", "Singh", "654321");

    // add an employee named john
    Employee john = new Employee("John", "Doe", "000001");

    // add wage, and work hours
    john.setHourlyWage(75.80);
    john.setWorkStartTime(LocalTime.of(8, 10)); // 8:10 AM
    john.setWorkEndTime(LocalTime.of(14, 50));  // 2:50 PM

    // add people to the college
    college.addPeople(new Person[] {ekam, john, adi});

    // print college information
    System.out.println(college);
    // remove ekam from the college
    college.removePerson(ekam);
    // re-print college information
    System.out.println(college);
  }
}
