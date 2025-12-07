import java.util.*;

/**
 * Write a description of class W6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W6
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number of terms you want to print");
        int n=s.nextInt();
        int i,j;
        System.out.println("Your pattern is:");
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                 System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
