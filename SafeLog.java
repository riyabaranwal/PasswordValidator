import java.util.*;
class passwordValidator{
    
    public static boolean isPasswordLengthValid(String password){
        return password.length() >= 8 ;
    }
    public static boolean isUpperCaseFunction(String password){
        for(int i = 0 ; i < password.length() ; i++){
          if(Character.isUpperCase(password.charAt(i))) return true;
        }
         return false;
    }
    public static boolean isAtLeastOneDigit(String password){
        for(int i = 0 ; i < password.length() ; i++){
            if(Character.isDigit(password.charAt(i))) return true;
        }
        return  false ;
    }
     public static boolean isAtLeastOneSymbol(String password){
        return password.matches(".*[^a-zA-Z0-9].*");
    }
    public static boolean validatePassword( String password){
        boolean valid = true;
        if(!isPasswordLengthValid(password)){ 
            valid = false ;
            System.out.println("Password is too short, password should be of atleast 8 character");
         }
        if(!isUpperCaseFunction(password)){
             valid = false;
             System.out.println("Password should contain atleast one uppercase letter");
            }
        if(!isAtLeastOneDigit(password)){
            valid = false;
            System.out.println("Password should contain atleast one digit");
        }
        if(!isAtLeastOneSymbol(password)){
            valid = false;
            System.out.println("Password should contain atleast one symbol");
        }
        return valid;
    }
}
public class SafeLog{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        while(true){
            System.out.println("Enter the password : ");
            password = sc.nextLine();
            if(!passwordValidator.validatePassword(password)){ System.out.println("Please enter the correct password");}
            else{ 
                System.out.println("Password is valid");
                break;
            }

        }
        sc.close();
    }
}