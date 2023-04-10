package apnacollege;

public class pattern6 {
	public static void butterfly(int n) {
		 for(int i=1;i<=2*n;i++) {
			 for(int j=1;j<=2*n;j++) {
				 if(i<=n) {
					 if(j<=i||j>=(2*n)-i+1) {
						 System.out.print("* ");
					 }
					 else{
						 System.out.print("  ");
					 }
				 }
				 else {
					 if(j<=(2*n)-i+1||j>=i) {
						 System.out.print("* ");
					 }
					 else{
						 System.out.print("  ");
					 }
				 }
				 
			 }
			 System.out.println();
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		butterfly(4);

	}

}
