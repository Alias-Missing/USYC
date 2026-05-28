import java.util.Scanner;

public class CtoFCalc 
{
    public static double CtoF(Scanner kybrd)
{
    double Fahrenheit;
    double Celsius;
    System.out.print("Please enter temperature in Celsius: ");
    Celsius=kybrd.nextDouble();
    Fahrenheit=((Celsius*(9.0/5.0)+32));
    return Fahrenheit;
}
}
