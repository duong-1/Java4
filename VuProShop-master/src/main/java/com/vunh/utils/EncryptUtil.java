package com.vunh.utils;

import org.mindrot.jbcrypt.BCrypt;

public class EncryptUtil {
    public static String encrypt(String string) {
        return BCrypt.hashpw(string, BCrypt.gensalt());
    }

    public static Boolean verify(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
