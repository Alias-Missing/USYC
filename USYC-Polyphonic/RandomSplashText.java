import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class RandomSplashText 
{
    public static void RandomSpalshText()
{
    LocalDate today= LocalDate.now();
    MonthDay now = MonthDay.from(today);
    MonthDay crimas= MonthDay.of(Month.DECEMBER, 25);
    int SpalshText=(int)(Math.random()*23)+1;
    switch (SpalshText)
    {
    case 1:
        {
            System.out.println("Nine Sols Characters: *Exists* Me: Would");
        }
    break;
    case 2:
        {
        System.out.println("TREACHERY TOMORROW!!");
        }
    break;
    case 3:
        {
        System.out.println("I WANT TO BELIEVE.");
        System.out.println("SIZE 2 FISH.");
        }

    break;

    case 4:
        {
        System.out.println("MANKIND IS DEAD");
        System.out.println("BLOOD IS FUEL");
        System.out.println("HELL IS FULL");
        }
    break;
    case 5:
        {
            System.out.println("How do people make games out of Java?");
        }
    break;
    case 6:
        {
            System.out.println("Man, I need some kind of app development guy on this shit right fucking now!");
        }
    break;
    case 7:
        {
            System.out.println("THY END IS NOW!");
            System.out.println("CRUSH!");
            System.out.println("DIE!");
            System.out.println("JUDGEMENT!");
        }
        break;
        case 8:
        {
            System.out.println("Will anyone read this? Probably not.");
        }
        break;

        case 9:
        {    
            System.out.println("YOMI HUSTLE!");
        }
       break;
        case 10:
        {    
            System.out.println("This is (no longer) longer than main lmfao. Fact-Checked by: The Fucking Calculator That Came On The Fucking Laptop (TM)");
        }
        break;
        case 11:
        {
            System.out.println("Don't look at bbbbb.java, it's THE MONOLITH (TM)");
        }
        break;
        case 12:
        {
            System.out.println("bbbbb 325 lines? Nah.");
            System.out.println("aaaaa *730 lines? Yea.");
        }
        break;
        case 13:
        {
            System.out.println("Stand proud, bbbbb.java, you were strong.");
        }
        break;
        case 14:
        {
            System.out.println("Nah, I'd aaaaa.java");
        }
        break;
        case 15:
        {
            System.out.println("Hours spent making main menu: 0.00003");
            System.out.println("Hours spent making these splash texts: 333333.333333");
        }
        break;
        case 16:
        {
            System.out.println("Still smaller than the Oregon Trail! 23 KB<3500 km");
        }
        break;
        case 17:
        {
            System.out.println("Geforce RTX 5060");
            System.out.println("B860M D3HP");
            System.out.println("Peerless Assassin 120 SE");
            System.out.println("Intel Core Ultra 5");
            System.out.println("Lian Li V100R");
            System.out.println("MSI PSU");
            System.out.println("Dev Specs");
        }
        break;
        case 18:
        {
            System.out.println("I am going to ULTRAKILL you!!");
        }
        break;
        case 19:
        {
            System.out.println("Guest");
            System.out.println("Visit");
        }
        break;
        case 20:
        {
            System.out.println("Also try Bet Break!");
            System.out.println("(Note: Bet Break is not availible to the public yet, and, so, you cannot, in fact, try Bet Break.)");
        }
        break;
        case 21:
        {
            System.out.println("Also see: LinuxGuide! (I think I accidentally wiped it off my computer from installing ArchLinux...)");
        }
        break;
        case 22:
        {
            System.out.println("If any potential employer sees this, I hope you're prepared for my only capability: massive CLI projects. :D");
        }
        break;
        case 23:
        {
            System.out.println("You wanna guess how much time PgUp and PgDwn save scrolling through this thing?");
        }
        break;
    }
    if (now.equals(crimas))
    {
        System.out.println("crimas :3");
    }           
}
}
