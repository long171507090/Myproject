package hello;

public class Hello {
	private String name;
	public Hello(){
		name = "java";
	}
	public Hello(String name){
		this.name = name;
	}
	public String  getName(){
		return name;
	}
	public static void main(String[] args) {
		Hello ha = new Hello();
		System.out.println(ha.getName());
		Hello a1 = new Hello("xiaomingtongxue");
		System.out.println(a1.getName());
	}

}
