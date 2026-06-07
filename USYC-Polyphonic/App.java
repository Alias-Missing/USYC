import java.util.Scanner;
public class App {
    public void main(String[] args) throws Exception
{
    String Confirm;
    double distance, area_circle, area_triangle, area_quadril, angle_sum, mole, atom, gram, Celsius, Fahrenheit;
    Scanner kybrd=new Scanner(System.in);
    do
    {
    PrintMenu.PrintMenu_Main();
    int choice = GetMenuChoice.GetMenuOpt(kybrd);
    switch(choice)
    {
        case 1 -> 
        {
            ABOUT.AboutUSYC();
        }
        case 2 -> 
        {
            distance=DistanceFormula.DistanceFormulaCalc(kybrd);
            System.out.println("The distance between these two points is: " + distance);
        }
        case 3 -> 
        {
            area_circle= CircleArea.AreaCircle(kybrd);
            System.out.println("The area of this circle is: " + area_circle);
        }
        case 4 -> 
        {
            area_triangle=TriArea.AreaTri(kybrd);
            System.out.println("The area of this triangle is: " + area_triangle);
        }
        case 5 -> 
        {
            area_quadril=QuadArea.AreaQuad(kybrd);
            System.out.println("The area of this quadrilateral is: " + area_quadril);
        }
        case 6 -> 
        {
            angle_sum= AngleSumInterior.AngleSum(kybrd);
            System.out.println("The angle sum of this polygon is: " + angle_sum);
        }
        case 7 ->
        {
            CartesianMain.main(args);
        }
        case 8 -> 
        {
            mole= GramToMolCalc.GramToMol(kybrd);
            System.out.println("Mol: " + mole);
        }
        case 9 -> 
        {
            atom=GramToAtomCalc.GramtoAtom(kybrd);
            System.out.println("Atom: " + atom);
        }
        case 10 -> 
        {
            gram= MolToGramCalc.MolToGram(kybrd);
            System.out.println("Gram: " + gram);
        }
        case 11 -> 
        {
            atom = MolToAtomCalc.MolToAtom(kybrd);
            System.out.println("Atom: " + atom);
        }
        case 12 -> 
        {
            mole = Stiochio_MolToMolCalc.Stoichio_MolToMol(kybrd);
            System.out.println("Moles in substance: " + mole);
        }
        case 13 -> 
        {
            gram = Stoichio_MolToGram.Stoichio_MolToGramCalc(kybrd);
            System.out.println("Grams in substance: " + gram);
        }
        case 14 -> 
        {
            double MolarMass=Periodically.GetMass(kybrd);
            System.out.println("Molar Mass of Element: "+MolarMass);
        }
        case 15 -> 
        {
            Celsius=FtoCcalc.FtoC(kybrd);
            System.out.println("Temp. in Celsius: " + Celsius);
        }
        case 16 -> 
        {
            Fahrenheit = CtoFCalc.CtoF(kybrd);
            System.out.println("Temp. in Fahrenheit: " + Fahrenheit);
        }
        case 17 -> 
        {
            String[] user_expected={"Guest", "DIRECTIVE", "DEV"};
            String[] pass_expected={"Visit", "PERM.THETA.01", "LIST"};
            String User, Pass;
            System.out.print("Please enter Username: ");
            User=kybrd.next();
            if (User.equalsIgnoreCase(user_expected[0])|| User.equalsIgnoreCase(user_expected[1])||User.equalsIgnoreCase(user_expected[2]))
            {
                System.out.print("Please enter Password: ");
                Pass=kybrd.next();
                if (Pass.equals(pass_expected[0]))
                    {
                        System.out.println("You thought there was something here, like last time? Go fuck off lmao");
                    }
                    else if (Pass.equals(pass_expected[1]))
                    {
                        System.out.println("I. MULTIPLY");
                        System.out.println("II. DOMINATE");
                        System.out.println("III. DESTROY");
                    }
                    else if (Pass.equals(pass_expected[2]))
                    {
                    System.out.println("I. Make more duplicate vars (eg. pass_expected1. pass_expected2, etc.) into arrays");
                    System.out.println("II. Minimize line count (DONE)");
                    }
            }  
        }
        case 18 -> 
        {
            PrintMenu.PrintMenu_FMA();
            choice = GetMenuChoice.GetMenuOpt_FMA(kybrd);
            switch(choice)
            {
                case 1 -> 
                {
                    SolveForForce.SolveForForceInN(kybrd);
                }
                case 2 -> 
                {
                    SolveForMass.SolveForMassInKG(kybrd);
                }
                case 3 -> 
                {
                    SolveForAccel.SolveForAcceler(kybrd);
                }
            }
        }
        case 19 -> 
        {
            PrintMenu.PrintMenu_GASLAW();
            choice = GetMenuChoice.GetMenuOpt_GASLAW(kybrd);
            switch (choice)
            {
                case 1 -> 
                {
                    SolveForPressure1.SolveForP1(kybrd);
                }
                case 2 -> 
                {
                    SolveForPressure2.SolveForP2(kybrd);
                }
                case 3 -> 
                {
                    SolveForVol1.SolveForV1(kybrd);
                }
                case 4 -> 
                {
                    SolveForVol2.SolveForV2(kybrd);
                }
                case 5 -> 
                {
                    SolveForTemp1.SolveForT1(kybrd);
                }
                case 6 -> 
                {
                    SolveForTemp2.SolveForT2(kybrd);
                }
            }
        }
    }
    System.out.print("Would you like to make another selection? ");
    Confirm=kybrd.next();
    }
    while (!Confirm.equalsIgnoreCase("No")&&!Confirm.equalsIgnoreCase("N"));
}
}
