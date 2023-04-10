package Arrays;

public class BruteForce {
	public static void bruteforce(int arr[]) {
		int n=arr.length;
		int ms=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(ms<sum) {
					ms=sum;
				}
			}
		}
		System.out.println("Maximum sum of subarrays:"+ms);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,-2,6,-1,3};
        bruteforce(arr);
	}

}
