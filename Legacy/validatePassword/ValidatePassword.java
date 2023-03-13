/*                                                                           
    The purpose of this program is validate an inputted password. The password 
    should be a minimum of eight characters, only contain letters and digits, 
    and contain at least two digits.
*/

import java.util.Scanner;


public class ValidatePassword{
    public static void main(String[] args){
        //test values: one should pass two should fail three should fail
        // String passOne = "1sometexthere2";
        // String passTwo = "123text";
        // String passThree = "@124sometext";

    //    System.out.println("Test passwords: ");
    //    testPassword(passOne);
    //    testPassword(passTwo);
    //    testPassword(passThree);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String userPassword = input.nextLine();

        testPassword(userPassword);

        input.close();    
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
        return pass.length() > 8;
    }

    public static boolean validateDigits(String pass){
        int digitCounter = 0;

        for(int i = 0; i < pass.length(); i++) {
            if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
                digitCounter++;
            }
        }


        return digitCounter >= 2;
    }

    public static boolean validateAlphanumericOnly(String pass){
        boolean alphaNumeric = false;

        for(int i = 0; i < pass.length(); i++) {
            if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
                //character is a digit
                alphaNumeric = true;
            } else if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z'){
                //character is upper case letter
                alphaNumeric = true;
            }else if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z'){
                //character is lower case letter
                alphaNumeric = true;
            }else{
                //character is invalid
                alphaNumeric = false;
                return alphaNumeric;
            }
        }

        return alphaNumeric;
    }

    

}

