package Arrays;

class LargestNumber {
	public static void main(String[] args) {
		int a[] = {10,50,30,60,20};
		int largest = a[0];
		for(int i= 1; i < a.length; i++) {
		if (largest<a[i]) {
			largest = a[i];
		}
		}
		System.out.println(largest);
	  }
	
	}




