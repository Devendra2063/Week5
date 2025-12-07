import java.util.Scanner;

/**
 * Write a description of class W3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W3
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to square and add you want to print");
        int n=s.nextInt();
        int k=1;
        int sum=0;
        System.out.println("\t do-while Loop");
        do
        {
            sum +=k*k;
            k++;
        }while(k<=n);
        
        System.out.println("\nSum of squares of first" +n+"natural numbers is : " +sum);
    }
}
