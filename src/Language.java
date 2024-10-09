public class Language {
    String lName;
    Language(String language){//This bracket() for parameter
        lName = language;
        System.out.println(lName+ "is a Language!");
    }

    public static void main(String[] args) {
        Language l = new Language("Sinhala");//This bracket() for argument
        Language l1 = new Language("English");
        Language l2 = new Language("Tamil");
        Language l3 = new Language("Java");
    }
}
