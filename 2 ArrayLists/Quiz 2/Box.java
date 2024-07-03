public class Box
{
    public Box(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getVolume() { return x * y * z; }


    // Overriding toString() method of String class
    @Override
    public String toString() {
        return "Volume: " + this.getVolume() + " Dimensions: " + this.x + "x" + this.y + "x" + this.z;
    }

    public void setX(int x) { this.x = x; }
    public int getX()  { return x; }

    public void setY(int y) { this.y = y; }
    public int getY() { return y; }

    public void setZ(int z) { this.z = z; }
    public int getZ()  { return z; }

    private int x = 0;
    private int y = 0;
    private int z = 0;
}