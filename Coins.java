public class Coins{

public static void main(String[] args)
{
    int quarter=Integer.parseInt(args[0])/25;
     int cent=Integer.parseInt(args[0])%25;
   System.out.println("Use "+" "+quarter+" "+"quarters"+" "+cent+" "+"cents");
}

}
