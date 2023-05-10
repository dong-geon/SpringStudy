public class Person {
    private final String name;
    private final int age;
    private final String address;
    private final String phoneNumber;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }
    public void printPerson(){
        System.out.println(name + ", "+ age + ", "+ address + ", " + phoneNumber);
    }
}