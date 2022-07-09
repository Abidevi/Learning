package sample;

public class FetchStudentsInfo {

	public static void main(String[] args) {
	
		Students stu = new Students();
		AddStudentsInfo stu1 = new AddStudentsInfo();
		stu1.set(stu);	
		System.out.println(stu.getStudentname());
		
	}

}
