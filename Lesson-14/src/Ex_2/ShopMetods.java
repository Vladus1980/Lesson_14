package Ex_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ShopMetods {
	
	ArrayList <Commodity> sm = new ArrayList<Commodity>();
	
	public void addComm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву товару, що додається: ");
		String name = sc.next();
		System.out.println("Введіть вагу товару у кг: ");
		int weight = sc.nextInt();
		System.out.println("Введіть довжину товару у см: ");
		int length = sc.nextInt();
		System.out.println("Введіть ширину товару у см: ");
		int width = sc.nextInt();
		
		Commodity commodity = new Commodity(name, weight, length, width);
		
		sm.add(commodity);
		System.out.println("Товар "+ commodity.toString() +" доданий");
	}
	
	public void removeComm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Який товар ви бажаєте видалити?");
		String name = sc.next();
		
		boolean correct = isExist(sm, name);
		
		if (correct) {
			Iterator<Commodity> iterator = sm.iterator();
			
			while (iterator.hasNext()) {
				Commodity commodity = iterator.next();
				
				if(commodity.getName().equalsIgnoreCase(name)) {
					iterator.remove();
					System.out.println("Товар "+ commodity.toString() +" видалений");
				}
			}
			 
			
		} else {
			System.out.println("Такого товару немає!");

		}
	}
	
	public void replaceComm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Який товар ви бажаєте замінити?");
		String name = sc.next();
		
		boolean correct = isExist(sm, name);
		
		if (correct) {
			Iterator<Commodity> iterator = sm.iterator();
			
			while (iterator.hasNext()) {
				Commodity commodity = iterator.next();
				
				if(commodity.getName().equalsIgnoreCase(name)) {
					iterator.remove();
										
				}
				
			}
			System.out.println("Товар замінений на новий товар: ");
			addComm();
			 
			
		} else {
			System.out.println("Такого товару немає!");

		}
	}
	
	public void sortName() {
		System.out.println("До сортування: ");
		for (Commodity commodity : sm) {
			System.out.println(commodity);
		}
		
		Collections.sort(sm, new CommodityNameComparator());
		System.out.println("Після сортування: ");
		for (Commodity commodity : sm) {
			System.out.println(commodity);
		}
	}
	
	public void sortLength() {
		System.out.println("До сортування: ");
		for (Commodity commodity : sm) {
			System.out.println(commodity);
		}
		
		Collections.sort(sm, new CommodityLengthComparator());
		System.out.println("Після сортування: ");
		for (Commodity commodity : sm) {
			System.out.println(commodity);
		}
	}
	
	public void sortWidth() {
		System.out.println("До сортування: ");
		for (Commodity commodity : sm) {
			System.out.println(commodity);
		}
		
		Collections.sort(sm, new CommodityWidthComparator());
		System.out.println("Після сортування: ");
		for (Commodity commodity : sm) {
			System.out.println(commodity);
		}
	}
	
	public void sortWeight() {
		System.out.println("До сортування: ");
		for (Commodity commodity : sm) {
			System.out.println(commodity);
		}
		
		Collections.sort(sm, new CommodityWeightComparator());
		System.out.println("Після сортування: ");
		for (Commodity commodity : sm) {
			System.out.println(commodity);
		}
	}
	
	public void viewCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть порядковий номер товару: ");
		int i = sc.nextInt();
		
		if (i < 0 || i > sm.size() - 1) {
			System.out.println("Немає такого порядкового номера");
			
		} else {
			System.out.println(sm.get(i).toString());

		}
	}
		
	
	
	
	
	

	private boolean isExist(ArrayList<Commodity> sm2, String name) {
		boolean flag = false;
		
		for (Commodity commodity : sm) {
			if (commodity.getName().equalsIgnoreCase(name)) {
				flag = true;
			}
		}
		
		return flag;
	}

}
