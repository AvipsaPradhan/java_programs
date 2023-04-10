package apnacollege;

public class pattern9 {
	public static void diamond(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
        for(int i=n+1;i<=2*n;i++) {
        	for(int j=1;j<=i-n-1;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=2*((2*n)-i)+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamond(4);

	}

}
