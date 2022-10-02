package sayiBulma;

public class main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3,4,5};
		
		int aranacak = 6; 
		boolean varMi = false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
						
			}
		}
		
		if(varMi) {
			System.out.println("sayi Mevcuttur.");
		}else {
			System.out.println("Sayi mevcut değildir.");
		}
	}

}
