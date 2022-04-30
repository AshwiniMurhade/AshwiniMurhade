package mypack;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CloudOperations {
	
		static Connection conn=null;
		static Statement st=null;
		static Scanner sc;
		
		public static void selectRecord() throws SQLException {
			try {
				conn=Connectionutility.getConnection();
				st=conn.createStatement();
			}
				
			}
		
			
	public static void insertRecord() {
			try {
				conn=Connectionutility .getConnection();
				st=conn.createStatement();
				
				//insert
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void main(String[] args) throws SQLException {
			
			while(true) {
			System.out.println("**************MENU*********************");
			System.out.println("1.Add Record");
			System.out.println("2.Delete Record");
			System.out.println("3.Update Record");
			System.out.println("4.Display Record");
			sc=new Scanner(System.in);
			System.out.println("Enter your option");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1: CloudOperations.insertRecord();
			         break;
			case 2: CloudOperations.deleteRecord();
	        		break;
			case 3:CloudOperations.updateRecord();
			break;
			case 4:CloudOperations.selectRecord();
			break;
			         
			}
			System.out.println("Do you want to continue Y/N");
	char choice=sc.next().charAt(0);
			if(ch=='N' || ch=='n') {
				break;
			}
			}

		}
		private static void updateRecord() {
			// TODO Auto-generated method stub
			
		}
		private static void deleteRecord() {
			// TODO Auto-generated method stub
			
		}

	}


