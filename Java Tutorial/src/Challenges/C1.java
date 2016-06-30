package Challenges;

public class C1 {

	public static void main(String[] args) {
		
		//	Problem – The Collatz Conjecture
		//	The Collatz conjecture in a conjecture in mathematics that can be summarized as follows:
		//	n
		//	Take any positive integer, n. If n is even, divide it by 2 to get 2 . If n is odd, multiply it by 3 and
		//	add 1 to obtain 3n + 1. The conjecture states that if this process is repeated indefinitely, the
		//	result will eventually be equal to 1.
		//	Write a method to determine how many times the process must be repeated for any number, n, to
		//	reach the answer of 1.
		int n = 31;
		int tries = 0;
		
		for (int x = 1; x <= 31; x++){
			tries = Collatz(x);
			System.out.println("This process took " + tries + " tries.");
		}
		
	}
	
	public static int Collatz(int num){
		
		int n = num;
		int tries = 0;
		
		do {
			if (n % 2 == 0){
				n /= 2;
			}else if (n % 2 == 1){
				n *= 3;
				n += 1;
			}
			tries += 1;
		} while (n != 1);
		
		return tries;
	}
}