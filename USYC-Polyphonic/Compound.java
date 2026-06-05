public class Compound
{
    //Vars.
    double[] ShareArray= Periodically.MolarMassArray;
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
    public double GetMolarMassofCompound()
    {
        double TotalMass=0.0;
        TotalMass += ShareArray[this.Element1-1];
        TotalMass += ShareArray[this.Element2-1];
        TotalMass += ShareArray[this.Element3-1];
        return TotalMass;
    }
}
