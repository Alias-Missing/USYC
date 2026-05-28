import java.util.Scanner;
public class GetMenuChoice_GASLAW 
{
    public static int GetMenuOpt_GASLAW(Scanner kybrd)
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
}
