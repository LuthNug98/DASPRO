import java.util.Scanner;

public class L6C_173040124 {
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	int nilai;
	System.out.print("Masukan nilai : ");
	nilai = sc.nextInt();
	
  if(nilai >= 1 && nilai <= 100) {	
	if(nilai % 2 == 0) {
		System.out.print(nilai + " adalah genap");
	}else if(nilai % 2 == 1) {
		System.out.print(nilai + " adalah ganjil");
	}
	}else{
		System.out.print("nilai harus 1-100");
	}
}
}
