import java.util.Scanner;

public class CircleArea 
{
    public static double AreaCircle(Scanner kybrd)
{
    double radius_circle;
    double area_circle=0;
    System.out.print("Enter Radius: ");
    radius_circle= kybrd.nextDouble();
    if (radius_circle<=0)
    {
    System.out.println("Error: Value must be greater than Zero.");
    }
   else
    {
    area_circle= Math.PI * Math.pow(radius_circle, 2);
    }
    return area_circle;
}
}
