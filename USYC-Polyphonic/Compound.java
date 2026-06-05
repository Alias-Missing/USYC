import java.util.Scanner;
public class Compound
{
    //Vars.
    static Scanner kybrd=new Scanner(System.in);
    static double[] ShareArray= Periodically.MolarMassArray;
    private int Element1;
    private int Element2;
    private int Element3;
    //Construct.
    public Compound(int el1, int el2, int el3)
    {
        el1=this.Element1;
        el2=this.Element2;
        el3=this.Element3;
    }
    //Mut.
    public void SetElement1(int e1)
    {
        e1=this.Element1;
    }
    public void SetElement2(int e2)
    {
        e2=this.Element2;
    }
    public void SetElement3(int e3)
    {
        e3=this.Element3;
    }
    //Insp.
    public int GetElement1()
    {
        return this.Element1;
    }
    public int GetElement2()
    {
        return this.Element2;
    }
    public int GetElement3()
    {
        return this.Element3;
    }
    //Facil.
    public static double GetMolarMassofCompound()
    {
        double TotalMass, BlankMM1, BlankMM2, BlankMM3;
        System.out.print("Please enter the first element's atomic number, type '120' for blank: ");
        int e1=kybrd.nextInt();
        System.out.print("Please enter the second element's atomic number, type '120' for blank: ");
        int e2=kybrd.nextInt();
        System.out.print("Please enter the third element's atomic number, type '120' for blank: ");
        int e3=kybrd.nextInt();
        TotalMass= (ShareArray[e1-1]+ShareArray[e2-1]+ShareArray[e3-1]);
        System.out.println("Molar Mass: "+TotalMass);
        return TotalMass;
    }
}
