import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenFibanocci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            
            long evenFactor = 2;
            long evenFactor1 = 0;
            
            long result = evenFactor;
            while(true) {
                long evenFibanocci = ((4 * evenFactor) + evenFactor1);
                evenFactor1 = evenFactor;
                evenFactor = evenFibanocci;
                if(evenFactor > n) {
                    break;
                }
                result += evenFactor;
            }
            
            System.out.println(result);
        }
    }
}
