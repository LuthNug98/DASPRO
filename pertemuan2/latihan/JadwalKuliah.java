import java.util.Scanner;

public class JadwalKuliah {
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	int nilai;
	System.out.print("Masukan nilai :");
	nilai = sc.nextInt();
	
	if(nilai <= 100 && nilai >=80) {
		System.out.print("Nilai A");
	}else if(nilai <=80 && nilai >=70 ) {
		System.out.print("Nilai B");
	}else if(nilai <= 70 && nilai >=55) {
		System.out.print("Nilai C");
	}else if(nilai <= 55 && nilai >=0){
		System.out.print("Nilai E");
	}else{
		System.out.print("Nilai error");
	}
}
}
