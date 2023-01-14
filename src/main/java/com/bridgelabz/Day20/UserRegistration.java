package com.bridgelabz.Day20;


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static String patterResult(boolean pattern){
        if(pattern){
            return "Valid";
           // System.out.println("Valid");
        }else{
            return "In-Valid";
           // System.out.println("Invalid!");
        }
    }
    public static String firstNameCheck(String name){
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
       return patterResult(namePattern);
    }

    public static String lastNameCheck(String name){
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
        return patterResult(namePattern);
    }

    public static String emailCheck(String name){
        boolean emailPattern = Pattern.matches("^(?=.*[a-z0-9._-])[a-z0-9._-]*[@]{1}(?=.*[a-z0-9.])[a-z0-9.]+[a-z]{2,4}$",name);
        return patterResult(emailPattern);
    }

    public static String phoneNumberCheck(String name){
        boolean numberPattern = Pattern.matches("^[0-9]{2} [0-9]{10}",name);
        return patterResult(numberPattern);
    }

    public static String passwordCheck(String name){
        boolean emailPattern = Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^\\d\\w])[A-Za-z0-9#?!@$%^&*-]{8,}",name);
        return patterResult(emailPattern);
    }

}
