package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SecretKeyGenerator {

    public SecretKey create (final String alg) throws NoSuchAlgorithmException {
        switch (alg) {
            case "AES":
                return new AESSecretKeyGenerationStrategy().generate();
            case "DES":
                return new DESSecretKeyGeneratorStrategy().generate();
        } throw new NoSuchAlgorithmException();

    }
}
