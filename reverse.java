package Arrays;

public class reverse {
	public static void Reverse(int arr[]) {
		int n=arr.length-1;
		for(int i=0;i<=(int)(n/2);i++) {
			int temp=arr[i];
			arr[i]=arr[n-i];
			arr[n-i]=temp;
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Reverse(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
	}

}
