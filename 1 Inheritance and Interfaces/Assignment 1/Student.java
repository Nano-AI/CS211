
/**
 * Student class storing student-specific information.
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.util.ArrayList;
import java.util.Collections;

public class Student extends Person {
  /**
   * ArrayList of courses
   */
  private ArrayList<Course> courses;

  /**
   * Default constuctor
   *
   * @param firstName First name of student
   * @param lastName  Last name of student
   */
  public Student(String firstName, String lastName) {
    super(firstName, lastName);
    courses = new ArrayList<Course>();
  }

  /**
   * Parameter of student with first name, last name, and i
   *
   * @param firstName First name of student
   * @param lastName  Last name of student
   * @param ID        ID of student
   */
  public Student(String firstName, String lastName, String ID) {
    super(firstName, lastName, ID);
    courses = new ArrayList<Course>();
  }

  /**
   * Enroll into a course
   *
   * @param name Name of the course
   * @param ID   ID of the course
   */
  public void enroll(String name, String ID) {
    this.courses.add(new Course(name, ID));
  }

  /**
   * Enroll in to a course
   *
   * @param c Course object
   */
  public void enroll(Course c) { this.courses.add(c); }

  /**
   * Enroll into several courses
   *
   * @param courses Course array
   */
  public void enroll(Course[] courses) {
    Collections.addAll(this.courses, courses);
  }

  /**
   * Enroll into several courses
   *
   * @param courses Course ArrayList
   */
  public void enroll(ArrayList<Course> courses) {
    this.courses.addAll(courses);
  }

  /**
   * Student to string
   *
   * @return String version of the class
   */
  @Override
  public String toString() {
    // Create a string builder
    StringBuilder builder = new StringBuilder();

    // inherit person's toString
    builder.append(super.toString());

    // add email if it exists
    if (getEmail() != null && !getEmail().isBlank() && !getEmail().isEmpty()) {
      builder.append("\nEmail: ").append(getEmail());
    }

    // If courses aren't empty
    if (!this.courses.isEmpty()) {
      builder.append("\nCourses: ");
      // Iterate through courses
      for (Course c : this.courses) {
        // Print them to string
        builder.append(c.toString()).append(" ");
      }
    }

    // To string
    return builder.toString();
  }
}
