public class Coins{

public static void main(String[] args)
{
    int quarter=Integer.parseInt(args[0])/25;
     int cent=Integer.parseInt(args[0])%25;
   System.out.println("Use"+" "+quarter+" "+"quarters"+" "+"and"+" "+cent+" "+"cents");
}
//Use 5 quarters and 7 cents
}
