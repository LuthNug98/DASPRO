import java.util.Scanner;

public class Tugas2_173040124 {
	public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Silahkan Login\n");
	
	String Username;
	System.out.print("Masukan Username : ");
	Username = sc.next();
	
	String Password;
	System.out.print("Masukan Password : ");
	Password = sc.next();
	
	String user =("Admin");
	String pas =("abcd1234");
	System.out.print("\n");	
	
	if(Username.equals(user)&& Password.equals(pas)) {
            System.out.println("selamat datang admin");
        }else{
            System.out.println("maaf anda tidak dikenali");
        }
}
}