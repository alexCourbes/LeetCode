import java.util.Iterator;
import java.util.LinkedList;


//Solution is greedy algorithm
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {



                int j = 1;
                int max = 0;

                for (int i = 0 ; j < prices.length ; ){

                    if(prices[j] - prices [i] >= 0 ){

                        max =  Math.max(max, prices[j] - prices [i]);
                        j++;
                    }else{
                        i=j;
                    }
                }


        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock b1 = new BestTimeToBuyAndSellStock();

        System.out.println(b1.maxProfit(new int[]{
                7,1,5,3,6,4}));

    }
}
