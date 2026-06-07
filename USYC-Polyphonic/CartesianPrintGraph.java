public class CartesianPrintGraph
{
     public static void PrintGraph(int[][] arr)
    {
        for (int row = 0; row < 11; row++) 
        {
        for (int col = 0; col < 11; col++)
        System.out.printf("%4d", arr[row][col]);
        System.out.println();
        }
    }
}
