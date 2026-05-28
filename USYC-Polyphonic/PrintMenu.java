import java.time.LocalDate;

public class PrintMenu 
{
    public static void PrintMenu_Main()
{
    System.out.println("Welcome to the Ultimate Sophomore-Year Calculator.");
    System.out.println("Please select a menu option.");
    System.out.println("1. About USYC");
    System.out.println("----GEOMETRY----");
    System.out.println("2. Distance Formula");
    System.out.println("3. Area of a Circle");
    System.out.println("4. Area of a Triangle");
    System.out.println("5. Area of a Quadrilateral");
    System.out.println("6. Angle-Sum Formula");
    System.out.println("----CHEMISTRY----");
    System.out.println("7. Gram-to-Mol");
    System.out.println("8. Gram-to-Atom");
    System.out.println("9. Mol-to-Gram");
    System.out.println("10. Mol-to-Atom");
    System.out.println("11. Stoichiometry- Mol-to-Mol");
    System.out.println("12. Stoichiometry- Mol-to-Gram");
    System.out.println("----BASIC----");
    System.out.println("13. Convert Fahrenheit to Celsius");
    System.out.println("14. Convert Celsius to Fahrenheit");
    System.out.println("15. Secret Menu");
    System.out.println("----PHYSICS----");
    System.out.println("16. Force, Mass, and Acceleration");
    System.out.println("17. Gas Laws");
    System.out.println("Planned Updates: Uhhhhh");
    System.out.println("Latest Update: Gas Laws, more spalsh techs, Consistent Code Alignment, Multi-File Reconfig, ");
    RandomSplashText.RandomSpalshText();
    System.out.println("Today is: " + LocalDate.now());
}
    public static void PrintMenu_FMA()
{
    System.out.println("----USYC > PHYSICS > FMA > ----");
    System.out.println("1. Solve for Force");
    System.out.println("2. Solve for Mass");
    System.out.println("3. Solve for Accleration");
}
         public static void PrintMenu_GASLAW()
{
    System.out.println("----USYC > PHYSICS > GAS LAWS > ----");
    System.out.println("1. Solve for Pressure 1");
    System.out.println("2. Solve for Pressure 2");
    System.out.println("3. Solve for Volume 1");
    System.out.println("4. Solve for Volume 2");
    System.out.println("5. Solve for Temperature 1");
    System.out.println("6. Solve for Temperature 2");
}
}
