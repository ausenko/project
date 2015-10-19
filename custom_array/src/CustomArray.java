/**
 * Created by zhenya on 15.10.15.
 */
import java.util.*;
public class CustomArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите значение для того чтобы задать длину массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println();
        System.out.println("Инициализируйте массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Исходный массив имеет вид:");
        print(array);

        System.out.println("Для цикличеуского сдвига в массиве введите значение,k: ");
        int k = sc.nextInt();
        while (k >= n) {
            System.out.println("Некорректное значение,  введите повторно значение к: ");
            k = sc.nextInt();

        }

        System.out.println("Циклический сдвиг влево: ");
        print(shiftLeft(array,k));
        System.out.println("Циклический сдвиг вправо: ");
        print(shiftRight(array,k));
        System.out.println("Массив обратного порядка: ");
        print(reverse(array));
        System.out.println("Массив после удаления элемента по индексу: ");
        print(remove(array,k));
    }



    public static  void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }
    }

    private static int[] shiftLeft(int[] array, int value) {
        int size = array.length;
        for(int i = size; i > value; i-- ){
            int temp = array[size-1];
            for(int j = size-1; j>0; j--){
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
        return array;
    }
    private static int[] shiftRight(int[] array, int value){
        int size = array.length;
        for(int i = 0; i<value; i++){
            int temp = array[size-1];
            for(int j = size-1; j>0; j-- ){
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
        return array;
    }

    private static int[] reverse(int[] array){
        for(int i = 0; i<array.length-1; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

    private static int[] remove(int[] array, int indexToRemove){
        for(int i = indexToRemove; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        return array;
    }





}












