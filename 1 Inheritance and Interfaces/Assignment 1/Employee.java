
/**
 * Employee class which extends person, and has hourly wages and work hours.
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Employee extends Person {
  /**
   * Hourly wage
   */
  private double hourlyWage;
  /**
   * Time employee starts work
   */
  private LocalTime workStartTime;
  /**
   * Time employee ends work
   */
  private LocalTime workEndTime;

  /**
   * Default constructor for person
   *
   * @param firstName First name of employee
   * @param lastName  Last name of employee
   * @param ID        ID of employee
   */
  public Employee(String firstName, String lastName, String ID) {
    // call second constructor
    this(firstName, lastName, ID, 0.0, null, null);
  }

  /**
   * Constructor for person with randomly generated ID
   *
   * @param firstName First name of employee
   * @param lastName  Last name of employee
   */
  public Employee(String firstName, String lastName) {
    super(firstName, lastName);
    setFirstName(firstName);
    setLastName(lastName);
    this.hourlyWage = 0.0;
    this.workStartTime = null;
    this.workEndTime = null;
  }

  /**
   * Extended constructor with extra parameters
   *
   * @param firstName     First name of employee
   * @param lastName      Last name of employee
   * @param ID            ID of employee
   * @param hourlyWage    Hourly wage of employee
   * @param workStartTime Time employee starts work
   * @param workEndTime   Time employee ends work
   */
  public Employee(String firstName, String lastName, String ID,
                  double hourlyWage, LocalTime workStartTime,
                  LocalTime workEndTime) {
    super(firstName, lastName, ID);
    // set class variables
    this.hourlyWage = hourlyWage;
    this.workStartTime = workStartTime;
    this.workEndTime = workEndTime;
  }

  /**
   * Get the work start time
   *
   * @return Time employee starts working
   */
  public LocalTime getWorkStartTime() { return this.workStartTime; }

  /**
   * Get the work end time
   *
   * @return Time employee stops working
   */
  public LocalTime getWorkEndTime() { return this.workEndTime; }

  /**
   * Set work start time
   *
   * @param startTime Time employee starts working
   */
  public void setWorkStartTime(LocalTime startTime) {
    this.workStartTime = startTime;
  }

  /**
   * Set work end tme
   *
   * @param endTime Time employee stops working
   */
  public void setWorkEndTime(LocalTime endTime) { this.workEndTime = endTime; }

  /**
   * Get the hourly wage of the employee
   *
   * @return Time employee stops working
   */
  public double getHourlyWage() { return this.hourlyWage; }

  /**
   * Get the expected pay given the hourly wage and times
   *
   * @return Expected pay given the hourly wage and times
   */
  public double getPay() {
    return getWorkStartTime().until(getWorkEndTime(), ChronoUnit.HOURS) *
        getHourlyWage();
  }

  /**
   * Set the hourly wage
   *
   * @param hourlyWage Hourly wage of the employee
   */
  public void setHourlyWage(double hourlyWage) { this.hourlyWage = hourlyWage; }

  /**
   * Turns employee to a string to print
   *
   * @return String storing information
   */
  @Override
  public String toString() {
    // Create local to the United States
    Locale locale = new Locale("en", "US");
    // Create a formatter for money/dollars
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    // Create string builder to build the output
    StringBuilder builder = new StringBuilder();

    // Inherit parent's toString
    builder.append(super.toString());
    // store the wage
    builder.append("\nWage: ")
        .append(currencyFormatter.format(hourlyWage))
        .append(" per hour.");
    // check if time has been setup
    if (workStartTime != null && workEndTime != null) {
      // print expected work hours and pay
      builder.append("\nWork hours: ")
          .append(workStartTime)
          .append(" to ")
          .append(workEndTime);
      builder.append("\nExpected pay: ")
          .append(currencyFormatter.format(getPay()));
    }

    // return the builder
    return builder.toString();
  }
}
