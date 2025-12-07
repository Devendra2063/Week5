import java.util.*;

public class W1
{
    
    public static void main(String[] args){
        System.out.println("Enter the number of terms you want to print");
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i=1;
        System.out.println("\t for Loop");
        for(i=1;i<=n;i++)
        {
            System.out.println(i*2 + "");
        }
        System.out.println();
        
        int j=1;
        System.out.println("\t while Loop");
        while(j<=n)
        {
            System.out.println(j*2 + "");
            j++;
        }
        System.out.println();
        
        int k=1;
        System.out.println("\t do-while Loop");
        do
        {
            System.out.println(k*2 + "");
            k++;
        }while(k<=n);
        System.out.println();
    }
}
