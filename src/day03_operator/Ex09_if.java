package day03_operator;

import java.util.Scanner;

//종속 문장
public class Ex09_if {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		if(num > 10) {//그래서 원하는 곳까지 중괄호를 써서 if문이 인식하게 해야함
			System.out.println("1종속 문장 실행 "); //하나의 if문만 인식하기 때문에 거짓을 하면 1만 안돼고 나머진 모두 실행
			System.out.println("2종속 문장 실행 ");
			System.out.println("3종속 문장 실행 ");
			System.out.println("4종속 문장 실행 ");
			System.out.println("5종속 문장 실행 ");
		}
		System.out.println("다음 문장 실행 ");
		
		
	}

}
