import java.util.Scanner;

public class MolToAtomCalc 
{
        public static double MolToAtom(Scanner kybrd)
{
    double mole, atom;
    System.out.print("Enter amount of element in moles: ");
    mole=kybrd.nextDouble();
    atom=(mole*((6.022*Math.pow(10, 23))/1));
    return atom;
}
}
