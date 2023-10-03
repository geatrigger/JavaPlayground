package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
//            Integer appUserIdInt = 999;
//            Map<String, Object> logBox = new HashMap<>();
//            Map<String, Object> user = new HashMap<>();
//            logBox.put("user", user);
//            user.put("app_user_id", appUserIdInt);
//
//            Map<String, String> userOutput = (Map<String, String>) logBox.get("user");
//            Optional<String> appUserIdOpt = Optional.ofNullable(userOutput.get("app_user_id")); //에러 발생 안함
//            System.out.println(appUserIdOpt);
//            userOutput.get("app_user_id"); //에러 발생 안함
//            System.out.println("app_user_id get success");
//            String userOutputStr = appUserIdOpt.get();
//            System.out.println("appUserIdOpt get success");
//            String appUserIdStr = userOutput.get("app_user_id"); //에러 발생 함
//            System.out.println(appUserIdStr);

//            Object number = 1;
//            Optional<Object> objOpt = Optional.ofNullable(Optional.ofNullable(number));
//            System.out.println(objOpt);
//            Optional<String> strOpt = (Optional<String>) objOpt.get();
//            System.out.println(strOpt);
//            strOpt.get();
//            System.out.println(strOpt);
//            strOpt.get().toString();
//            System.out.println(strOpt.get().toString());
//            String numberStr = strOpt.get();
//            System.out.println(numberStr);

            ExceptionOccurObject exceptionOccurObject = new ExceptionOccurObject();
            System.out.println("make object");
            exceptionOccurObject.catchException();
            System.out.println("catch exception");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
