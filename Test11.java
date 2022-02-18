class Test11 {
    public static void main(String args[]) {
    int a;
    int abc[];
    int b=20;
    int xyz[]={10,20,30,40,50,60,100,240,70,57,101,78,46,76,24};
    System.out.println(xyz[0]);
    System.out.println(xyz[1]);
    int leng = xyz.length;        // it is use to find the size of the array;
    System.out.println("Size of the array is "+leng);
    System.out.println("Retrieve the elements using for loop");
    for(int i=0;i<xyz.length;i++) {            // we can customize base upon our requirement. 
        System.out.println(xyz[i]);
    }    
    System.out.println("Retrieve the elements using enhanced loop");
    
    for(int n : xyz) {                // it is use to retreive from begining to end one by one 
        System.out.println("Value is "+n);
    }    
    }
}