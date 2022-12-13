import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Удалю из массива элементы, идущие не по возрастанию");
        System.out.print("Чтобы начать нажмите ENTER");
        String ENTER = in.nextLine();
        System.out.println();
        float[] array = new float[99999999];
        int k = 0;
        System.out.print("Считываю числа, пока не буде слова 'stop': ");
        while (!in.hasNext("stop")) {
            float arrayi;
            if (in.hasNextFloat()) {
                System.out.print("Введите " + (k+2) + " число: ");
                arrayi = in.nextFloat();
            }
            else {
                while (!in.hasNextFloat()) {
                    System.out.println("Ошибка!");
                    System.out.print("Нужно число: ");
                    in.next();
                }
                System.out.print("Введите " + (k + 2) + " число: ");
                arrayi = in.nextFloat();
            }
            array[k] = arrayi;
            k++;
        }
        int array_size = 0;
        for (int i = 0; i < 99999999; i++) {
            if(array[i] != 0){
                array_size++;
            }
        }
        float[] array_1 = new float[array_size];
        int s = 0;
        for (int i = 0; i < 99999999; i++) {
            if(array[i] != 0){
                array_1[s] = array[i];
                s++;
            }
        }
        System.out.println();
        System.out.print("Исходный массив: [ ");
        for(float elem : array_1){
            System.out.print(elem + " ");
        }
        System.out.print("]");
        System.out.println();
        if(array_size > 0) {
            int NEW_array_size = 1;
            for (int i = 0; i < array_size-1; i++) {
                if(array_1[i] < array_1[i+1]){
                    NEW_array_size++;
                }
            }
            if(NEW_array_size > 1){
                float[] NEWarray = new float[NEW_array_size];
                int g = 0;
                if(array[0] < array_1[1]){
                    NEWarray[0] = array[0];
                    g = 1;
                }
                else{
                    for (int i = 0; g != 1; i++) {
                        if(array_1[i] < array_1[i+1]){
                            NEWarray[g] = array_1[i];
                            g = 1;
                        }
                    }
                }
                for (int i = 0; i < array_size-1; i++) {
                    if(array_1[i]<array_1[i+1]){
                        NEWarray[g] = array_1[i+1];
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
                System.out.println("Полученный массив: [ " + array_1[0] + " ]");
            }
        }
        else{
            System.out.println("Полученный массив: [ ]");
        }
        in.close();
    }
}