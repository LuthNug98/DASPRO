import java.util.Scanner;

public class JamSunda {
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	String jam;
	System.out.print("Masukan jam sunda : ");
	jam = sc.next();
	
	
	if(jam.equals("6")) {
		System.out.print("Garancang tihang");
	}else if(jam.equals("7")) {
		System.out.print("Meletek Panon poe");
	}else if(jam.equals("8")) {
		System.out.print("Ngaluluh taneuh");
	}else if(jam.equals("9")){
		System.out.print("Haneut Moyan");
	}else if(jam.equals("10")){
		System.out.print("Rumangsang");
	}else if(jam.equals("11")){
		System.out.print("Pecat Sawed");
	}else if(jam.equals("12")){
		System.out.print("Tangage");
	}else if(jam.equals("13")){
		System.out.print("Lingsir");
	}else if(jam.equals("14")){
		System.out.print("Kalangkang Satangtung");
	}else if(jam.equals("15")){
		System.out.print("Mengok");
	}else if(jam.equals("16")){
		System.out.print("Tunggang Gunung");
	}else{
		System.out.print("Bukan jam sunda");
	}
}
}
