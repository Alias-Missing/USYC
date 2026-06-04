import java.util.Scanner;

public class GramToMolCalc 
{
    public static double GramToMol(Scanner kybrd)
{
    double gram, mole, molar_mass;
    System.out.print("Enter amount of element in grams: ");
    gram=kybrd.nextDouble();
    System.out.print("Enter Molar Mass of element: ");
    molar_mass=Periodically.GetMass(kybrd);
    mole=(gram*(1/molar_mass));
    return mole;
}
}
