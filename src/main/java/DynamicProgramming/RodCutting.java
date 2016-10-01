package main.java.DynamicProgramming;

/**
 * Created by rasn on 8/22/16.
 */
public class RodCutting {
    public static void main(String[] args) {
        System.out.println("\"abc3\".equalsIgnoreCase(\"ABC3\") = " + "abc3".equalsIgnoreCase("ABC3"));
        int[] price = new int[]{1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.println("rodCut(price, 4) = " + rodCut(price, 4));
        int arr[] = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println("rodCut(price, arr.length) = " + rodCut(arr, arr.length));
    }

    public static int rodCut(int[] price, int length){
        if(price == null || price.length == 0) return 0;

        int[] maxProfit = new int[price.length + 1];
        maxProfit[0] = 0;
        for(int l = 1 ; l <= length ; l++){
            int profit = 0;
            for (int i = 0; i < l ; i++){
                profit = Math.max(maxProfit[l - i - 1] + price[i], profit);
            }
            maxProfit[l] = profit;
        }
        return maxProfit[length];
    }
}
