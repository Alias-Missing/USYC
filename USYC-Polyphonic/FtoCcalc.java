import java.util.Scanner;

public class FtoCcalc 
{
    public static double FtoC(Scanner kybrd)
{
    double Fahrenheit;
    double Celsius;
    System.out.print("Please enter temperature in Fahrenheit: ");
    Fahrenheit=kybrd.nextDouble();
    Celsius=((Fahrenheit-32)*(5.0/9.0));
    return Celsius;
}
}
