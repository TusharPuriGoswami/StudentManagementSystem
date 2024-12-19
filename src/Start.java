
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.channels.Pipe.SourceChannel;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.mysql.cj.x.protobuf.MysqlxExpr.Identifier;
import com.student.manage.StudentDao;
import com.student.manage.student;

public class Start {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student management App");	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to add student ");
			System.out.println("Press 2 to delete student ");
			System.out.println("Press 3 to display student ");
			System.out.println("press 4 to exit app ");
			
			int c = Integer.parseInt(br.readLine());
			
			//add student
			if (c==1) {
				System.out.println("Enter your Name : ");
			    String name = br.readLine();
			    
			    System.out.println("Enter your Phone : ");
			    String phone = br.readLine();
			    
			    System.out.println("Enter your City : ");
			    String city = br.readLine();
			    
				//create student object to store student
			    student st = new student(name,phone,city);
			   boolean answer =  StudentDao.insertStudentToDB(st);
			   if(answer)
				   
			   {
				   System.out.println("Answer is added Sucessfully...");
			   }			   
			   else {
					System.out.println("Something went wrong try again ......");
				}
			   System.out.println(st);
			  
			}

			//Delete student 
			else if (c==2) {
				System.out.println("Enter stduent id to delete : ");
				int userId = Integer.parseInt(br.readLine());
			boolean f = StudentDao.deleteStudent(userId);		
			if (f) {
				System.out.println("Delete....");
			}
			else {
				System.out.println("Something Went Wrong....");
			}
			}
			//display student
			
			else if (c==3) {
				StudentDao.showAllStudent();
				
			}
			else if (c==4) {
				break;
			}
			else {
				
			}
			
		}
		 	
		System.out.println("Thankyou for Using my application ");
		System.out.println("See you soon..... Bye Bye");
	}

}

