package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("�� �Է� : ");
		num1 = input.nextInt();
		
		if(num1 % 2 ==0) {
			System.out.println(num1 + "= ¦��");
			System.out.println(num1 + "= 3�� ����� �ƴϴ�");
		}
		
		System.out.println("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println("num1 : " +num1 +", num2 :" +num2);
		
		if(num1<num2) {
			System.out.println("num2�� num1���� ũ��");
		}
		
		

}
}