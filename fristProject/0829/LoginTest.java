
public class LoginTest {
	private static String[] arr = {"xiaoming","xiaohong","laowang"};
	public static void main(String[] args) {
		try {
			loginExce("xiaomin");
			System.out.println("注册成功!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	public static boolean loginExce(String str){
		for (String s1 : arr) {
			if(s1.equals(str)){
				throw new loginException("您好:"+str+"已经存在");
			}
		}
		return true;
	}

}
