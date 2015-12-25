import java.io.*;

/**
 * Created by zhenya on 24.12.15.
 */

class Person implements Serializable {

    String name;
    int age;
    int height;

    Person(String n, int a, int h) {

        name = n;
        age = a;
        height = h;
    }
}


public class FileSerializable {

    public static void main(String[] args) {


        String filename = "person.data";
        Person person = new Person("Sasha", 20, 180);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Запись произведена");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            person = (Person) ois.readObject();
            System.out.println(person.name);
            System.out.println(person.age);
            System.out.println(person.height);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

}
