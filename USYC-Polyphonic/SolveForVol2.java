import java.util.Scanner;

public class SolveForVol2 
{
    public static double SolveForV2(Scanner kybrd)
{
    double P1, P2, V1, V2, T1, T2;
    System.out.print("Enter Pressure 1: ");
    P1=kybrd.nextDouble();
    System.out.print("Enter Pressure 2: ");
    P2=kybrd.nextDouble();
    System.out.print("Enter Volume 1: ");
    V1=kybrd.nextDouble();
    System.out.print("Enter Temperature 1: ");
    T1=kybrd.nextDouble();
    System.out.print("Enter Temperature 2: ");
    T2=kybrd.nextDouble();
    V2= (P1*V1*T2)/(P2*T1);
    System.out.println("Volume 2: " + V2);
    return V2;
}
}
