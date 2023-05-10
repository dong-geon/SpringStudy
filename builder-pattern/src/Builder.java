public class Builder {
    public final String name;
    public int age;
    public String address;
    public String phoneNumber;

    public Builder(String name) {
        this.name = name;
    }

    public Builder age(int age) {
        this.age = age;
        return this;
    }

    public Builder address(String address) {
        this.address = address;
        return this;
    }

    public Builder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}