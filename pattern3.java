package apnacollege;

public class pattern3 {
	public static void Numberpattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Numberpattern(5);
	}

}
