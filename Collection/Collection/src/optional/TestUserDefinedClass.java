package optional;

class AdminLoginException extends Exception{
	public AdminLoginException(String msg) {
		super(msg);
	}
}

class LogInService{
	public boolean Login(String userName, String password) throws AdminLoginException{
		if(userName.equals("admin") && password.equals("pass@123")) {
			return true;
		}
		else {
			throw new AdminLoginException("Wrong Admin ... Kindly check");
		}
	}
}
public class TestUserDefinedClass {

	public static void main(String[] args) {
		LogInService service = new LogInService();
		try {
			System.out.println(service.Login("adm1in", "pass@123"));
		}
		catch(AdminLoginException e){
			System.out.println(e.getMessage());
//			System.out.println(e.getLocalizedMessage());
//			e.printStackTrace();
		}
	}
}