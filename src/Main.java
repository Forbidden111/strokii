public class Main {
    public static void main(String[] args){
        //task1();
        //task2();
        //task3();


        String firstName = "Семён";
        System.out.println("firstName =" + firstName);
        String middleName = "Семёнович";
        System.out.println("middleName =" + middleName);
        String lastName = "Иванов";
        System.out.println("lastname =" + lastName);
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.replace("ё", "е"));

    }
}