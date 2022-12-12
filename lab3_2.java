import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Удалю из массива нужный элемент");
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
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            System.out.print("Введите " + (i + 1) + " элемент: ");
            int arrayi;
            if (in.hasNextInt()) {
                arrayi = in.nextInt();
            } else {
                while (!in.hasNextInt()) {
                    System.out.println("Ошибка!");
                    System.out.print("Введите целое число: ");
                    in.next();
                }
                arrayi = in.nextInt();
            }
            array[i] = arrayi;
        }
        System.out.println();
        int delete;
        System.out.print("Введите число для удаления: ");
        if (in.hasNextInt()) {
            delete = in.nextInt();
        } else {
            while (!in.hasNextInt()) {
                System.out.println("Ошибка!");
                System.out.print("Введите целое число: ");
                in.next();
            }
            delete= in.nextInt();
        }
        System.out.println();
        String choice;
        do{
            System.out.print("Ведите S(тот же размер массива) или A(уменьшить массив): ");
            choice = in.nextLine();
        }while((!choice.contains("S") || choice.contains("A")) && (!choice.contains("A") || choice.contains("S")));
        System.out.println();
        System.out.print("Исходный массив: [ ");
        for(int elem : array){
            System.out.print(elem + " ");
        }
        System.out.print("]");
        System.out.println();
        if(choice.contains("S")){
            int x = 1287349930;
            for (int i = 0; i < array_size; i++) {
                if(array[i] == delete){
                    array[i] = x;
                }
            }
            System.out.print("Полученный массив: [ ");
            for(int elem : array){
                if (elem != x){
                    System.out.print(elem + " ");
                }
            }
            System.out.print("]");
            System.out.println();
            System.out.println("Размер нового массива: " + array_size);
        }
        else{
            int NEW_array_size = 0;
            for(int elem : array){
                if (elem != delete){
                    NEW_array_size++;
                }
            }
            int g = 0;
            int[] NEWarray = new int[NEW_array_size];
            for (int i = 0; i < array_size; i++) {
                if(array[i] != delete){
                    NEWarray[g] = array[i];
                    g++;
                }
            }
            System.out.print("Полученный массив: [ ");
            for(int elem : NEWarray){
                System.out.print(elem + " ");
            }
            System.out.print("]");
            System.out.println();
            System.out.println("Размер нового массива: " + NEW_array_size);
        }
        in.close();
    }
}