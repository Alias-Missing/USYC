import java.util.Scanner;
public class SetPoint 
{
    static Point A= new Point(0, 0);
    static Point B= new Point(0, 0);
    static Point C= new Point(0, 0);
    public static void SetupPoint(Scanner kybrd)
    {
        System.out.print("Please enter the first point's X value, 1-10: ");
        int x= kybrd.nextInt();
        A.SetX(x);
        System.out.print("Please enter the first point's Y value, 1-10: ");
        int y= kybrd.nextInt();
        A.SetY(y);
        System.out.print("Please enter the second point's X value, 1-10: ");
        x= kybrd.nextInt();
        B.SetX(x);
        System.out.print("Please enter the second point's Y value, 1-10: ");
        y= kybrd.nextInt();
        B.SetY(y);
        System.out.print("Please enter the third point's X value, 1-10: ");
        x= kybrd.nextInt();
        C.SetX(x);
        System.out.print("Please enter the third point's Y value, 1-10: ");
        y= kybrd.nextInt();
        C.SetY(y);
    }
}
