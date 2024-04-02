// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’
// in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”
import java.util.*;
public class replacee {
    public static void main(String[] args) {
        System.out.println("enter a string:");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        String result = "";
        //for loop use to acess all char at string
        //if condition cheak "e" in the string and replace it
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                result+='i';
            }else{
                result+=str.charAt(i);
            }
            
        }
        System.out.println("new string is:"+result);
        sc.close();
    }
}
