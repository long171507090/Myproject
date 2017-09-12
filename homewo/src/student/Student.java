package student;

public class Student {
	public static Student student = null;
	private Student(){
		
	}
	public static Student getInfo(){
		if(student == null){
			student = new Student();
		}
		return student;
	}

}
