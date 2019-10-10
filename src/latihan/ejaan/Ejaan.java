package latihan.ejaan;
import java.util.Scanner;
public class Ejaan {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Masukan nama depan anda untun dieja : ");
		String nama = reader.next();
		System.out.println("");
		System.out.println("Ejaan untuk "+'"'+nama+'"'+" adalah :");
		for (int i = 0; i < nama.length(); i++) {
			System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
		}
		reader.close();
	}
}
