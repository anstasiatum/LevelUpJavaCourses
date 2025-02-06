package extra.person;

public class Person {
    String fullName;
    int age;

    public void move() {
        System.out.println(fullName + " is walking somewhere");
    }

    public void talk() {
        System.out.println(fullName + " is talking to someone");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {
    }
}
