package UserTools;
//import java.util.List;
import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
import UserTools.DBUtil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntityManager em = DBUtil.getEmFactory().createEntityManager();
	private String message="";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String input=request.getParameter("id");
		 if (input == null || input.trim().isEmpty()) {
	            message="Please enter id";
	        } else if (!input.matches("\\d+")) {
	            message="Please enter digits only";
	        }else{
		    int id=Integer.parseInt(input);
		    getInfo(id);
	        }
		 request.setAttribute("message", message);
			request.getRequestDispatcher("/GradeLookUp.jsp").forward(request, response);
	}
	public void getInfo(int id){
		try { 
			model.Gradebook student = em.find(model.Gradebook.class, (long)id); 
			message="The student submitted "+student.getType()+" "+student.getAssignmentName()+" on "+student.getSubmitDate()+", and the grade is: "+student.getGrade(); 
			} catch (Exception e){ 
			} finally { 
				em.close(); 
			}
		
			
	}

}
