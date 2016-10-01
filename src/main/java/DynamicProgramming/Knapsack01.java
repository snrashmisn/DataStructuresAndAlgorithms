package main.java.DynamicProgramming;

/**
 * Created by rasn on 10/1/16.
 */
public class Knapsack01 {
    public static void main(String[] args) {
        Item[] items = {new Item(1, 1), new Item(3, 4), new Item(4, 5), new Item(5, 7)};
        int weight = 7;
        System.out.println("weight = " + knapsack(items, weight));
    }

    public static int knapsack(Item[] items, int weight){
        int[][] matrix = new int[items.length][weight + 1];
        for(int i = 0; i < items.length; i++){
            for(int j = 0; j <= weight; j++){
                if(j == 0 || i == 0){
                    matrix[i][j] = 0;
                } else {
                    if(j < items[i].weight ){
                        matrix[i][j] = matrix[i-1][j];
                    } else {
                        matrix[i][j] = Math.max(matrix[i-1][j], items[i].value + matrix[i-1][j-items[i].weight]);
                    }
                }
            }
        }
        printItems(matrix, items, weight);
        return matrix[items.length-1][weight];
    }

    private static void printItems(int[][] matrix, Item[] items, int weight) {
        int i = matrix.length - 1, j = matrix[0].length - 1;
        while (i >= 0 && j>= 0 && weight > 0){
            if(i > 0 && matrix[i - 1][j] == matrix[i][j]){
                //This item was not picked, go to previous item.
                i--;
            } else {
                weight = weight - items[i].weight;
                System.out.println("item picked: weight  = " + items[i].weight + ", value " + items[i].value);
                j = j - i;
                i--;
            }
        }
    }
}

class Item{
    int weight;
    int value;
    Item(int weight, int value){
        this.weight = weight;
        this.value = value;
    }
}
