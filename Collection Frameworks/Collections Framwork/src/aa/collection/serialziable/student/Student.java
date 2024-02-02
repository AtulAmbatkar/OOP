package aa.collection.serialziable.student;
import java.io.Serializable;

public class Student implements Serializable{
	
	 private static final long serialVersionUID = 1L;

    
	private int sno;
	private String sname;
	private String course;
	private double fees;
	
	public Student(int sno,String sname,String course,double fees) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
	}
	
	public Student(int sno,String course) {
//		if(103==sno && "CJ"==course) {
		this.sno=sno;
		this.course=course;
		
	}
	
	public Student() {
//		no-arg constructor
	}

	public  int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("this: "+this+"obj:"+obj);
		if(obj instanceof Student ) {
               Student s = (Student)obj;
			return	this.course.equals(s.course) &&
				  this.sno == s.sno;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", fees=" + fees + "]";
	}
	
	
}