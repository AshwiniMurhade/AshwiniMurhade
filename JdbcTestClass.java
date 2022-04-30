package p1;

	import java.io.BufferedReader;

	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	public class JdbcTestClass {
		 static Connection conn=null;
		 static Statement st=null;
	  static ResultSet rs=null;
	  static Scanner sc;
		public static void insertRecord() throws SQLException {
			
				try {
					conn=ConnectionUtilityClasss.getConnection();
					st=conn.createStatement();
					InputStreamReader isr=new InputStreamReader(System.in);
				   BufferedReader br=new BufferedReader(isr);
					System.out.println("Enter name");
					String sname=br.readLine();
					System.out.println("Enter id");
					int sid = Integer.parseInt(br.readLine());
					String sel="select * from edustudent where sid="+sid;
					ResultSet rs=st.executeQuery(sel);
					if(!rs.next()) {
					String s="insert into edustudent values("+sid+",'"+sname+"' )"; 
					System.out.println(s);
					int i=st.executeUpdate(s);
					if(i>0) {	
						System.out.println("Record is inserted successfully");
					}
					else {
						System.out.println("Not inserted");
					}
					}
					else {
						System.out.println("id is already exist");
					}
					
						
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			
		}
		
		
		
	public static void updateRecord() throws SQLException {
			
			try {
				conn=ConnectionUtilityClasss.getConnection();
				st=conn.createStatement();
				InputStreamReader isr=new InputStreamReader(System.in);
				   BufferedReader br=new BufferedReader(isr);
					System.out.println("Enter name");
					String name=br.readLine();
					System.out.println("Enter id");
					int sid = Integer.parseInt(br.readLine());
					
					String sel="select * from edustudent where sid="+sid;
					ResultSet rs=st.executeQuery(sel);
					if(rs.next()) {
				String up="update edustudent set name= '"+name+"' where sid="+sid; 						
				System.out.println(up);
						int i=st.executeUpdate(up);
						if(i>0) {
							System.out.println("record is updated");
						}
						else {
							System.out.println("record is not updated");
						}
						}
						else {
							System.out.println(sid+"sid is not exist update is not possible");
						}
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			
		}
				
				
		
	
	public static void deleteRecord() throws SQLException {
		
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			InputStreamReader isr=new InputStreamReader(System.in);
			   BufferedReader br=new BufferedReader(isr);
				
				System.out.println("Enter id");
				int sid = Integer.parseInt(br.readLine());
			String sel="select * from edustudent where sid="+sid;
			ResultSet rs=st.executeQuery(sel);
			if(rs.next()) {
			String del="delete from edustudent  where sid="+sid; 
			System.out.println(del);
			int i=st.executeUpdate(del);
			if(i>0) {
				System.out.println("record is deleted");
			}
			else {
				System.out.println("record is not deleted");
			}
			}
			else {
				System.out.println(sid+"sid is not exist delete is not possible");
			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}public static void   selectRecord() throws SQLException {
		
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			  String sel="select * from edustudent";
			  rs=st.executeQuery(sel);
			  System.out.println("sid\tsname");
			  while(rs.next()) {
				  int sid=rs.getInt(1); //or rs.getInt("id");
				  String sname=rs.getString(2); //or rs.getString("name");
		System.out.println(sid+"\t"+sname);
			  }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			 st.close();
			 conn.close();
		 }

	}
	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
			while(true) {
				System.out.println("**************MENU*********************");
				System.out.println("1.insert Record");
				System.out.println("2.Delete Record");
				System.out.println("3.Update Record");
				System.out.println("4.Display Record");
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(isr);
				System.out.println("Enter choice");
				int ch = Integer.parseInt(br.readLine());
				
				switch(ch) {
				case 1: JdbcTestClass.insertRecord();
				         break;
				case 2: JdbcTestClass.deleteRecord();
		        		break;
				case 3:JdbcTestClass.updateRecord();
				break;
				case 4:JdbcTestClass.selectRecord();
				break;
				         
				}
				System.out.println("Do you want to continue Y/N");
				sc=new Scanner(System.in);
				char choice=sc.next().charAt(0);
				if(ch=='N' || ch=='n') {
					break;
				}
				}

			}
				
				
	}

