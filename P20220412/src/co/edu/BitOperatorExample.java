package co.edu;

public class BitOperatorExample {

	public static void main(String[] args) {
		int num = 8;
		
		int result = num << 2; //비트연산 (비트를 왼쪽으로 2번 이동) 2진수 1000 >  2진수 100000으로 됨
		System.out.println(result);
		
		result = num >> 2;
		System.out.println(result); 
	}

}
