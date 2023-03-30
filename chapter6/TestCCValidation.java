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
        Long testVal = 4388576018402626L;

        System.out.println("The double sum of the evens of " + testVal + " is " + 
            CCValidation.sumOfDoubleEvenPlace(testVal));
        System.out.println("It should be 37");
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
        Long testVal = 4388576018402626L;

        System.out.println("The sum of odds of " + testVal + " is " + 
            CCValidation.sumOfOddPlace(testVal));
            System.out.println("It should be 38");
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
        System.out.println("Testing getPrefix");
        CCValidation.getPrefix(1234567L, 12);
        System.out.println();
    }
}
