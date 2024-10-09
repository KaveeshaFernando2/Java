public class Institute {
    String name;
    static String age;
    Institute(){
        name = "IDET";
        age = "22";
    }
    public static void main(String[] args) {
        Institute i = new Institute();
        System.out.println("Hello World");
        System.out.println("Institute Name is: " + i.name);
        System.out.println("My age is: "+ age);
    }
}
