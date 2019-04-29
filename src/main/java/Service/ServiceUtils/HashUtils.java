package Service.ServiceUtils;

import org.apache.commons.codec.digest.DigestUtils;

public class HashUtils {

    public static String toHash(String text){

        String hash = DigestUtils.sha256Hex(text);
        return hash;
    }
}
