package com.devxschool.apiframework.utilities;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import static java.security.CryptoPrimitive.MAC;
import org.apache.commons.codec.binary.Base64;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class HashEncryptingAndAPITimeZones {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        LocalTime currentTime  = LocalTime.now();
        System.out.println(currentTime);

        LocalTime currentTime2 = LocalTime.parse("09:30");

        System.out.println(currentTime2);

        LocalTime of = LocalTime.of(9,45);
        System.out.println(of);


       LocalTime ofNow = LocalTime.of(9,59);
        System.out.println(ofNow);

        LocalTime current = LocalTime.of(6,00);
        LocalTime oftyPlusOneHour = current.plus(1, ChronoUnit.HOURS);
        System.out.println(current);
        System.out.println(oftyPlusOneHour);

        boolean isBefore = LocalTime.parse("09:20").isBefore(LocalTime.parse("09:30"));
        System.out.println(isBefore);

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);


//
//       String  key   =  "account-ef7mwo6PMamqzZLHnVPy";
//
//        String secret = "2s3zmdiMaxBCZoqbqJPkgUAGne6a";
//
//        Mac sha384 = Mac.getInstance("HmacSHA384");
//
//        SecretKeySpec s_key = new SecretKeySpec(secret.getBytes(),"HmacSHA256");
//
//        sha384.init(s_key);
//
//        String hash = Base64.encodeBase64String(sha384.doFinal(secret.getBytes()));
//
//
//
//        System.out.println("Hash value " + hash);





    }
}
