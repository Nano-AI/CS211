/**
 * Course file to store information about different types of classes
 *
 * @author Aditya Bankoti
 * @date July 1, 2024
 */
public class Course {
  /**
   * Name of the course
   */
  private final String name;
  /**
   * ID of the course
   */
  private final String ID;

  /**
   * Constructor for course
   *
   * @param name Course name
   * @param ID   Course ID
   */
  public Course(String name, String ID) {
    this.name = name;
    this.ID = ID;
  }

  /**
   * Return the course name
   *
   * @return Course name
   */
  public String getName() { return this.name; }

  /**
   * Return Course ID
   *
   * @return Course ID
   */
  public String getID() { return this.ID; }

  /**
   * Course to String
   *
   * @return String format of course
   */
  @Override
  public String toString() {
    return String.format("{ %s, %s }", getName(), getID());
  }
}
