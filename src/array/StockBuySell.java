package array;

public class StockBuySell {

	public void findMaximumProfit(int[] arr) {
		int profit = 0;
		int buy = 0;
		boolean buyFlag = false;
		int sell = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1] && buyFlag == false) {
				buy = arr[i];
				System.out.println("Buy on Day " + i);
				buyFlag = true;
			} else if (arr[i] > arr[i + 1] && buyFlag == true) {
				buyFlag = false;
				System.out.println("Sell on Day " + i);
				sell = arr[i];
			}

			if (i == arr.length - 2 && arr[i] < arr[i + 1]) {
				System.out.println("Sell on Day " + (i+1));
				sell = arr[i + 1];
			}
			profit = profit + sell - buy;
			buy=0;
			sell=0;
		}
		System.out.println(profit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price[] = { 100, 180, 260, 310, 40, 535, 695 };
		StockBuySell profit = new StockBuySell();
		profit.findMaximumProfit(price);
	}

}
