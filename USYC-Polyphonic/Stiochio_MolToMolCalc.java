import java.util.Scanner;

public class Stiochio_MolToMolCalc 
{
    public static double Stoichio_MolToMol(Scanner kybrd)
{
    double mol_unknown, mol_known, mol_final, mol_given;
    System.out.print("Please enter amount of known moles in the problem: ");
    mol_given=kybrd.nextDouble();
    System.out.print("Please enter amount of unknown substance in moles (in the balanced equation): ");
    mol_unknown=kybrd.nextDouble();
    System.out.print("Please enter the amount of given moles in the balanced equation: ");
    mol_known=kybrd.nextDouble();
    mol_final=mol_given*(mol_unknown/mol_known);
    return mol_final;
}
}
