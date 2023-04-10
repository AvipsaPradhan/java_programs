package Arrays;

public class Distinctornot {
	public static boolean distinctornot(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {11,2,3,1};
        System.out.println(distinctornot(arr));
        }

}
