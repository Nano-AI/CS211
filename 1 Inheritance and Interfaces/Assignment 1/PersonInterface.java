// A register over people that keeps track of:
// ID, Last Name, First Name, and Email
// Note: There is no setID. ID should be set in the constructor.
public interface PersonInterface {
  String getID();

  void setLastName(String lastName);

  String getLastName();

  void setFirstName(String lastName);

  String getFirstName();

  void setEmail(String lastName);

  public default boolean equals(PersonInterface p) {
    return p.getID().equals(this.getID());
  }
}
