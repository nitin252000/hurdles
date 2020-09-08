import java.util.Scanner;
import java.math.*;
public class hurdlerace {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int max=0;
        for(int j=0;j<n;j++)
        {
            max=Math.max(max,sc.nextInt());
        }
        if(k-max<0)
        {
            System.out.println(Math.abs(k-max));
        }
        else
        {
            System.out.println(0);
        }
    }
}

