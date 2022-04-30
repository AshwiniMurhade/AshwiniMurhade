package ashwini;
import java.util.*;
public class SwitchVowelsConsonaunt {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		char ch;
		System.out.println("enter the character to check vowel or consonant");
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("it is an vowel");
			break;
		default :
			System.out.println("it is consonunt");
	
		}
}
}