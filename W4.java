import java.util.*;

/**
 * Write a description of class W4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W4
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number of terms you want to print");
        int n=s.nextInt();
        int i,j;
        System.out.println("\t for Loop");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                 System.out.print(j + " ");
            }
        System.out.println();
        }
    }
}
