import javax.crypto.spec.GCMParameterSpec;
import java.security.SecureRandom;

public class Example {

    public static void main(String[] args) {
        byte[] bytes = new byte[12];
        new SecureRandom().nextBytes(bytes);
        new GCMParameterSpec(32, bytes);
    }

}
