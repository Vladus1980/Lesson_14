package Ex_2;

import java.util.Scanner;

public class ApplicationComm {
	
	static void menu() {
		System.out.println("�������� 1, ��� ������ ����� �����");
		System.out.println("�������� 2, ��� �������� �����");
		System.out.println("�������� 3, ��� ������� �����");
		System.out.println("�������� 4, ��� ��������� ����� �� ������");
		System.out.println("�������� 5, ��� ��������� ����� �� ��������");
		System.out.println("�������� 6, ��� ��������� ����� �� �������");
		System.out.println("�������� 7, ��� �������� ����� �� �����");
		System.out.println("�������� 8, ��� ������� ����� �� ���������� �������");
		System.out.println("�������� 9, ��� ����� � ��������");
	}

	public static void main(String[] args) {
		
		ShopMetods shopMetods = new ShopMetods();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			menu();
			
			switch (sc.nextInt()) {
			case 1:{
				shopMetods.addComm();		
				
				break;
			}
			
			case 2:{
				shopMetods.removeComm();			
				
				break;
			}
			
			case 3:{
				shopMetods.replaceComm();
				
				break;
			}
			
			case 4:{
				shopMetods.sortName();
							
				break;	
			}
			
			case 5:{
				shopMetods.sortLength();
			
				
				break;
			}
			case 6:{
				shopMetods.sortWidth();
			
				
				break;
			}
			
			case 7:{
				shopMetods.sortWeight();
				
				break;
			}
			
			case 8:{
				shopMetods.viewCommodity();
				
				break;
			}
			case 9:{
				System.exit(0);
			
				
				break;
			}
			
			default:{
				System.out.println("�� ����� ������ �����, ������ ����� �� 1 �� 9");
			
				break;
			}
			}
		}
		
	}

}
