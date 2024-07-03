import java.util.UUID;

/**
 * Base person class which stores several parameters
 *
 * @author Aditya Bankoti
 * @date July 1, 2024
 */
public class Person implements PersonInterface {
  /**
   * First name of the person
   */
  private String firstName;
  /**
   * Last name of person
   */
  private String lastName;
  /**
   * ID of class
   */
  private final String ID;
  /**
   * Email of person
   */
  private String email;

  /**
   * Constuctor for a person with a randomly generated ID
   *
   * @param firstName First name of person
   * @param lastName  Last name of person
   */
  public Person(String firstName, String lastName) {
    // randomly generate a UUID and pass it into the class
    this(firstName, lastName, UUID.randomUUID().toString());
  }

  /**
   * Default constructor of person with wanted ID
   *
   * @param firstName First name of person
   * @param lastName  Last name of person
   * @param ID        ID of person
   */
  public Person(String firstName, String lastName, String ID) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ID = ID;
  }

  /**
   * Get person id
   *
   * @return Id of person
   */
  public String getID() { return this.ID; }

  /**
   * Set the last name of person
   *
   * @param lastName last name of person
   */
  public void setLastName(String lastName) { this.lastName = lastName; }

  /**
   * Get last name of person
   *
   * @return Last name of person
   */
  public String getLastName() { return this.lastName; }

  /**
   * Set first name of person
   *
   * @param firstName First name of person
   */
  public void setFirstName(String firstName) { this.firstName = firstName; }

  /**
   * Get first name of person
   *
   * @return First name of person
   */
  public String getFirstName() { return this.firstName; }

  /**
   * Set email of person
   *
   * @param email Email of person
   */
  public void setEmail(String email) { this.email = email; }

  /**
   * Get email of person
   *
   * @return Email of person
   */
  public String getEmail() { return this.email; }

  /**
   * Person to string
   *
   * @return String formatted version of person
   */
  @Override
  public String toString() {
    // create string builder
    StringBuilder builder = new StringBuilder();

    // add first last name
    builder.append(String.format("%s, %s ", getLastName(), getFirstName()));

    // add email if it exists
    if (getEmail() != null && !getEmail().isBlank() && !getEmail().isEmpty()) {
      builder.append("\n").append(getEmail());
    }

    // return string
    return builder.toString();
  }
}
