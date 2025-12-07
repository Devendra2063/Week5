import java.util.*;

/**
 * Write a description of class W2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W2
{
     
    public static void main(String[] args){
        System.out.println("Enter the number of squares you want to print");
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int j=1;
        System.out.println("\t while Loop");
        while(j<=n)
        {
            System.out.println(j*j + "");
            j++;
        }
        System.out.println();
        
    }
}
