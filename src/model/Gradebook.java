package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GRADEBOOK database table.
 * 
 */
@Entity
@NamedQuery(name="Gradebook.findAll", query="SELECT g FROM Gradebook g")
public class Gradebook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STUDENT_ID")
	private long studentId;

	@Column(name="ASSIGNMENT_NAME")
	private String assignmentName;

	private BigDecimal grade;

	@Temporal(TemporalType.DATE)
	@Column(name="SUBMIT_DATE")
	private Date submitDate;

	@Column(name="\"TYPE\"")
	private String type;

	public Gradebook() {
	}

	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getAssignmentName() {
		return this.assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public BigDecimal getGrade() {
		return this.grade;
	}

	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}

	public Date getSubmitDate() {
		return this.submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}