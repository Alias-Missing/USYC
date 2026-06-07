import java.util.Scanner;
public class CartesianSlope 
{
    Scanner kybrd= new Scanner(System.in);
    double slope;
    public static double Slope(Scanner kybrd)
    {
        System.out.print("Please enter the First point's X value: ");
        double x1= kybrd.nextDouble();
        System.out.print("Please enter the First point's Y value: ");
        double y1= kybrd.nextDouble();
        System.out.print("Please enter the Second point's X value: ");
        double x2= kybrd.nextDouble();
        System.out.print("Please enter the Second point's Y value: ");
        double y2= kybrd.nextDouble();
        return ((y2-y1)/(x2-x1));
    }
}
