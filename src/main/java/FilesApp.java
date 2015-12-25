import java.io.*;

/**
 * Created by zhenya on 26.12.15.
 */

class Person implements Serializable {

    public String name;
    public int age;
    public double height;

    Person(String n, int a, double h) {
        name = n;
        age = a;
        height = h;
    }

}

public class FilesApp {

    public static void main(String[] args) {

        Person person = new Person("Sasha", 20, 180);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.data"))) {
            oos.writeObject(person);
            System.out.println("Запись произведена");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.data"))) {
            person = (Person) ois.readObject();
            System.out.println(person.name);
            System.out.println(person.age);
            System.out.print(person.height);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
