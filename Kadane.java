package Arrays;

public class Kadane {
	public static void kadane(int arr[]) {
		int n=arr.length;
		int ms=Integer.MIN_VALUE,cs=0;
		for(int i=0;i<n;i++) {
			cs+=arr[i];
			if(cs<0) {
				cs=0;
			}
			else {
				if(ms<cs) {
					ms=cs;
				}
			}
		}
		System.out.println("Max sum of subarray:"+ms);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-2,6,-1,3};
		kadane(arr);

	}

}
