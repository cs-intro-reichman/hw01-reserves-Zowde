public class Triangle{

public static void main(String[] args)
{
  int a,b,c;
  a=Integer.parseInt(args[0]);
  b=Integer.parseInt(args[1]);
  c=Integer.parseInt(args[2]);
  
  boolean tf=(a+b)>c&&(b+c)>a&&(a+c)>b;
  System.out.println(a+","+" "+b+","+" "+c+":"+" "+tf);
}
}
//2, 3, 6: false
