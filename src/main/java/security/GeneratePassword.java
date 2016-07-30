package security;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by maksy on 30-Jul-16.
 */
public class GeneratePassword {
    public static String generatedSecuredPasswordHash(String originalPassword){
        String generatedSecuredPasswordHash = "[" + DigestUtils.md5Hex(originalPassword) + "]";
        return generatedSecuredPasswordHash;
    }

    public static boolean comparePassword(String iPassword, String dbPassword){
        boolean matched = iPassword.equals(dbPassword);
        return matched;
    }
}
