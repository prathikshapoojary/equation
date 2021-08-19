import java.io.*;
import java.util.*;

class equation{

    public static void main(String[] args)
    {
        int b,c,a;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the first number:");
        b = in.nextInt();
        System.out.print("\nEnter the second number:");
        c = in.nextInt();
        a=((b*b)+(c*c));
        System.out.println("Answer is :"+(a*a));
        
    }
}
