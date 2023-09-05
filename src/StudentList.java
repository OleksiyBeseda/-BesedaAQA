public class StudentList {
    public static void main(String[] args) {
        String formatString = "Студент %s %s %s";
        String firstName = "Иван";
        String lastName = "Иванов";
        String faculty = "Информатика";

        String studentInfo = String.format(formatString, firstName, lastName, faculty);
        System.out.println(studentInfo);
    }
}
