package Logics;

class Reverse_String {
	public static void main(String[] args) {
		String a = "How are you";
		
		String arr[] = a.split(" ");
		System.out.println(arr.length);
		for(int i= arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}	
}

