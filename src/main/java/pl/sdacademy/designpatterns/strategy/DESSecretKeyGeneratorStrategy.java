package pl.sdacademy.designpatterns.strategy;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DESSecretKeyGeneratorStrategy implements SecterKeyGenerationStrategy {


    @Override
    public SecretKey generate() throws NoSuchAlgorithmException {
        final KeyGenerator keyGenetaor = KeyGenerator.getInstance("DES");
        keyGenetaor.init(new SecureRandom());
        return keyGenetaor.generateKey();
    }
}
