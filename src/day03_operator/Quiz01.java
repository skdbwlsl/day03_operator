package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int su, num1,num2; String s;
		
		System.out.print("수를 입력하시오 :");
		su = input.nextInt();
		s = (su % 2 == 0)?"짝수": "홀수";
		System.out.println("10 = " + s);
		
		System.out.print("수를 입력하세요 : ");
		su = input.nextInt();
		s = (su%3 == 0)?"3의 배수가 맞다":"3의 배수가 아니다";
		System.out.println("10 = " + s);
		
		System.out.print("수를 입력 : ");
		System.out.print("수를 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		s = (num1 < num2)? "num2가 num1보다 크다":"num2가 num1보다 적다";
		System.out.println(s);
	}

}
