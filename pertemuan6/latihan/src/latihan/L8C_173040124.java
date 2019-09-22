package latihan;
import java.util.Scanner;
public class L8C_173040124 {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int bulat = sc.nextInt();
	int jumlah = 0;
	
	while(bulat >= 0){
		System.out.print(jumlah += bulat);
		bulat = sc.nextInt();
	}while (bulat <= 0) {
		break;
	}
  }
}