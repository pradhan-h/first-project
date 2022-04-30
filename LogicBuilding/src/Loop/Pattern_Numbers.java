package Loop;

class Pattern_Numbers {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
}
