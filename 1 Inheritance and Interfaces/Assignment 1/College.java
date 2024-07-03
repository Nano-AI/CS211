
/**
 * College class with people, names, and a tution.
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class College {
  /**
   * College name
   */
  private final String name;
  /**
   * People in the college including staff and students
   */
  private ArrayList<PersonInterface> people;
  /**
   * Annual tution of the college
   */
  private double annualBaseTuition;

  /**
   * Default constructor
   *
   * @param name              Name of the college
   * @param annualBaseTuition Annual base tution of college
   */
  public College(String name, double annualBaseTuition) {
    // create class variables
    this.name = name;
    this.annualBaseTuition = annualBaseTuition;
    // initialize array list
    this.people = new ArrayList<PersonInterface>();
  }

  /**
   * Returns college name
   *
   * @return College name
   */
  public String getName() { return this.name; }

  /**
   * Set annual tuition
   *
   * @param annualBaseTuition Annual tuition
   */
  public void setAnnualBaseTuition(double annualBaseTuition) {
    this.annualBaseTuition = annualBaseTuition;
  }

  /**
   * Return annual base tuition
   *
   * @return Annual base tuition
   */
  public double getAnnualBaseTuition() { return this.annualBaseTuition; }

  /**
   * Get the people in the college
   *
   * @return ArrayList of the people in the college
   */
  public ArrayList<PersonInterface> getPeople() { return this.people; }

  /**
   * Adds a person to the college
   *
   * @param p person to add to college
   */
  public void addPerson(Person p) { this.people.add(p); }

  /**
   * Add mulitple people to a college
   *
   * @param people Array of people to add to college
   */
  public void addPeople(Person[] people) {
    for (Person person : people)
      addPerson(person);
  }

  /**
   * Removes a person off the college list based off ID
   *
   * @param p The person to remove
   * @return The removed person
   */
  public PersonInterface removePerson(PersonInterface p) {
    PersonInterface removed;
    for (int i = 0; i < this.people.size(); i++) {
      if (this.people.get(i).equals(p)) {
        removed = this.people.get(i);
        this.people.remove(i);
        return removed;
      }
    }
    return null;
  }

  /**
   * Turns the college to a String
   *
   * @return String version
   */
  @Override
  public String toString() {
    // Locale format for dollar
    Locale locale = new Locale("en", "US");
    // Formatter for dollar
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    // Add college name, tuition, and people
    StringBuilder builder = new StringBuilder();
    builder.append("== ")
        .append(this.name.toUpperCase())
        .append(" ==")
        .append("\n")
        .append("Tuition: ")
        .append(currencyFormatter.format(this.annualBaseTuition))
        .append(" per annum.\n")
        .append("People: [");

    // Index counter
    int i = 1;
    // Iterate through people
    for (PersonInterface p : this.people) {
      // Add person.toString(0
      builder.append(String.format("\n%d) ", i))
          .append(p.toString())
          .append("\n");
      // increment index
      i++;
    }

    // add the closing bracket
    builder.append("]");

    // return the toString
    return builder.toString();
  }
}
