public class Animal {
    public Animal(String m_species, String m_breed, String m_name, int m_age) {
        this.m_species = m_species;
        this.m_breed = m_breed;
        this.m_name = m_name;
        this.m_age = m_age;
    }

    @Override
    public String toString() {
        return String.format("%s, %d year old %s %s", m_name, m_age, m_breed, m_species);
    }

    public void setName(String name) { m_name = name; }
    public void setAge(int age) { m_age = age; }

    private String m_species;
    private String m_breed;
    private String m_name;
    private int m_age;
}
