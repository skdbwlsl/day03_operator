package day03_operator;

import java.util.Scanner;

//���� ����
public class Ex09_if {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�� �Է� : ");
		num = input.nextInt();
		if(num > 10) {//�׷��� ���ϴ� ������ �߰�ȣ�� �Ἥ if���� �ν��ϰ� �ؾ���
			System.out.println("1���� ���� ���� "); //�ϳ��� if���� �ν��ϱ� ������ ������ �ϸ� 1�� �ȵŰ� ������ ��� ����
			System.out.println("2���� ���� ���� ");
			System.out.println("3���� ���� ���� ");
			System.out.println("4���� ���� ���� ");
			System.out.println("5���� ���� ���� ");
		}
		System.out.println("���� ���� ���� ");
		
		
	}

}
