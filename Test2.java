class Test2 {
    
    public static void main(String args[]) {
    byte a=127;
    short b=a;        // implicit type castting 
    System.out.println(a);
    System.out.println(b);
    short c=129;        // 2 byte 
    //byte d =c;
    byte d = (byte)c;        // explicit type casting 
    System.out.println(c);
    System.out.println(d);    
    }
}