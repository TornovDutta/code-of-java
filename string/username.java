// Input an email from the user. You have to create a username from the email by
// deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”
import java.util.*;
public class username {
    public static void main(String[] args) {
        System.out.print("enter user email id:");
        Scanner sc=new Scanner(System.in);
        String email = sc.next();
        int c=0;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                c++;
            }
        }
        System.out.println("your user name is:"+email.substring(0, c));
        sc.close();
    }
}
