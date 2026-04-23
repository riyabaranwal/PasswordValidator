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
        System.out.println("--------SafeLog Employee Portal------");
        System.out.println();
        System.out.println("Please create a strong password that meets the following criteria:");
        System.out.println();
        System.out.println("1. At least 8 characters long.");
        System.out.println("2. Contains at least one Uppercase letter.");
        System.out.println("3. Contains at least one Digit (0-9).");
        
        while(true){
            System.out.println();
            System.out.print("Enter the password : ");
            password = sc.nextLine();
            if(!passwordValidator.validatePassword(password)){ System.out.println("\nPassword Invalid. Please fix all the above issues, then enter the password according to requirement");}
            else{ 
                System.out.println("Password is valid");
                break;
            }

        }
        sc.close();
    }
}