import java.io.*;

/**
 * Created by zhenya on 02.01.16.
 */
class Person implements Serializable {
    String name;

    public Person(String name) {
        this.name = name;
    }


}


public class Main {


    public static void main(String[] args) {

        Person person = new Person("Aleksand");
        writeToFile(person, "Person.name");
        readFromFile("Person.name");

    }


    public static void writeToFileSomething(Person p, String filename) {

        filename = "Person.name";
        OutputStream is = null;
        try {
            is = new FileOutputStream(new File("Person.name"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(is);
            objectOutputStream.writeObject(p);
            System.out.println("Serialization completed");


        } catch (IOException e) {
            System.out.println("Problems write to file");
        } finally {
            safeClose(is);
        }

    }


    public static boolean writeToFile(Object objectToWrite, String filename) {
        writeToFileSomething((Person) objectToWrite, filename);
        if ((Person) objectToWrite == null && filename.length() == 0) return false;

        if (filename.length() != 0) return true;
        return false;
    }


    public static void readFromFileToSometning() {


        InputStream in = null;
        try {
            in = new FileInputStream(new File("Person.name"));
            ObjectInputStream objectInputStream = new ObjectInputStream(in);
            Person name = (Person) objectInputStream.readObject();
            System.out.println(name);

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            openingClose(in);

        }


    }


    public static Object readFromFile(String filename) {


        if (writeToFile(Person.class, filename.equals(readFromFileToSometning()))) {
            return null;
        }
        return null;


    }


    public static void safeClose(OutputStream is) {
        if (is == null) return;
        try {
            is.close();
        } catch (Exception e) {
            System.out.println("Problema close file");
        }
    }

    public static void openingClose(InputStream in) {
        if (in == null) return;
        try {
            in.close();

        } catch (Exception e) {
            System.out.println("Problem opening file");
        }
    }


}

