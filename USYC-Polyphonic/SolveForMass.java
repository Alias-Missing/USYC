import java.util.Scanner;

public class SolveForMass 
{
    public static double SolveForMassInKG(Scanner kybrd)
{
    double force, mass, acceleration;
    System.out.print("Enter force of object in N: ");
    force=kybrd.nextDouble();
    System.out.print("Enter acceleration of object in m/s^2: ");
    acceleration=kybrd.nextDouble();
    mass=force/acceleration;
    System.out.println("Masss of object in kg: " + mass);
    return mass;
}
}
