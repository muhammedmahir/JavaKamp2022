package classes;

public class main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		//value type
		int sayi1=10;
		int sayi2=10;
		
		sayi2=sayi1;
		sayi1=30;
		
		System.out.println(sayi2);
		
		//referance type
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2= new int[] {1,2,3};
		
		sayilar2=sayilar1; 
		
		sayilar1[0]=10;
		
		System.out.println(sayilar2[0]);
		
		
	}

}
