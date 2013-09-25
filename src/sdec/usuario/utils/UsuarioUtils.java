package sdec.usuario.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

public abstract class UsuarioUtils {

	public static String encryptSha(String password){
		 try {
			 MessageDigest md;
			 md = MessageDigest.getInstance("SHA-1");
			 md.update(password.getBytes());
			 byte[] mb = md.digest();
			 return new String (Hex.encodeHex(mb));
			
		 } catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
   	     }
		return "";
	}
	
}
