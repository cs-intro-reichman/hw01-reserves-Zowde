public class Gen3 {

public static void main(String[] args)
{
    double Max=Double.parseDouble(args[1]);
    double Min=Double.parseDouble(args[0]);
   int x,y,z;
    x=(int)(Min + (Math.random() * (Max - Min)));
    y=(int)(Min + (Math.random() * (Max - Min)));
    z=(int)(Min + (Math.random() * (Max - Min)));
   System.out.println(x);
   System.out.println(y);
   System.out.println(z);
   int min=Math.min(Math.min(x,y),z);
   System.out.println("The minimal generated number was"+" "+min);
}

}


/*% java Gen3 10 15
14
11
10
The minimal generated number was 10
*/

