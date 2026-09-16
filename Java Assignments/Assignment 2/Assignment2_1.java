class Cube
{
    private int length;
    private int breadth;
    private int height;
    public Cube()
    {
        length = 0;
        breadth = 0;
        height = 0;
    
    }
    public Cube(int length, int breadth, int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public  Cube(Cube obj)
    {
        this.length = obj.length;
        this.breadth = obj.breadth;
        this.height = obj.height;
    }
    void display()
    {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }
}
class Assignment2_1 
{
     public static void main(String[] args) 
    {
        Cube cube1 = new Cube();
        Cube cube2 = new Cube(5, 10, 15);
        Cube cube3 = new Cube(cube2);
        System.out.println("Cube 1:");
        cube1.display();
        System.out.println("\nCube 2:");
        cube2.display();
        System.out.println("\nCube 3 (Copy of Cube 2):");
        cube3.display();
    }
}