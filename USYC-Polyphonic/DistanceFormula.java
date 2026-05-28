import java.util.Scanner;

public class DistanceFormula 
{
        public static double DistanceFormulaCalc(Scanner kybrd)
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
}
