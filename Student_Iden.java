import java.util.*;
 
public class Student_Iden{

	public static void main(String[] args){
		ArrayList<String> studentNameList = new ArrayList<String>();
		Student_Iden s1 = new Student_Iden("yhj 1",2011);
		Student_Iden s2 = new Student_Iden("yhj 3",2013);
		Student_Iden s3 = new Student_Iden("yhj 4",2014);
		Student_Iden s4 = new Student_Iden("yhj 2",2012);
		Student_Iden s5 = new Student_Iden("yhj 5",2015);
		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());
		studentNameList.add(s4.getName());
		studentNameList.add(s5.getName());
		Collections.sort(studentNameList);
		System.out.println(studentNameList);
	}
	
	private String name;
	private int studentNum;
	Student_Iden(String name, int sNum){
		this.name = name;
		studentNum = sNum;
	}
	public String getName(){
		return name;
	}

	
} 
