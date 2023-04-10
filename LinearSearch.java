package Arrays;

public class LinearSearch {
	public static void linearsearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Element found as index:"+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {1,2,3,4,5,6,7,8,9,10};
		linearsearch(marks, 4);

	}

}
