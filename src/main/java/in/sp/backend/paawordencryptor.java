package in.sp.backend;

import java.math.BigInteger;
import java.security.MessageDigest;

public class paawordencryptor 
{
	public static String encrypt(String input) {
		try {
			MessageDigest md= MessageDigest.getInstance("MD5");
			md.update(input.getBytes());
			byte[] digest =md.digest();
			BigInteger no=new BigInteger(1,digest);
			String hashText= no.toString(16);
			while(hashText.length()<32) {
				hashText="0"+ hashText;
			}
			return hashText;
			
		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}
	}

}
