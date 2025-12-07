import java.util.*;
import java.util.Scanner;

/**
 * Write a description of class W8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W8
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.printf("Enter a number for muntiplication");
        int num=s.nextInt();
        
        System.out.printf("\n muntiplication Table of"+num+ ":" );
        int i,j;
        
        for(i=1;i<=10; i++)
        {
            System.out.printf("%d * %d = %d%n", num, i, num*i);
        }
    }
}    