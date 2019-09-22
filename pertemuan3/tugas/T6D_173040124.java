import java.util.Scanner;

public class T6D_173040124 {
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	int umur;
	System.out.print("Masukan umur : ");
	umur = sc.nextInt();
	
	if(umur >=4 && umur <=6) {
	 if(umur >= 4 && umur <=5) {
	 	 System.out.print("Kelas A");
	 }else{
	 	 System.out.print("Kelas B");
	 }
	}else{
	 	 System.out.print("Tidak diterima");
	 }
}
}
