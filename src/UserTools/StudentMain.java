//test tool
package UserTools;
import javax.persistence.EntityManager;  
import UserTools.DBUtil; 
import java.util.Scanner;
public class StudentMain { 
public static void main(String[] args) { 
String print;	
EntityManager em = DBUtil.getEmFactory().createEntityManager(); 
Scanner sc=new Scanner(System.in);
System.out.println("Enter id");
String message=sc.nextLine();
try { 
int id=Integer.parseInt(message);
model.Gradebook student = em.find(model.Gradebook.class, (long)id); 
print="The student submitted "+student.getType()+" "+student.getAssignmentName()+" on "+student.getSubmitDate()+", and the grade is: "+student.getGrade();
System.out.println(print); 
} catch (Exception e){ 
System.out.println(e); 
} finally { 
em.close(); 
System.out.println("cerrado!"); 
} 
sc.close();
} 
} 
