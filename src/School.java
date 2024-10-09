public class School {
    private int studentCount;
    School(){
        System.out.println("Constructor called first");
        studentCount = 5468;

    }

    public static void main(String[] args) {
        School s = new School();
        System.out.println("Student Count is : "+ s.studentCount);
    }
}
