package exercises.advanced;

import java.security.MessageDigest;
import java.util.Scanner;

public class SHA256 {

    public void solve() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(str.getBytes());

            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
