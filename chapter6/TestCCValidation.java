package chapter6;
/*
 * Tests for CCValidation methods
 */
public class TestCCValidation {
    public static void main(String[] args){
        testIsValid();
        testEvenSum();
        testGetDigit();
        testOddSum();
        testPrefixMatched();
        testGetsize();
        testGetPrefix();
    }

    public static void testIsValid(){
        System.out.println("Testing isValid");
        Long invalid = 4388576018402626L;
        Long valid = 4388576018410707L;

        System.out.println(valid + " should be true: " + CCValidation.isValid(valid));
        System.out.println(invalid + " should be false: " + CCValidation.isValid(invalid));
        System.out.println();
    }

    public static void testEvenSum(){
        System.out.println("Testing evenSum");
        Long invalid = 4388576018402626L;
        Long valid = 4388576018410707L;

        System.out.println("The double sum of the evens of " + invalid + " is " + 
            CCValidation.sumOfDoubleEvenPlace(invalid));
        System.out.println("It should be 37");
        System.out.println("The double sum of the evens of " + valid + " is " + 
            CCValidation.sumOfDoubleEvenPlace(valid));
        System.out.println("It should be 29");
        System.out.println();
    }

    public static void testGetDigit(){
        System.out.println("Testing getDigit");
        int two = 2;
        int three = 12;
        System.out.println(two + " should be 2: " + CCValidation.getDigit(two));
        System.out.println(three + " should be 3: " + CCValidation.getDigit(three));
        System.out.println();
    }

    public static void testOddSum(){
        System.out.println("Testing oddSum");
        Long invalid = 4388576018402626L;
        Long valid = 4388576018410707L;

        System.out.println("The double sum of the evens of " + invalid + " is " + 
            CCValidation.sumOfOddPlace(invalid));
        System.out.println("It should be 38");
        System.out.println("The double sum of the evens of " + valid + " is " + 
            CCValidation.sumOfOddPlace(valid));
        System.out.println("It should be 41");
            System.out.println();
    }

    public static void testPrefixMatched(){
        System.out.println("Testing prefixMatched");

        System.out.println("Should be true: " + CCValidation.prefixMatched(1234567L, 12));
        System.out.println("Should be false: " + CCValidation.prefixMatched(1234567L, 312));
        System.out.println();
    }

    public static void testGetsize(){
        System.out.println("Testing getSize");
        Long valid = 4388576018410707L;

        System.out.println("Should be 16: " + CCValidation.getSize(valid));
        System.out.println();
    }

    public static void testGetPrefix(){
        long number = 1234567L;
        System.out.println("Testing getPrefix");
        System.out.println("This should be 12: " + CCValidation.getPrefix(number, 2));
        System.out.println("This should be " + number + ": " + CCValidation.getPrefix(number, 12));
        System.out.println();
    }
}
