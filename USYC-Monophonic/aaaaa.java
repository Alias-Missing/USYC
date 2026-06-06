import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.Scanner;

public class aaaaa
{
    static final double MolarMassArray[] = new double[120];
    static {
        MolarMassArray[0]=1.0078; //H
        MolarMassArray[1]=4.0026; //He
        MolarMassArray[2]=6.9410; //Li
        MolarMassArray[3]=9.0122; //Be
        MolarMassArray[4]=10.811; //B
        MolarMassArray[5]=12.011; //C
        MolarMassArray[6]=14.007; //N
        MolarMassArray[7]=15.999; //O
        MolarMassArray[8]=18.998; //F
        MolarMassArray[9]=20.180; //Ne
        MolarMassArray[10]=22.990; //Na
        MolarMassArray[11]=24.305; //Mg
        MolarMassArray[12]=26.982; //Al
        MolarMassArray[13]=28.086; //Si
        MolarMassArray[14]=30.974; //P
        MolarMassArray[15]=32.065; //S
        MolarMassArray[16]=35.453; //Cl
        MolarMassArray[17]=39.948; //Ar
        MolarMassArray[18]=39.098; //K
        MolarMassArray[19]=40.078; //Ca
        MolarMassArray[20]=44.956; //Sc
        MolarMassArray[21]=47.867; //Ti
        MolarMassArray[22]=50.942; //V
        MolarMassArray[23]=51.996; //Cr
        MolarMassArray[24]=54.938; //Mn
        MolarMassArray[25]=55.845; //Fe
        MolarMassArray[26]=58.933; //Co
        MolarMassArray[27]=58.693; //Ni
        MolarMassArray[28]=63.546; //Cu
        MolarMassArray[29]=65.380; //Zn
        MolarMassArray[30]=69.723; //Ga
        MolarMassArray[31]=72.640; //Ge
        MolarMassArray[32]=74.922; //As
        MolarMassArray[33]=78.960; //Se
        MolarMassArray[34]=79.904; //Br
        MolarMassArray[35]=83.798; //Kr
        MolarMassArray[36]=85.468; //Rb
        MolarMassArray[37]=87.620; //Sr
        MolarMassArray[38]=88.906; //Y
        MolarMassArray[39]=91.224; //Zr
        MolarMassArray[40]=92.906; //Nb
        MolarMassArray[41]=95.950; //Mo
        MolarMassArray[42]=98.000; //Tc
        MolarMassArray[43]=101.07; //Ru
        MolarMassArray[44]=102.91; //Rh
        MolarMassArray[45]=106.42; //Pd
        MolarMassArray[46]=107.87; //Ag
        MolarMassArray[47]=112.41; //Cd
        MolarMassArray[48]=114.82; //In
        MolarMassArray[49]=118.71; //Sn
        MolarMassArray[50]=121.76; //Sb
        MolarMassArray[51]=127.60; //Te
        MolarMassArray[52]=126.90; //I
        MolarMassArray[53]=131.29; //Xe
        MolarMassArray[54]=132.91; //Cs
        MolarMassArray[55]=137.33; //Ba
        MolarMassArray[56]=138.91; //La
        MolarMassArray[57]=140.12; //Ce
        MolarMassArray[58]=140.91; //Pr
        MolarMassArray[59]=144.24; //Nd
        MolarMassArray[60]=145.00; //Pm
        MolarMassArray[61]=150.36; //Sm
        MolarMassArray[62]=151.96; //Eu
        MolarMassArray[63]=157.25; //Gd
        MolarMassArray[64]=158.93; //Tb
        MolarMassArray[65]=162.50; //Dy
        MolarMassArray[66]=164.93; //Ho
        MolarMassArray[67]=167.26; //Er
        MolarMassArray[68]=168.93;
        MolarMassArray[69]=173.04;
        MolarMassArray[70]=174.97;
        MolarMassArray[71]=178.49;
        MolarMassArray[72]=180.95;
        MolarMassArray[73]=183.84;
        MolarMassArray[74]=186.21;
        MolarMassArray[75]=190.23;
        MolarMassArray[76]=192.22;
        MolarMassArray[77]=195.08;
        MolarMassArray[78]=196.97;
        MolarMassArray[79]=200.59;
        MolarMassArray[80]=204.38;
        MolarMassArray[81]=207.20;
        MolarMassArray[82]=208.98;
        MolarMassArray[83]=209.00;
        MolarMassArray[84]=210.00;
        MolarMassArray[85]=222.00;
        MolarMassArray[86]=223.00;
        MolarMassArray[87]=226.00;
        MolarMassArray[88]=227.00;
        MolarMassArray[89]=232.04;
        MolarMassArray[90]=231.04;
        MolarMassArray[91]=238.03;
        MolarMassArray[92]=237.05;
        MolarMassArray[93]=244.00;
        MolarMassArray[94]=243.00;
        MolarMassArray[95]=247.00;
        MolarMassArray[96]=247.00;
        MolarMassArray[97]=251.00;
        MolarMassArray[98]=252.00;
        MolarMassArray[99]=257.00;
        MolarMassArray[100]=258.00;
        MolarMassArray[101]=259.00;
        MolarMassArray[102]=262.00;
        MolarMassArray[103]=267.00;
        MolarMassArray[104]=262.00;
        MolarMassArray[105]=269.00;
        MolarMassArray[106]=264.00;
        MolarMassArray[107]=269.00;
        MolarMassArray[108]=278.00;
        MolarMassArray[109]=281.00;
        MolarMassArray[110]=282.00;
        MolarMassArray[111]=285.00;
        MolarMassArray[112]=286.00;
        MolarMassArray[113]=289.00;
        MolarMassArray[114]=289.00;
        MolarMassArray[115]=293.00;
        MolarMassArray[116]=294.00;
        MolarMassArray[117]=294.00;
            }
    public static double GetMass(Scanner kybrd)
    {
        int atomnum;
        do
        {
            System.out.print("Enter the atomic number of the element you want, 1-118: ");
            atomnum= kybrd.nextInt();
            if (atomnum<1||atomnum>118)
            {
                System.out.println("Invalid Atomic Number as of 2026-June-04");
            }
        } while(atomnum<1||atomnum>118);
        return MolarMassArray[atomnum-1];
    }
    public static void RandomSplashText()
{
    LocalDate today= LocalDate.now();
    MonthDay now = MonthDay.from(today);
    MonthDay crimas= MonthDay.of(Month.DECEMBER, 25);
    int SpalshText=(int)(Math.random()*23)+1;
    switch (SpalshText)
    {
    case 1 -> {
            System.out.println("Nine Sols Characters: *Exists* Me: Would");
        }
    case 2 -> {
        System.out.println("TREACHERY TOMORROW!!");
        }
    case 3 -> {
        System.out.println("I WANT TO BELIEVE.");
        System.out.println("SIZE 2 FISH.");
        }

    case 4 -> {
        System.out.println("MANKIND IS DEAD");
        System.out.println("BLOOD IS FUEL");
        System.out.println("HELL IS FULL");
        }
    case 5 -> {
            System.out.println("How do people make games out of Java?");
        }
    case 6 -> {
            System.out.println("Man, I need some kind of app development guy on this shit right fucking now!");
        }
    case 7 -> {
            System.out.println("THY END IS NOW!");
            System.out.println("CRUSH!");
            System.out.println("DIE!");
            System.out.println("JUDGEMENT!");
        }
        case 8 -> {
            System.out.println("Will anyone read this? Probably not.");
        }

        case 9 -> {    
            System.out.println("YOMI HUSTLE!");
        }
        case 10 -> {    
            System.out.println("This is (no longer) longer than main lmfao. Fact-Checked by: The Fucking Calculator That Came On The Fucking Laptop (TM)");
        }
        case 11 -> {
            System.out.println("Don't look at bbbbb.java, it's THE MONOLITH (TM)");
        }
        case 12 -> {
            System.out.println("bbbbb 325 lines? Nah.");
            System.out.println("aaaaa *1373 lines? Yea.");
        }
        case 13 -> {
            System.out.println("Stand proud, bbbbb.java, you were strong.");
        }
        case 14 -> {
            System.out.println("Nah, I'd aaaaa.java");
        }
        case 15 -> {
            System.out.println("Hours spent making main menu: 0.00003");
            System.out.println("Hours spent making these splash texts: 333333.333333");
        }
        case 16 -> {
            System.out.println("Still smaller than the Oregon Trail! 34 KB<3500 km");
        }
        case 17 -> {
            System.out.println("Geforce RTX 5060");
            System.out.println("B860M D3HP");
            System.out.println("Peerless Assassin 120 SE");
            System.out.println("Intel Core Ultra 5");
            System.out.println("Lian Li V100R");
            System.out.println("MSI PSU");
            System.out.println("Dev Specs");
        }
        case 18 -> {
            System.out.println("I am going to ULTRAKILL you!!");
        }
        case 19 -> {
            System.out.println("Guest");
            System.out.println("Visit");
        }
        case 20 -> {
            System.out.println("Also try Bet Break!");
            System.out.println("(Note: Bet Break is not availible to the public yet, and, so, you cannot, in fact, try Bet Break.)");
        }
        case 21 -> {
            System.out.println("Also see: LinuxGuide! (I think I accidentally wiped it off my computer from installing ArchLinux...)");
        }
        case 22 -> {
            System.out.println("If any potential employer sees this, I hope you're prepared for my only capability: massive CLI projects. :D");
        }
        case 23 -> {
            System.out.println("You wanna guess how much time PgUp and PgDwn save scrolling through this thing?");
        }
    }
    if (now.equals(crimas))
    {
        System.out.println("crimas :3");
    }           
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
    public static int GetMenuChoice_GASLAW(Scanner kybrd)
{
    int opt;
    do
    {
        System.out.print("Please enter a menu option: ");
        opt= kybrd.nextInt();
        if (opt>6||opt<1)
        {
            System.out.println("Error: Invalid Menu option: Please try again!");
        }
    }
    while (opt<1||opt>6);
    return opt;
}
    public static double SolveForTemp1(Scanner kybrd)
{
    double P1, P2, V1, V2, T1, T2;
    System.out.print("Enter Pressure 1: ");
    P1=kybrd.nextDouble();
    System.out.print("Enter Pressure 2: ");
    P2=kybrd.nextDouble();
    System.out.print("Enter Volume 1: ");
    V1=kybrd.nextDouble();
    System.out.print("Enter Volume 2: ");
    V2=kybrd.nextDouble();
    System.out.print("Enter Temperature 2: ");
    T2=kybrd.nextDouble();
    T1= (P1*V1*T2)/(P2*V2);
    System.out.println("Temperature 1: " + T1);
    return T1;
}
    public static double SolveForTemp2(Scanner kybrd)
{
    double P1, P2, V1, V2, T1, T2;
    System.out.print("Enter Pressure 1: ");
    P1=kybrd.nextDouble();
    System.out.print("Enter Pressure 2: ");
    P2=kybrd.nextDouble();
    System.out.print("Enter Volume 1: ");
    V1=kybrd.nextDouble();
    System.out.print("Enter Volume 2: ");
    V2=kybrd.nextDouble();
    System.out.print("Enter Temperature 1: ");
    T1=kybrd.nextDouble();
    T2= (P2*V2*T1)/(P1*V1);
    System.out.println("Temperature 2: " + T2);
    return T2;
}
    public static double SolveForVol1(Scanner kybrd)
{
    double P1, P2, V1, V2, T1, T2;
    System.out.print("Enter Pressure 1: ");
    P1=kybrd.nextDouble();
    System.out.print("Enter Pressure 2: ");
    P2=kybrd.nextDouble();
    System.out.print("Enter Volume 2: ");
    V2=kybrd.nextDouble();
    System.out.print("Enter Temperature 1: ");
    T1=kybrd.nextDouble();
    System.out.print("Enter Temperature 2: ");
    T2=kybrd.nextDouble();
    V1= (P2*V2*T1)/(P1*T2);
    System.out.println("Volume 1: " + V1);
    return V1;
}
    public static double SolveForVol2(Scanner kybrd)
{
    double P1, P2, V1, V2, T1, T2;
    System.out.print("Enter Pressure 1: ");
    P1=kybrd.nextDouble();
    System.out.print("Enter Pressure 2: ");
    P2=kybrd.nextDouble();
    System.out.print("Enter Volume 1: ");
    V1=kybrd.nextDouble();
    System.out.print("Enter Temperature 1: ");
    T1=kybrd.nextDouble();
    System.out.print("Enter Temperature 2: ");
    T2=kybrd.nextDouble();
    V2= (P1*V1*T2)/(P2*T1);
    System.out.println("Volume 2: " + V2);
    return V2;
}
    public static double SolveForPressure1(Scanner kybrd)
{
        double P1, P2, V1, V2, T1, T2;
        System.out.print("Enter Pressure 2: ");
        P2=kybrd.nextDouble();
        System.out.print("Enter Volume 1: ");
        V1=kybrd.nextDouble();
        System.out.print("Enter Volume 2: ");
        V2=kybrd.nextDouble();
        System.out.print("Enter Temperature 1: ");
        T1=kybrd.nextDouble();
        System.out.print("Enter Temperature 2: ");
        T2=kybrd.nextDouble();
        P1= (P2*V1*T2)/(T1*V2);
        System.out.println("Pressure 1: " + P1);
        return P1;
}
    public static double SolveForPressure2(Scanner kybrd)
{
    double P1, P2, V1, V2, T1, T2;
    System.out.print("Enter Pressure 1: ");
    P1=kybrd.nextDouble();
    System.out.print("Enter Volume 1: ");
    V1=kybrd.nextDouble();
    System.out.print("Enter Volume 2: ");
    V2=kybrd.nextDouble();
    System.out.print("Enter Temperature 1: ");
    T1=kybrd.nextDouble();
    System.out.print("Enter Temperature 2: ");
    T2=kybrd.nextDouble();
    P2= (P1*V1*T2)/(T1*V2);
    System.out.println("Pressure 2: " + P2);
    return P2;
}
    public static void PrintMenu_FMA()
{
    System.out.println("----USYC > PHYSICS > FMA > ----");
    System.out.println("1. Solve for Force");
    System.out.println("2. Solve for Mass");
    System.out.println("3. Solve for Accleration");
}
    public static int GetMenuChoice_FMA(Scanner kybrd)
{
    int opt;
    do
    {
        System.out.print("Please enter a menu option: ");
        opt= kybrd.nextInt();
        if (opt>3||opt<1)
        {
            System.out.println("Error: Invalid Menu option: Please try again!");
        }
    }
    while (opt<1||opt>3);
    return opt;
}
    public static double SolveForForce(Scanner kybrd)
{
    double force, mass, accleration;
    System.out.print("Enter mass of object in kg: ");
    mass=kybrd.nextDouble();
    System.out.print("Enter acceleration of object in m/s^2: ");
    accleration=kybrd.nextDouble();
    force=mass*accleration;
    System.out.println("Force of object: " + force);
    return force;
}
    public static double SolveForMass(Scanner kybrd)
{
    double force, mass, acceleration;
    System.out.print("Enter force of object in N: ");
    force=kybrd.nextDouble();
    System.out.print("Enter acceleration of object in m/s^2: ");
    acceleration=kybrd.nextDouble();
    mass=force/acceleration;
    System.out.println("Masss of object in kg: " + mass);
    return mass;
}
    public static double SolveForAccel(Scanner kybrd)
{
    double force, mass, acceleration;
    System.out.print("Enter force of object in N: ");
    force=kybrd.nextDouble();
    System.out.print("Enter mass of object in kg: ");
    mass=kybrd.nextDouble();
    acceleration=force/mass;
    System.out.println("Acceleration of object in m/s^2: " + acceleration);
    return acceleration;
}
    public static void PrintMenu()
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
    System.out.println("13. Molar Mass Lookup");
    System.out.println("----BASIC----");
    System.out.println("14. Convert Fahrenheit to Celsius");
    System.out.println("15. Convert Celsius to Fahrenheit");
    System.out.println("16. Secret Menu");
    System.out.println("----PHYSICS----");
    System.out.println("17. Force, Mass, and Acceleration");
    System.out.println("18. Gas Laws");
    System.out.println("Planned Updates: Uhhhhh");
    System.out.println("Latest Update: Physics Section, Gas Laws, more spalsh techs, Consistent Code Alignment");
    RandomSplashText();
    System.out.println("Today is: " + LocalDate.now());
}
    public static int GetMenuChoice(Scanner kybrd)
{
    int opt;
    do
    {
        System.out.print("Please enter a menu option: ");
        opt= kybrd.nextInt();
        if (opt>17||opt<1)
        {
            System.out.println("Error: Invalid Menu option: Please try again!");    
        }
    }
    while (opt<1||opt>17);
    return opt;
}
    public static void AboutUSYC()
{
    System.out.println("About the  Ultimate Sophomore-Year Calculator (USYC):");
    System.out.println("Made by Alex Rodriguez, NOT A Sophomore as of 2026.");
    System.out.println("What this does NOT do:");
    System.out.println("Replace basic four-function Calculator.");
    System.out.println("What this DOES do:");
    System.out.println("Calcuate some essential equations in Chem. and Geo. Feel free to add to this code any additonal equations you like.");
}
    public static double DistanceFormula(Scanner kybrd)
{
    double x1, x2, y2, y1, xTotal, yTotal, distanceMinusOne, distanceMinusTwo, distance;
    System.out.print("Please enter x1: ");
    x1= kybrd.nextInt();
    System.out.print("Please enter y1: ");
    y1= kybrd.nextInt();
    System.out.print("Please enter x2: ");
    x2= kybrd.nextInt();
    System.out.print("Please enter y2: ");
    y2= kybrd.nextInt();
    xTotal= (x2 - x1);
    yTotal= (y2 - y1);
    distanceMinusOne= (Math.pow(xTotal, 2));
    distanceMinusTwo= (Math.pow(yTotal, 2));
    distance = (Math.sqrt(distanceMinusOne + distanceMinusTwo) );
    return distance;
}
    public static double AreaCircle(Scanner kybrd)
{
    double radius_circle;
    double area_circle=0;
    System.out.print("Enter Radius: ");
    radius_circle= kybrd.nextDouble();
    if (radius_circle<=0)
    {
    System.out.println("Error: Value must be greater than Zero.");
    }
   else
    {
    area_circle= Math.PI * Math.pow(radius_circle, 2);
    }
    return area_circle;
}
    public static double AreaTri(Scanner kybrd)
{
    double base, height, area_triangle;
    System.out.print("Enter Base: ");
    base=kybrd.nextDouble();
    System.out.print("Enter Height: ");
    height=kybrd.nextDouble();
    area_triangle=(1.0/2.0)*(base*height);
    return area_triangle;
}
    public static double AreaQuad (Scanner kybrd)
{
    double length, width, area;
    System.out.print("Enter Length: ");
    length=kybrd.nextDouble();
    System.out.print("Enter Width: ");
    width=kybrd.nextDouble();
    area = length*width;
    return area;
}
    public static double AngleSum(Scanner kybrd)
{
    double number_sides, angle_sum;
    System.out.print("Please enter number of sides: ");
    number_sides=kybrd.nextDouble();
    angle_sum=((number_sides-2)*180);
    return angle_sum;
}
    public static double GramToMol(Scanner kybrd)
{
    double gram, mole, molar_mass;
    System.out.print("Enter amount of element in grams: ");
    gram=kybrd.nextDouble();
    System.out.print("Enter Molar Mass of element: ");
    molar_mass=GetMass(kybrd);
    mole=(gram*(1/molar_mass));
    return mole;
}
    public static double GramtoAtom(Scanner kybrd)
{
    double gram, mole, atom, molar_mass;
    System.out.print("Enter amount of element in grams: ");
    gram=kybrd.nextDouble();
    System.out.print("Enter Molar Mass of element: ");
    molar_mass=GetMass(kybrd);
    mole=(gram*(1/molar_mass));
    atom= (mole*(6.022*Math.pow(10, 23)/1));
    return atom;
}
    public static double MolToGram(Scanner kybrd)
{
    double mole, molar_mass, gram;
    System.out.print("Enter amount of element in moles: ");
    mole=kybrd.nextDouble();
    System.out.print("Enter Molar Mass of element: ");
    molar_mass=kybrd.nextDouble();
    gram=mole*(molar_mass/1);
    return gram;
}
    public static double MolToAtom(Scanner kybrd)
{
    double mole, atom;
    System.out.print("Enter amount of element in moles: ");
    mole=kybrd.nextDouble();
    atom=(mole*((6.022*Math.pow(10, 23))/1));
    return atom;
}
    public static double Stoichio_MolToGram(Scanner kybrd)
{
    double mol_unknown, mol_known, mol_given;
    double molar_mass, gram;
    System.out.print("Please enter amount of moles given in problem: ");
    mol_given=kybrd.nextDouble();
    System.out.print("Please enter amount of moles of the same substance, but in the balanced equation: ");
    mol_known=kybrd.nextDouble();
    System.out.print("Please enter amount of moles of unknown substance in the chemical equation: ");
    mol_unknown=kybrd.nextDouble();
    System.out.print("Please calculate and enter the molar mass of the subsance: ");
    molar_mass=kybrd.nextDouble();
    gram=mol_given*(mol_known/mol_unknown)*(molar_mass/1);
    return gram;
}
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
    public static double FtoC(Scanner kybrd)
{
    double Fahrenheit;
    double Celsius;
    System.out.print("Please enter temperature in Fahrenheit: ");
    Fahrenheit=kybrd.nextDouble();
    Celsius=((Fahrenheit-32)*(5.0/9.0));
    return Celsius;
}
    public static double CtoF(Scanner kybrd)
{
    double Fahrenheit;
    double Celsius;
    System.out.print("Please enter temperature in Celsius: ");
    Celsius=kybrd.nextDouble();
    //calculate farenheit to celsius
    Fahrenheit=((Celsius*(9.0/5.0)+32));
    //display
    return Fahrenheit;
}
    public static void main(String[] args)
{
    String Confirm="";
    double distance, area_circle, area_triangle, area_quadril, angle_sum, mole, atom, gram, Celsius, Fahrenheit, molar_mass;
    Scanner kybrd=new Scanner(System.in);
    do
    {
    PrintMenu();
    int choice = GetMenuChoice(kybrd);
    switch(choice)
    {
        case 1 -> {
            AboutUSYC();
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 2 -> {
            distance=DistanceFormula(kybrd);
            System.out.println("The distance between these two points is: " + distance);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 3 -> {
            area_circle= AreaCircle(kybrd);
            System.out.println("The area of this circle is: " + area_circle);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 4 -> {
            area_triangle=AreaTri(kybrd);
            System.out.println("The area of this triangle is: " + area_triangle);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 5 -> {
            area_quadril=AreaQuad(kybrd);
            System.out.println("The area of this quadrilateral is: " + area_quadril);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 6 -> {
            angle_sum= AngleSum(kybrd);
            System.out.println("The angle sum of this polygon is: " + angle_sum);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 7 -> {
            mole= GramToMol(kybrd);
            System.out.println("Mol: " + mole);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 8 -> {
            atom=GramtoAtom(kybrd);
            System.out.println("Atom: " + atom);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 9 -> {
            gram= MolToGram(kybrd);
            System.out.println("Gram: " + gram);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 10 -> {
            atom = MolToAtom(kybrd);
            System.out.println("Atom: " + atom);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 11 -> {
            mole = Stoichio_MolToMol(kybrd);
            System.out.println("Moles in substance: " + mole);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 12 -> {
            gram = Stoichio_MolToGram(kybrd);
            System.out.println("Grams in substance: " + gram);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 13 -> {
            molar_mass=GetMass(kybrd);
            System.out.println("Molar Mass: " + molar_mass);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 14 -> {
            Celsius=FtoC(kybrd);
            System.out.println("Temp. in Celsius: " + Celsius);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 15 -> {
            Fahrenheit = CtoF(kybrd);
            System.out.println("Temp. in Fahrenheit: " + Fahrenheit);
            System.out.print("Would you like to make another selection? ");
            Confirm=kybrd.next();
        }
        case 16 -> {
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
                    System.out.print("Would you like to make another selection? ");
                    Confirm=kybrd.next();
            }  
        }
                    case 17 -> {
                            PrintMenu_FMA();
                            choice = GetMenuChoice_FMA(kybrd);
                            switch(choice)
                            {
                                case 1 -> {
                                        SolveForForce(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next();
                                    }
                                case 2 -> {
                                        SolveForMass(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next();
                                    }
                                case 3 -> {
                                        SolveForAccel(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next();
                                    }
                            }
                        }
                    case 18 -> {
                            PrintMenu_GASLAW();

                            choice = GetMenuChoice_GASLAW(kybrd);
                            switch (choice)
                            {
                                case 1 -> {
                                       SolveForPressure1(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next();
                                    }
                                case 2 -> {
                                        SolveForPressure2(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next();
                                    }
                                case 3 -> {
                                       SolveForVol1(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next(); 
                                    }
                                case 4 -> {
                                        SolveForVol2(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next();
                                    }
                                case 5 -> {
                                        SolveForTemp1(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next();
                                    }
                                case 6 -> {
                                        SolveForTemp2(kybrd);
                                        System.out.print("Would you like to make another selection? ");
                                        Confirm=kybrd.next();
                                    }
                            }
                        }
        }
    }  
    while (!Confirm.equalsIgnoreCase("No")&&!Confirm.equalsIgnoreCase("N"));
}
}