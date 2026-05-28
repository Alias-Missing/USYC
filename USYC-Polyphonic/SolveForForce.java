import java.util.Scanner;

public class SolveForForce 
{
    public static double SolveForForceInN(Scanner kybrd)
{
    double force, mass, accleration;
    System.out.print("Enter mass of object in kg: ");
    mass=kybrd.nextDouble();
    System.out.print("Enter acceleration of object in m/s^2: ");
    accleration=kybrd.nextDouble();
    force=mass*accleration;
    System.out.println("Force of object: " + force);
    return force;
}
}
