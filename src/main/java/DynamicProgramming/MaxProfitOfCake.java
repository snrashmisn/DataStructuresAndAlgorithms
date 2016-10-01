package main.java.DynamicProgramming;


/**
 * Created by rasn on 8/19/16.
 * https://www.interviewcake.com/question/java/cake-thief
 * TODO: Handle corner cases
 */
public class MaxProfitOfCake {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[3];
        cakes[0] = new Cake(7, 160);
        cakes[1] = new Cake(3, 90);
        cakes[2] = new Cake(2, 15);
        int capacity = 20;
        System.out.println(maxProfit(cakes, capacity));

    }

    public static int maxProfit(Cake[] cakes, int fullCapacity) {
        int[] profitArray = new int[fullCapacity + 1];
        for(int capacity = 0; capacity <= fullCapacity; capacity++){
            int currentMaxProfit = 0;
            for(Cake cake: cakes){
                if(cake.weight <= capacity){
                    int maxValueUsingCake = cake.value + profitArray[capacity - cake.weight];
                    currentMaxProfit = Math.max(currentMaxProfit , maxValueUsingCake);
                }
            }
            profitArray[capacity] = currentMaxProfit;
        }
        return profitArray[fullCapacity];
    }
}

class Cake{
    int weight;
    int value;
    Cake(int weight, int value){
        this.weight = weight;
        this.value = value;
    }
}
