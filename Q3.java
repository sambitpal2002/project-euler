
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		long num = 600851475143L;
		
		for(int i=2;i<num; i++)
        {
            if(num%i == 0)
            {
                
                num=num/i;
            }
        }
        if(num>2)
            System.out.println("PRIME FACTOR :"+num);
		
		
		
		

	}

}
//OUTPUT:6857
