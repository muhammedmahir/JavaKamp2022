package methods2;

public class main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(2,5);
	}
	
	public static void ekle(String[] args) {
		System.out.println("Eklendi");
	}	

	public static void sil(String[] args) {
		System.out.println("Silindi");
	}
	
	public static void guncelle(String[] args) {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}
