import java.io.Serializable;
import java.util.Objects;

/**
 * Created by .
 */
public class Person implements Serializable {
    private int name;
    private int lastName;
    private int age;

    public Person(int name, int lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name == person.name &&
                lastName == person.lastName &&
                age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }

    @Override
    public String toString() {
        return " Last name: " + lastName + " Name: " + name + " age: " + age + "\n";
    }

    public int getName() {
        return name;
    }

    public int getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
