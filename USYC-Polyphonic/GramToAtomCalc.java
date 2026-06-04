import java.util.Scanner;

public class GramToAtomCalc 
{
        public static double GramtoAtom(Scanner kybrd)
{
    double gram, mole, atom, molar_mass;
    System.out.print("Enter amount of element in grams: ");
    gram=kybrd.nextDouble();
    molar_mass=Periodically.GetMass(kybrd);
    mole=(gram*(1/molar_mass));
    atom= (mole*(6.022*Math.pow(10, 23)/1));
    return atom;
}
}
