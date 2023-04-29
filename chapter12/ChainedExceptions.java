package chapter12;

/*
 * The purpose of this program is to explore chained exceptions
 */

public class ChainedExceptions {
    public static void main(String[] args){
        try{
            method1();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception{
        try{
            method2();
        }catch(Exception ex){
            throw new Exception("New info from method1");
        }
    }
    
    public static void method2() throws Exception{
        throw new Exception("New info from method2");
    }
}
