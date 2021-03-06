/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import com.github.mervick.aes_everywhere.Aes256;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author rirll
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws UnsupportedEncodingException, Exception {
        // TODO code application logic here
        String text = "1234123512379874";
        String pass = "LOPEZ";

        byte[] text_bytes = text.getBytes("UTF-8");
        byte[] pass_bytes = pass.getBytes("UTF-8");

        // strings encryption
        String encrypted = Aes256.encrypt(text, pass);
        System.out.println("CADENA CIFRADA");
        System.out.println(encrypted);

        // bytes encryption
        byte[] encrypted_bytes = Aes256.encrypt(text_bytes, pass_bytes);
        System.out.println("BYTES CIFRADOS");
        System.out.println(encrypted_bytes);

        // strings decryption
        String decrypted = Aes256.decrypt(encrypted, pass);
        System.out.println("CADENA DESCIFRADA");
        System.out.println(decrypted);

        // bytes decryption
        byte[] decrypted_bytes = Aes256.decrypt(encrypted_bytes, pass_bytes);
        System.out.println("BYTES DESCIFRADOS");
        System.out.println(decrypted_bytes);
    }
    
}
