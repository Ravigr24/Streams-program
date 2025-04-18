/******************************************************************************

 Find Maximum Profit:
 You are given a list of integers representing stock prices on consecutive days.
 Your task is to implement a method `maxProfit()` to find the maximum profit that can be achieved by buying and
 selling stocks on these days. However, you are allowed to make at most one transaction
 (i.e., buy one and sell one share of the stock), and you cannot sell a stock before you buy one.

 For example, given the list `[7, 1, 5, 3, 6, 4]`, the maximum profit that can be achieved is `5`,
 by buying on day 2 (price = 1) and selling on day 5 (price = 6).

 Your implementation should have a time complexity of O(n), where n is the number of elements in the input list.

 Be prepared to explain your approach and the time complexity of your solution during the interview.

 *******************************************************************************/

package com.practice.java8;


public class MaxProfit
{
    public static void main(String[] args) {
        int[] stockPrices = new int[]{7, 1, 5, 3, 6, 4};
        //Expected answer is : 5

        int maxProfit = getMaxProfit(stockPrices);
        System.out.println("Max profit is : "+maxProfit);
    }

    static int getMaxProfit(int[] stockPrices){
        int minPrice = stockPrices[0];
        int maxProfit = 0;

        for(int i = 1; i< stockPrices.length; i++){
            minPrice = Math.min(minPrice , stockPrices[i]);
            maxProfit = Math.max(maxProfit, stockPrices[i]- minPrice);
	        /*
	             time complexity is O(n).

	             day1: i = 1, minPrice = 7 ,stockPrices = 1,
	             update minPrice = 1, maxProfit = 0 .

	             day2: i = 2, minPrice = 1, stockPrices = 5,
	             update minPrice = 1, maxProfit = 4.

	             day 3: i = 3, minPrice = 1, stockPrices = 3,
	             update minPrice = 1, maxProfit = 4.

	             day 4: i = 4, minPrice = 1, stockPrices = 6,
	             update minPrice = 1, maxProfit = 5.

	             day 5: i = 5, minPrice = 1, stockPrices = 4,
	             update minPrice = 1, maxProfit = 5.
	       */

        }

        return maxProfit;
    }
}
