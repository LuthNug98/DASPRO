import java.util.Scanner;

public class GanjilGenap {
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	System.out.print("Masukan nilai : ");
	int a = sc.nextInt();
	
	if (a % 2 == 0) {
		System.out.print("Genap");
	}else {
		System.out.print("Ganjil");
	}
}
}