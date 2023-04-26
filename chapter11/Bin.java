package chapter11;
/*
 * This program creates a bin class to store a list of weighted objects
 * Each Bin can hold a maximum of 10 weight
 * 
 */
import java.util.*;

public class Bin {
    final private int MAX_WEIGHT = 10;
    private int weight = 0;
    private int currentObjects = 0;
    private ArrayList<Integer> weights = new ArrayList<>();

    Bin(){
        //default constructor
    }

    Bin(int weight){
        this.addObject(weight);
    }

    Bin(ArrayList<Integer> weights){
        this.weights = weights;
    }

    public int getMAX_WEIGHT(){
        return MAX_WEIGHT;
    }

    public int getWeight(){
        return weight;
    }

    public ArrayList<Integer> getWeights(){
        return weights;
    }

    public int getCurrentObjects() {
        return currentObjects;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public Boolean addObject(int num){
        //if obj is successfully added to the Bin return true, else return false
        if(weight + num < MAX_WEIGHT){
            weights.add(num);
            weight += num;
            currentObjects++;
            return true;
        }else{
            return false;
        }
    }
}
