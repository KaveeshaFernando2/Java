public class delVal {
    int x ;
    boolean y ;
    delVal(){
        x= 1234;
        y= 1<2;
    }

    public static void main(String[] args) {
        delVal dv = new delVal();
        System.out.println("Default value is : " + dv.x);
        System.out.println("Default value is : " + dv.y);
    }
}
