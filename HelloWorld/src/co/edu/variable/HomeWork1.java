package co.edu.variable;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		//������ 127�� 10���� ���� �� �ִ� ����. 5���� ���� �� �ִ� ����. � �ʿ����� ��� 2���� ���� ��� 5��¥�� ���ڷ�
		
		int orange;
		int box10;
		int box5;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ������ �Է��Ͻÿ�.");
		orange = sc.nextInt();
		
		box10 = orange/10;
		result = orange%10;
		box5 = result/5;
		result = orange%5;
		
		if(result>1) {
			box5 ++;
		}
		
		System.out.printf("������ %d���� 10���� ���� �� �ִ� ���� %d��, 5���� ���� �� �ִ� ���� %d���� �ʿ��մϴ�.", orange, box10, box5);
	}

}