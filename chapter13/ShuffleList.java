package chapter13;
/*
 * this program implements a method that takes an arraylist of Numbers
 * and shuffles the list
 */
import java.util.ArrayList;
public class ShuffleList {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();

        //populate the list with some random values
        for(int i = 0; i < 20; i++){
            //using ints to keep it simple and easy to read output
            list.add((int)(Math.random() * 50 + 1));
        }

        System.out.println("Before shuffle: ");
        for(int i = 0; i < list.size(); i++){
            if(i + 1 % 5 == 0){
                System.out.println();
            }
            System.out.print(list.get(i) + " ");
        }

        shuffle(list);

        System.out.println("\n");
        System.out.println("After shuffle: ");
        for(int i = 0; i < list.size(); i++){
            if(i + 1 % 5 == 0){
                System.out.println();
            }
            System.out.print(list.get(i) + " ");
        }
    }

    public static void shuffle(ArrayList<Number> list){
        int index;
        Number temp;
        for(int i = 0; i < list.size(); i++){
            index = (int)(Math.random() * list.size());
            temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
    }
}
