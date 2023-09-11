public class User {
    private String name;
    private String surname;
    private int age;
    private String email;

    public User(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    // Геттеры и сеттеры для полей

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
