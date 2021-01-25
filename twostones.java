import java.util.*;
class twostones{
    public static void main(String[]args)
    {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        if((1<=n)&&(n<=10000000))
        {
            if(n%2==0)
            {
                System.out.print("Bob");
            }
            else
            {
                System.out.print("Alice");
            }
        }
    }
}