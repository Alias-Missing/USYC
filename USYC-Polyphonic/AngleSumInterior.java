import java.util.Scanner;

public class AngleSumInterior 
{
    public static double AngleSum(Scanner kybrd)
{
    double number_sides, angle_sum;
    System.out.print("Please enter number of sides: ");
    number_sides=kybrd.nextDouble();
    angle_sum=((number_sides-2)*180);
    return angle_sum;
}
}
