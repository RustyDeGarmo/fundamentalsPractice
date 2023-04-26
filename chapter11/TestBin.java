package chapter11;
/*
 * This program tests the Bin class. We take user input for how many objects 
 * there are and then the weight of each object. We add each object to the first 
 * Bin that can hold it. If no Bin can hold it we create a new Bin.
 * 
 */
import java.util.*;

public class TestBin {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("How many objects are there? ");
        int numberOfObjects = input.nextInt();
        int[] weights = new int[numberOfObjects];
        ArrayList<Bin> Bins = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the weights of each object: ");
        for(int i = 0; i < numberOfObjects; i++){
            weights[i] = input.nextInt();
        }

        //create the first Bin
        Bins.add(new Bin());

        //add each object to a Bin until there are no more objects
        //in hind sight I could have used a for each loop but this is already 
        //here, leave for a refactoring exercise?
        int counter = 0; //count how many objects have been added to a bin
        int pointer = 0; //point to the bin we're interested in
        while(counter < numberOfObjects){
            //attempt to add the object to a Bin
            //if the object doesn't fit, check the next Bin until all Bins have 
            //been checked.
            //if the object doesn't fit in any Bin, create a new Bin
            if(Bins.get(pointer).addObject(weights[counter])){
                counter++; //object added, increment counter
            }else if(pointer >= Bins.size() - 1){
                //object doesn't fit in any of the bins, add a new bin
                Bins.add(new Bin(weights[counter]));
                pointer = 0;//start over at the first bin for the next object
                counter++;//object added, increment counter
            }else{
                pointer++;//object doesn't fit in current bin, move to next bin
            } 
        }

        //print the weights of the objects in each bin
        ArrayList<Integer> bin = new ArrayList<Integer>();
        for(int i = 0; i < Bins.size(); i++){
            bin = Bins.get(i).getWeights();
            System.out.print("Bin " + i + " contains objects with weight: ");
            for(int j = 0; j < bin.size(); j++){
                System.out.print(bin.get(j) + " ");
            }
            System.out.println();
        }
    }
    
}
