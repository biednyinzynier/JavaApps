package designpatterns.structural.facade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ShopKeeper shopKeeper = new ShopKeeper();
		
		System.out.print("========= Mobile Shop ============ \n");  
        System.out.print("            1. SAMSUNG.              \n");  
        System.out.print("            2. IPHONE.              \n");  
        System.out.print("            3. HUAWEI.            \n");  
        System.out.print("            4. Exit.                     \n");  
        System.out.print("Enter your choice: ");  
		
        int selection = scanner.nextInt();
        
	    switch (selection) {
			case 1:
				shopKeeper.samsungSale();
				break;
			case 2:
				shopKeeper.iphoneSale();
				break;
			case 3:
				shopKeeper.huaweiSale();
				break;
			case 4:
				System.out.println("Nothing you purchased!");
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
	}
}
