package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int su;
		//1��
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		if(su%3 == 0)
			System.out.println(su+"3�� ����Դϴ�");
		if(su%3 != 0) {
			System.out.println(su+" 3�� ����� �ƴϴ�");
		}
		
		//2��
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		if(su < 0 )							// -su
			System.out.println(su+"���밪 => "+ su * -1);
		if(su >= 0)
			System.out.println(su+"���밪 => " + su );
		
		
		
		int su1,su2,su3;
		//3��
		System.out.print("�� �� �Է� : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		System.out.println("su1 : "+su1+" ,su2 : "+su2);
		if(su1 > su2)
			System.out.println("su1 �� su2���� ũ��");
		if(su1 < su2)
			System.out.println("su2 �� su1���� ũ��");
		
		
	
		//4��
		System.out.print("�� �� �Է� : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		su3 = input.nextInt();
		System.out.println("su1 : "+su1+" ,su2 : "+su2+" ,su3 : "+su3);
		if(su1 > su2 && su1 > su3)
			System.out.println("su1 �� ���� ũ��");
		if(su2 > su1 && su2 > su3)
			System.out.println("su2 �� ���� ũ��");
		if(su3 > su1 && su3 > su2)
			System.out.println("su3 �� ���� ũ��");
		int max=0;
		if(su1 > su2) {
			max = su1;
		}
		if(su2 > su1) {
			max = su2;
		}
		if(su3 > max) {
			max = su3;
		}
		System.out.println(max);
			
		//5��
		System.out.print("�� �� �Է� : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		System.out.println("su1 : "+su1+" ,su2 : "+su2);
		if(su1 > su2 && su1 % 2 == 0)
			System.out.println("su1 �� ũ�鼭 ¦����");
		if(su2 > su1 && su2 % 2 == 0)
			System.out.println("su2 �� ũ�鼭 ¦����");
		//6��
		//�μ��� �Է� �޾� ���� ¦���̰� 3�� ����� ���� ����Ͻÿ�
		System.out.print("�� �� �Է� : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		int sum = su1+su2;
		if(sum%6 == 0){//(sum%2 == 0 && sum%3 == 0) {
			System.out.println(sum);
		
	}
	}
}
