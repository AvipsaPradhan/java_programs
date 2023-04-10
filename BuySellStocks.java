package Arrays;

public class BuySellStocks {
	public static int buysellstocks(int price[]) {
		int n=price.length;
		int buy_price=Integer.MAX_VALUE,sell_price=Integer.MIN_VALUE;
		for(int i=0;i<=n-2;i++) {
			if(buy_price>price[i]) {
				buy_price=price[i];
			}
		}
		for(int i=1;i<n;i++) {
			if(sell_price<price[i]) {
				sell_price=price[i];
			}
		}
		if(buy_price>sell_price) {
			return 0;
		}
		else {
			return sell_price-buy_price;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[]= {7,1,5,3,6,4};
		int profit=buysellstocks(price);
		if(profit==0) {
			System.out.println("No profit");
		}
		else {
			System.out.println("Profit earned:"+profit);
		}

	}

}
