package hello;

import java.util.Scanner;

public class LastCharuppercase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s;
		System.out.println("Enter the string: ");
		s=sc.nextLine();
		s=s.toUpperCase();
		char[] ch = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)=='A' ||s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U')) {
				ch[i]='*';
			}else {
				ch[i]=s.charAt(i);
				
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}
