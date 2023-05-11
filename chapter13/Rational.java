package chapter13;
/*
 * This class creates rational numbers and provides methods to perform 
 * basic arithmetic with them
 */
public class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1; //don't divide by zero :p

    //default constructor
    public Rational(){
        this(0, 1);
    }

    //constructor for given numerator and denominator
    public Rational(long numerator, long denominator){
        long gcd = gcd(numerator, denominator); //greatest common divisor
        this.numerator = (denominator > 0 ? 1: -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    //getters
    public long getNumerator(){
        return numerator;
    }
    public long getDenominator(){
        return denominator;
    }

    public Rational add(Rational secondRational){
        long numer = numerator * secondRational.getDenominator() + 
            denominator * secondRational.getNumerator();
        long denom = denominator * secondRational.getDenominator();

        return new Rational(numer, denom);
    }

    public Rational subtract(Rational secondRational){
        long numer = numerator * secondRational.getDenominator() - 
            denominator * secondRational.getNumerator();
        long denom = denominator * secondRational.getDenominator();

        return new Rational(numer, denom);
    }

    public Rational multiply(Rational secondRational){
        long numer = numerator * secondRational.getNumerator();
        long denom = denominator * secondRational.getDenominator();

        return new Rational(numer, denom);
    }

    public Rational divide(Rational secondRational){
        long numer = numerator * secondRational.getDenominator();
        long denom = denominator * secondRational.getNumerator();

        return new Rational(numer, denom);
    }

    private static long gcd(long n1, long n2){
        long num1 = Math.abs(n1);
        long num2 = Math.abs(n2);
        
        int gcd = 1; //start here
        int k = 2; //first possible gcd

        while(k <= num1 && k <= num2){
            if(num1 % k ==0 && num2 % k == 0){
                gcd = k; //update gcd
            }
            k++;
        }

        return gcd;
    }

    @Override
    public String toString(){
        if(denominator == 1){
            return numerator + "";
        }else{
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object other){
        if((this.subtract((Rational)(other))).getNumerator() == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int intValue(){
        return (int)doubleValue();
    }

    @Override
    public float floatValue(){
        return (float)doubleValue();
    }

    @Override
    public double doubleValue(){
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue(){
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o){
        if(this.subtract(o).getNumerator() > 0){
            return 1;
        }else if(this.subtract(o).getNumerator() < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
