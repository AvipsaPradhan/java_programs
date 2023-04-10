package Arrays;

public class subarray {
	public static void Subarray(int arr[]) {
		int n=arr.length;
		int ts=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out .print("["+" ");
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				ts++;
				System.out .print("]");
				System.out.println();
			}
		}
		System.out.println("Total number of arrays:"+ts);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5};
        Subarray(arr);
	}

}
