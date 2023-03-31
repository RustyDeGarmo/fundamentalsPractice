package chapter6;

/*
 * This program takes a credit card number as input and checks
 * if it's valid using the Luhn check.
 * 
 */

 class CCValidation{
    public static void main(String[] args){

    }

    // Return true if the card number is valid
    public static boolean isValid(long number){
        //TODO

        return false;
    }

    /* 
     * Sum every other number starting with the second from the right
     * and moving left. If the number is two digits, sum those digits.
     */
    public static int sumOfDoubleEvenPlace(long number){
        String num = String.valueOf(number);
        int sum = 0;
        for(int i = num.length() -2; i >= 0; i -= 2){
            sum += getDigit(Character.getNumericValue(num.charAt(i)) * 2);
        }

        return sum;
    }

    /* 
     * Return this number if it is a single digit, otherwise, 
     * return the sum of the two digits
     */
    public static int getDigit(int number){
        String num = String.valueOf(number);
        
        if(num.length() == 1){
            return number;
        }else{
            int indexZero = Character.getNumericValue(num.charAt(0));
            int indexOne = Character.getNumericValue(num.charAt(1));

            return indexZero + indexOne;
        }
    }

    /* 
     * Return the sum of every other number starting with the last 
     * and moving right to left
     */
    public static int sumOfOddPlace(long number){
        //TODO

        return 0;
    }

    // Return true if the number d is a prefix for number
    public static boolean prefixMatched(long number, int d){
        return String.valueOf(number).indexOf(String.valueOf(d)) == 0;
    }

    // Return the number of digits in d
    public static int getSize(long d){
        return String.valueOf(d).length();
    }

    /* 
     * Return the first k number of digits from number. 
     * If the number of digits in the number is less than k, 
     * return number.
     */
    public static long getPrefix(long number, int k){
        String numString = String.valueOf(number);

        if(numString.length() < k){
            return number;
        }else{
            return Integer.parseInt(numString.substring(0, k));
        }        
    }
 }