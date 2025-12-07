import java.util.*;

/**
 * Write a description of class W5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W5
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number of terms you want to print");
        int n=s.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                 System.out.print( "  ");
            }
            for(j=1;j<=i;j++)
            {
                 System.out.print(j + " ");
            }
        System.out.println();
        }
    }
}
