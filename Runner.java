package pkgenum;

public class Runner 
{

    public static void main(String[] args) 
    {
        Point point = new Point(5,5);
        System.out.println("Point located at " + point.location());
        
        point.move(Direction.UP);
        point.move(Direction.UP);
        
        System.out.print("The point was moved up twice. ");
        System.out.println("Point located at " + point.location());
    }
    
}
