package Ex_2;

import java.util.Scanner;

public class ApplicationComm {
	
	static void menu() {
		System.out.println("Натисніть 1, щоб додати новий товар");
		System.out.println("Натисніть 2, щоб видалити товар");
		System.out.println("Натисніть 3, щоб замінити товар");
		System.out.println("Натисніть 4, щоб сортувати товар за назвою");
		System.out.println("Натисніть 5, щоб сортувати товар за довжиною");
		System.out.println("Натисніть 6, щоб сортувати товар за шириною");
		System.out.println("Натисніть 7, щоб сотувати товар за вагою");
		System.out.println("Натисніть 8, щоб вивести товар за порядковим номером");
		System.out.println("Натисніть 9, щоб вийти з програми");
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
				System.out.println("Ви ввели невірне число, введіть число від 1 до 9");
			
				break;
			}
			}
		}
		
	}

}
