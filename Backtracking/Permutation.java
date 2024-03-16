 class Permutation{
    //total time complexity o(n*n!)
    public static void per(String str,String per,int idx){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        //time complexity---o(n)
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);//a-b-c
            String newstring=str.substring(0, i)+str.substring(i+1);//bc-c-""
            per(newstring, per+currchar, idx+1);//per(bc,a,1)-per(c,ab,1)-per("",abc,1)
            //time complexity ---o(n!)
        }
    }

    //drive code
    public static void main(String[] args) {
        String str = "ABC";
        per(str,"",0);
    }
}