import java.util.Scanner;

public class MolToGramCalc 
{
    public static double MolToGram(Scanner kybrd)
{
    double mole, molar_mass, gram;
    System.out.print("Enter amount of element in moles: ");
    mole=kybrd.nextDouble();
    System.out.print("Enter Molar Mass of element: ");
    molar_mass=Periodically.GetMass(kybrd);
    gram=mole*(molar_mass/1);
    return gram;
}
}
