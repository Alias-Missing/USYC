import java.util.Scanner;

public class SolveForPressure
{
        public static double SolveForP1(Scanner kybrd)
{
        double P1, P2, V1, V2, T1, T2;
        System.out.print("Enter Pressure 2: ");
        P2=kybrd.nextDouble();
        System.out.print("Enter Volume 1: ");
        V1=kybrd.nextDouble();
        System.out.print("Enter Volume 2: ");
        V2=kybrd.nextDouble();
        System.out.print("Enter Temperature 1: ");
        T1=kybrd.nextDouble();
        System.out.print("Enter Temperature 2: ");
        T2=kybrd.nextDouble();
        P1= (P2*V1*T2)/(T1*V2);
        System.out.println("Pressure 1: " + P1);
        return P1;
}
    public static double SolveForP2(Scanner kybrd)
{
    double P1, P2, V1, V2, T1, T2;
    System.out.print("Enter Pressure 1: ");
    P1=kybrd.nextDouble();
    System.out.print("Enter Volume 1: ");
    V1=kybrd.nextDouble();
    System.out.print("Enter Volume 2: ");
    V2=kybrd.nextDouble();
    System.out.print("Enter Temperature 1: ");
    T1=kybrd.nextDouble();
    System.out.print("Enter Temperature 2: ");
    T2=kybrd.nextDouble();
    P2= (P1*V1*T2)/(T1*V2);
    System.out.println("Pressure 2: " + P2);
    return P2;
}
}
