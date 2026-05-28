import java.util.Scanner;

public class SolveForTemp2 
{
    public static double SolveForT2(Scanner kybrd)
{
    double P1, P2, V1, V2, T1, T2;
    System.out.print("Enter Pressure 1: ");
    P1=kybrd.nextDouble();
    System.out.print("Enter Pressure 2: ");
    P2=kybrd.nextDouble();
    System.out.print("Enter Volume 1: ");
    V1=kybrd.nextDouble();
    System.out.print("Enter Volume 2: ");
    V2=kybrd.nextDouble();
    System.out.print("Enter Temperature 1: ");
    T1=kybrd.nextDouble();
    T2= (P2*V2*T1)/(P1*V1);
    System.out.println("Temperature 2: " + T2);
    return T2;
}
}
