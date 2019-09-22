import java.util.Scanner;

public class L6A_173040124 {
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	System.out.print("Masukan nilai : ");
	char nilai;
	nilai = sc.next().charAt(0);
	
	if (nilai == 'A' || nilai == 'B') {
		System.out.print("Anda Lulus");
	}else if (nilai == 'C') {
		System.out.print("Anda dapat mengulang atau tidak mengulang");
	}else if (nilai == 'D' || nilai == 'E'){
		System.out.print("Anda harus mengulang");
	}else{
		System.out.print("Inputan salah");	
	}	
}
}