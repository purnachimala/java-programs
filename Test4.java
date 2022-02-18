class Test4 {
    
    public static void main(String args[]) {
    int a=10;
    int b=20;
    int c=10;
    int sum = a+b;
    System.out.println("Sum of two number is "+sum);
    boolean res1 = a>b;
    boolean res2 = a==c;
    boolean res3 = a>b && a>c;    // both condition must be true. then result is true  
    boolean res4 = a<b || a>c;    // any one condition must be true then result is true 
    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    }
}