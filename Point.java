package pkgenum;

public class Point 
{
    private Integer columnIndex;
    private Integer rowIndex;
    
    Point(int x, int y)
    {
        this.columnIndex = x;
        this.rowIndex = y;
    }
    
    public void move(Direction dir)
    {
        this.columnIndex += dir.dx;
        this.rowIndex += dir.dy;
    }
    
    public String location()
    {
        return columnIndex.toString() + ", " + rowIndex.toString();
    }
}
