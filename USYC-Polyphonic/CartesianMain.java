import java.util.Scanner;
public class CartesianMain 
{
    public static void PrintMenu()
    {
        System.out.println("----Cartesian Menu----");
        System.out.println("1. Enter a Point (3 Max)");
        System.out.println("2. Display Graph");
        System.out.println("3. Display Coordinate of labelled point");
        System.out.println("4. Determine the Slope between two points");
        System.out.println("5. Determine the Distance between two points");
        System.out.println("6. Delete Point");
        System.out.println("7. Exit");
    }
    public static int GetMenuOpt(Scanner kybrd)
    {
        int opt;
        do
        {
            System.out.print("Please enter a menu option: ");
            opt= kybrd.nextInt();
            if (opt>7||opt<1)
            {
                System.out.println("Error: Invalid Menu option: Please try again!");    
            }
        }
        while (opt<1||opt>7);
        return opt;
    }
    public static void main(String[] args) 
    {
        Scanner kybrd= new Scanner(System.in);
        int opt=0;
        int[][] arr=new int[12][12];
        SetPoint.A.SetX(0);
        SetPoint.A.SetY(11);
        SetPoint.B.SetX(0);
        SetPoint.B.SetY(11);
        SetPoint.C.SetX(0);
        SetPoint.C.SetY(11);
        int a1=SetPoint.A.GetX();
        int b1=SetPoint.B.GetX();
        int c1=SetPoint.C.GetX();
        int a2=SetPoint.A.GetY();
        int b2=SetPoint.B.GetY();
        int c2=SetPoint.C.GetY();
        arr[a2][a1]=1;
        arr[b2][b1]=2;
        arr[c2][c1]=3;
        do
        {
            PrintMenu();
            opt=GetMenuOpt(kybrd);
            switch (opt)
            {
                case 1 ->
                {
                    SetPoint.SetupPoint(kybrd);
                }
                case 2 ->
                {
                    arr=new int[12][12];
                    for (int row=10; row >=0; row--)
                    {
                        arr[0][row]=row;
                    }
                    for (int col=10; col>=0; col--)
                    {
                        arr[col][0]=col;
                    }
                    arr[a2][a1]=1;
                    arr[b2][b1]=2;
                    arr[c2][c1]=3;
                    CartesianPrintGraph.PrintGraph(arr);
                }
                case 3 ->
                {
                    System.out.print("Enter a coordinate, 1, 2, or 3: ");
                    do {    
                    opt= kybrd.nextInt();
                    if (opt>3||opt<1)
                    {
                        System.out.println("Error: Invalid Menu option: Please try again!");    
                    }
                    if (opt==1)
                    {
                        System.out.println("X: "+SetPoint.A.GetX());
                        System.out.println("Y: "+SetPoint.A.GetY());
                        System.out.println("Label: 1");
                        System.out.println("Internal Label: Point A");
                    }
                    if (opt==2)
                    {
                        System.out.println("X: "+SetPoint.B.GetX());
                        System.out.println("Y: "+SetPoint.B.GetY());
                        System.out.println("Label: 2");
                        System.out.println("Internal Label: Point B");
                    }
                    if (opt==3)
                    {
                        System.out.println("X: "+SetPoint.C.GetX());
                        System.out.println("Y: "+SetPoint.C.GetY());
                        System.out.println("Label: 3");
                        System.out.println("Internal Label: Point C");
                    }
                    } while (opt<1||opt>3);
                }
                case 4 ->
                {
                    double reutrn= CartesianSlope.Slope(kybrd);
                    System.out.println("Slope: "+reutrn);
                }
                case 5 ->
                {
                    double reutrn=CartesianDistance.DistanceFormulaCalc(kybrd);
                    System.out.println("Distance: "+reutrn);
                }
                case 6 ->
                {
                    a1=SetPoint.A.GetX();
                    b1=SetPoint.B.GetX();
                    c1=SetPoint.C.GetX();
                    a2=SetPoint.A.GetY();
                    b2=SetPoint.B.GetY();
                    c2=SetPoint.C.GetY();
                    System.out.print("Enter a coordinate to delete, 1, 2, or 3: ");
                do  {
                        opt = kybrd.nextInt();
                        if (opt>3||opt<1)
                        {
                        System.out.println("Error: Invalid Menu option: Please try again!");    
                        }
                        if(opt==1)
                        {
                            arr[a1][a2]=0;
                            SetPoint.A.SetX(0);
                            SetPoint.A.SetY(11);
                            a1=SetPoint.A.GetX();
                            a2=SetPoint.A.GetY();
                            arr[a1][a2]=0;
                            System.out.println("Point Deleted.");
                        }
                        if(opt==2)
                        {
                            arr[b1][b2]=0;
                            SetPoint.B.SetX(0);
                            SetPoint.B.SetY(11);
                            b1=SetPoint.B.GetX();
                            b2=SetPoint.B.GetY();
                            arr[b1][b2]=0;
                            System.out.println("Point Deleted.");
                        }
                        if(opt==3)
                        {
                            arr[c1][c2]=0;
                            SetPoint.C.SetX(0);
                            SetPoint.C.SetY(11);
                            c1=SetPoint.C.GetX();
                            c2=SetPoint.C.GetY();
                            System.out.println("Point Deleted.");
                        }
                    } while (opt<1||opt>3);
                }
            }
        } while(opt!=7);
    }
}
