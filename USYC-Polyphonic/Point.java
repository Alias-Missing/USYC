public class Point
{
    //Vars
    private int x;
    private int y;
    //Constructor
    public Point(int X, int Y)
    {
        this.x=X;
        this.y=Y;
    }
    //Mut
    public void SetX(int X)
    {
        this.x=X;
    }
    public void SetY(int Y)
    {
        this.y=Y;
    }
    //Insp
    public int GetX()
    {
        return this.x;
    }
    public int GetY()
    {
        return this.y;
    }
}
