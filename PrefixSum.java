package Arrays;

public class PrefixSum {
	public static void prefixsum(int arr[]) {
		int n=arr.length;
		int prefix[]=new int[n];
		int ms=0;
		int curr_sum=0;
		for(int i=0;i<n;i++) {
			prefix[i]=i==0?arr[i]:prefix[i-1]+arr[i];
        }
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				curr_sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
			}
			if(ms<curr_sum) {
				ms=curr_sum;
			}
		}
		System.out.println("Maximum sum of subarray:"+ms);
	}
	public static void main(String[] args) {
		int arr[]= {1,-2,6,-1,3};
		prefixsum(arr);
	}
}
