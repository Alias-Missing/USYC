import java.util.Scanner;

public class GetMenuChoice 
{
    public static int GetMenuOpt(Scanner kybrd)
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
}
