package co.edu.variable;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		// ������) ������ ���ݰ� ���� �Է¹���
		// ���� 10000��
		// ���ǰ��� 7500�� (�ΰ������� ���Ե� ����)
		// �ΰ��� 750��
		// �ܵ� 2500��
		
		int cash;
		int price;
		int vat;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�");
		cash = sc.nextInt();
		System.out.println("���ǰ��� �Է�");
		price = sc.nextInt();

		//�ΰ��� ���ϴ� ����
		vat = price - (int)(price/1.1);
		
		System.out.println("[����] " + cash + "��");
		System.out.println("[���ǰ���] " + price + "��");
		System.out.println("[�ΰ���]" + vat + "��");
		System.out.println("[�ܵ�]" + (cash - price) + "��");
	}

}