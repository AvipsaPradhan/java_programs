package Arrays;

public class binarysearch {
	public static int BinarySearch(int arr[],int key) {
		int s=0;
		int e=arr.length-1;
		int mid=(int)(arr.length/2);
		while(s<=e) {
			if(arr[mid]==key) {
				return mid;
			}
			else if(key>arr[mid]) {
				s=mid+1;
			}
			else if(key<arr[mid]) {
				e=mid-1;
			}
			mid=(int)((s+e)/2);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int index=BinarySearch(arr, 4);
        if(index==-1) {
        	System.out.println("Element not found found");
        }
        else {
        	System.out.println("Element found at index:"+index);
        }
	}

}
