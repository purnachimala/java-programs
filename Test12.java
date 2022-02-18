class Test12 {
    public static void main(String args[]) {
    int []abc=new int[10];
    System.out.println("Size of array is "+abc.length);
    abc[0]=100;
    abc[1]=200;
    System.out.println("0 position value is "+abc[0]);
    System.out.println("1 position value is "+abc[1]);
    int temp=100;
    for(int i=0;i<abc.length;i++) {
        abc[i]=temp++;
    }    
    System.out.println("Display");
    for(int n:abc) {
        System.out.println(n);
    }
    }
}