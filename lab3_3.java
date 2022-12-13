import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Удалю из массива элементы, идущие не по возрастанию");
        System.out.print("Чтобы начать нажмите ENTER");
        String ENTER = in.nextLine();
        System.out.println();
        int array_size;
        do {
            System.out.print("Введите размерность массива: ");
            if (in.hasNextInt()) {
                array_size = in.nextInt();
            } else {
                while (!in.hasNextInt()) {
                    System.out.println("Ошибка!");
                    System.out.print("Введите целое число: ");
                    in.next();
                }
                array_size = in.nextInt();
            }
            if (array_size <= 0) {
                System.out.println("Размер массива должен быть больше 0");
            }
        } while (array_size <= 0);
        System.out.println();
        float[] array = new float[array_size];
        for (int i = 0; i < array_size; i++) {
            System.out.print("Введите " + (i + 1) + " элемент: ");
            float arrayi;
            if (in.hasNextFloat()) {
                arrayi = in.nextFloat();
            } else {
                while (!in.hasNextFloat()) {
                    System.out.println("Ошибка!");
                    System.out.print("Введите число: ");
                    in.next();
                }
                arrayi = in.nextFloat();
            }
            array[i] = arrayi;
        }
        System.out.println();
        System.out.print("Исходный массив: [ ");
        for(float elem : array){
            System.out.print(elem + " ");
        }
        System.out.print("]");
        System.out.println();
        if(array_size > 1) {
            int NEW_array_size = 1;
            for (int i = 0; i < array_size-1; i++) {
                if(array[i] < array[i+1]){
                    NEW_array_size++;
                }
            }
            if(NEW_array_size > 1){
                float[] NEWarray = new float[NEW_array_size];
                int g = 0;
                if(array[0] < array[1]){
                    NEWarray[0] = array[0];
                    g++;
                }
                else{
                    for (int i = 0; g != 1; i++) {
                        if(array[i]<array[i+1]){
                            NEWarray[g] = array[i];
                            g++;
                        }
                    }
                }
                for (int i = 0; i < array_size-1; i++) {
                    if(array[i]<array[i+1]){
                        NEWarray[g] = array[i+1];
                        g++;
                    }
                }
                System.out.print("Полученный массив: [ ");
                for(float elem : NEWarray){
                    System.out.print(elem + " ");
                }
                System.out.print("]");
            }
            else{
                System.out.println("Нет элементов расположенных по возрастанию...");
            }
        }
        else{
            System.out.println("Полученный массив: [ " + array[0] + " ]");
        }
        in.close();
    }
}