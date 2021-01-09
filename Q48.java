/*
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
import java.math.BigInteger;

public class Q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q48().run());
	}
		 public String run() {
		
		  BigInteger x = BigInteger.TEN.pow(10);
		
		  BigInteger s = BigInteger.ZERO;
		
		  for (int i = 1; i <= 1000; i++)
		
		   s = s.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), x));
	
		  return s.mod(x).toString();
		 }}

//OUTPUT:9110846700



