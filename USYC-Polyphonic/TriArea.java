import java.util.Scanner;

public class TriArea 
{
    public static double AreaTri(Scanner kybrd)
{
    double base, height, area_triangle;
    System.out.print("Enter Base: ");
    base=kybrd.nextDouble();
    System.out.print("Enter Height: ");
    height=kybrd.nextDouble();
    area_triangle=(1.0/2.0)*(base*height);
    return area_triangle;
}
}
