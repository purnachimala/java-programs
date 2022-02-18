class Test5 {
    
    public static void main(String args[]) {
    int a=10;
    int b=a;        // 10 assign     
    System.out.println(b);    //b    10
    b=a++;        // assign and then increment     
    System.out.println(b);    //b    10
    b=++a;        //b    12        
    System.out.println(b);    //b    12
    }
}