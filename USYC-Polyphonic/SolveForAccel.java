import java.util.Scanner;

public class SolveForAccel 
{
    public static double SolveForAcceler(Scanner kybrd)
{
    double force, mass, acceleration;
    System.out.print("Enter force of object in N: ");
    force=kybrd.nextDouble();
    System.out.print("Enter mass of object in kg: ");
    mass=kybrd.nextDouble();
    acceleration=force/mass;
    System.out.println("Acceleration of object in m/s^2: " + acceleration);
    return acceleration;
}
}
