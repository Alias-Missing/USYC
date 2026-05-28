import java.util.Scanner;

public class QuadArea 
{
    public static double AreaQuad (Scanner kybrd)
{
    double length, width, area;
    System.out.print("Enter Length: ");
    length=kybrd.nextDouble();
    System.out.print("Enter Width: ");
    width=kybrd.nextDouble();
    area = length*width;
    return area;
}
}
