package Arrays;

public class largestelement {
	public static int LargestElement(int arr[]) {
		int g=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>g) {
				g=arr[i];
			}
		}
		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks[]= {1,4,2,6,3,5,9,7,10,8};
        int g=LargestElement(marks);
        System.out.println("largest element is:"+g);
	}

}
