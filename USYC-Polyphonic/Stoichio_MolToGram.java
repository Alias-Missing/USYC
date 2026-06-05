import java.util.Scanner;

public class Stoichio_MolToGram 
{
    public static double Stoichio_MolToGramCalc(Scanner kybrd)
{
    double mol_unknown, mol_known, mol_given;
    double molar_mass, gram;
    System.out.print("Please enter amount of moles given in problem: ");
    mol_given=kybrd.nextDouble();
    System.out.print("Please enter amount of moles of the same substance, but in the balanced equation: ");
    mol_known=kybrd.nextDouble();
    System.out.print("Please enter amount of moles of unknown substance in the chemical equation: ");
    mol_unknown=kybrd.nextDouble();
    molar_mass=Compound.GetMolarMassofCompound();
    gram=mol_given*(mol_known/mol_unknown)*(molar_mass/1);
    return gram;
}
}
