//parstint covert string to int
//and tostring convert int to string
public class parstintandtostring {
    public static void main(String[] args) {
        //parstint
        String str="123";
        float number=Integer.parseInt(str);
        int number02=Integer.parseInt(str);
        System.out.println(number);
        System.out.println(number02);
        //notice we can convert any word to int
        // only we can convert number to int
        //if it in string
        //we can also conver into float by changing data type
        //tostring
        int number03=123;
        String str02=Integer.toString(number03);
        System.out.println(str02);
        //in this method we can convert only int value to string

    }
}
