package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int su, num1,num2; String s;
		
		System.out.print("���� �Է��Ͻÿ� :");
		su = input.nextInt();
		s = (su % 2 == 0)?"¦��": "Ȧ��";
		System.out.println("10 = " + s);
		
		System.out.print("���� �Է��ϼ��� : ");
		su = input.nextInt();
		s = (su%3 == 0)?"3�� ����� �´�":"3�� ����� �ƴϴ�";
		System.out.println("10 = " + s);
		
		System.out.print("���� �Է� : ");
		System.out.print("���� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		s = (num1 < num2)? "num2�� num1���� ũ��":"num2�� num1���� ����";
		System.out.println(s);
	}

}
