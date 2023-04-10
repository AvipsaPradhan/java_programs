package Arrays;

public class TrappingRainwater {
	public static void trappingrainwater(int arr[]) {
		int n=arr.length;
		int trapped_water=0,waterlevel;
		int leftmax[]=new int[n];
		leftmax[0]=arr[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(arr[i],leftmax[i-1]);
		}
		int rightmax[]=new int[n];
		rightmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rightmax[i]=Math.max(arr[i],rightmax[i+1]);
		}
		for(int i=0;i<n;i++) {
			waterlevel=Math.min(leftmax[i],rightmax[i]);
			trapped_water+=waterlevel-arr[i];
		}
		System.out.println("Amount of rainwater trapped:"+trapped_water);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,0,6,3,2,5};
		trappingrainwater(arr);

	}

}
