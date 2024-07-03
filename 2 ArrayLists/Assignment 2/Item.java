/**
 * Item class which stores name, department, and cost of each item.
 * @author Aditya Bankoti
 * @date July 2, 2024
 */
public class Item {
    private String name; // name of the item
    private String department; // department of the item
    private float cost; // price/cost of the item

    /**
     * @param name Item name
     * @param department Item department
     * @param cost Item cost
     */
    public Item(String name, String department, float cost) {
        this.name = name;
        this.department = department;
        this.cost = cost;
    }

    /**
     * @return Item name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name New item name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Item department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department New item department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return Cost of item
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost New cost of item
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return String format of item
     */
    @Override
    public String toString() {
        return String.format("%s - %s - $%.2f", getName(), getDepartment(), getCost());
    }
}
