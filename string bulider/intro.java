public class intro{
    public static void main(String[] args) {
       //syntax of string bulider
       StringBuilder str = new StringBuilder("tornov");
       System.out.println("string bulider is:"+str);

       //set char
       str.setCharAt(0, 'b');
       System.out.println("set char:"+str);
       //notice we can't do the set function in the sout statement

       //Insert char
       str.insert(0, 't');
       System.out.println("insert char :"+str);
       //different set char and instert char is
       //set char delect the posision of index char and add the char
       //insert char doesn't delect the char it add in the possition

       //delect char
       str.delete(0, 4);
       System.out.println("delect char is:"+str);
       //in delect char we doen't delect end index

       //append char
       str.append("dutta");
       System.out.println("append is: "+str);
       //notice appen char will be in the last of stringbulider

       //lenght
       System.out.println(str.length());
    }
}