package apnacollege;

public class pattern1 {
	public static void hollowrectangle(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==1||j==1||i==r||j==c) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hollowrectangle(4, 5);

	}

}
