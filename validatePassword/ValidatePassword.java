/*                                                                           
    The purpose of this program is validate an inputted password. The password 
    should be a minimum of eight characters, only contain letters and digits, 
    and contain at least two digits.
*/

import java.util.Scanner;

public class ValidatePassword{
    public static void main(String[] args){
    //test values: one should pass two should fail
    String passOne = "1sometexthere2";
    String passTwo = "123text";

    testPassword(passOne);
    testPassword(passTwo); 

    }

    public static void testPassword(String pass){
        
        if(validateLength(pass) && validateDigits(pass) && 
            validateAlphanumericOnly(pass)){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }

    public static boolean validateLength(String pass){
        return pass.length() > 8 ? true : false;
    }

    public static boolean validateDigits(String pass){
        return false;
    }

    public static boolean validateAlphanumericOnly(String pass){
        return false;
    }

    

}

