public class CartesianPrintGraph
{
     public static void PrintGraph(int[][] arr)
    {
        for (int row = 0; row < arr.length; row++) 
        {
        for (int col = 0; col < arr[row].length; col++)
        System.out.printf("%4d", arr[row][col]);
        System.out.println();
        }
    }
}
