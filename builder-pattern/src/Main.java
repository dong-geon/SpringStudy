public class Main {
    public static void main(String[] args) {
        Person person = new Builder("John")
                .age(30)
                .address("123 Main St.")
                .phoneNumber("555-1234")
                .build();

        person.printPerson();
    }
}