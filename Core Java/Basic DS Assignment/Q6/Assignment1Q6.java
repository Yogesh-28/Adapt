//Consider a CUI based application, where you are asking a user to enter his Login name and password,
//after entering the valid user-id and password it will print the message "Welcome" along with user name.
//As per the validation is concerned, the program should keep a track of login attempts.
//After three attempts a message should be flashed saying "Contact Admin" and the program should terminate.

import java.util.*;

class Login{
    String userId= "Ajay",password= "password";
    public String loginUser(String user, String pass) {
    	if(userId.equals(user) && password.equals(pass))
    		return "Welcome "+user;
    	else
    		return "You have entered wrong credentials ,please enter the right credentials.";
    }
}

public class Assignment1Q6 {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	Login a=new Login();
    	for(int i=0;i<3;i++){
    		String user= scanner.nextLine();
    		String password= scanner.nextLine();
    		System.out.println(a.loginUser(user,password));
    	}
    }
}