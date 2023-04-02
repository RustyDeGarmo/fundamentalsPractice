package chapter7;

/*
 * This is just to play with the java.util.Arrays.fill method
 */

import java.util.Arrays;

class ArraysFill{
    public static void main(String[] args){
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};

        for(int i = 0; i < list1.length; i++){
            System.out.print(list1[i]);
        }
        System.out.println();
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i]);
        }
        System.out.println();

        Arrays.fill(list1, 5);
        Arrays.fill(list2, 1, 5, 8);
        
        
        for(int i = 0; i < list1.length; i++){
            System.out.print(list1[i]);
        }
        System.out.println();
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i]);
        }
        System.out.println();
    }
}