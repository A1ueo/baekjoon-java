package s3.b14501;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] buff = br.readLine().split(" ");

		int n = Integer.parseInt(buff[0]);
		int m = Integer.parseInt(buff[1]);

		BigInteger factoN = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			factoN = factoN.multiply(BigInteger.valueOf(i));
		}
		
		BigInteger factoM = new BigInteger("1");
		for (int i = 1; i <= m; i++) {
			factoM = factoM.multiply(BigInteger.valueOf(i));
		}
		
		BigInteger facto = new BigInteger("1");
		for (int i = 1; i <= n - m; i++) {
			facto = facto.multiply(BigInteger.valueOf(i));
		}

		System.out.println(factoN.divide((factoM.multiply(facto))) );
	}
}
