package methods;

public class main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5};
		
		int aranacak = 6; 
		boolean varMi = false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;			
			}
		}
		
		String mesaj ="";
		if(varMi) {
			mesaj="sayi Mevcuttur: "+ aranacak;
			mesajVer(mesaj);
		}else {
			mesaj="sayi mevcut değildir: "+ aranacak;
			mesajVer(mesaj);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
