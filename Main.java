import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

       int array[] = { 1, 2, 3, 4};
        for (int i : array){
            System.out.println(i);
        }

        int arrayBidi[][] = {
                {1, 2, 3, 4},
                {11, 22, 33, 44}
        };

        for (int i = 0; i < arrayBidi.length; i++){
            System.out.println("Valor de i; " + i);

            for (int j = 0; j < arrayBidi[1].length; j++){
                System.out.println("Estoy en i = " + i + " , j = " + j);
                System.out.println(arrayBidi[i][j]);
            }

            ArrayList<String> lista = new ArrayList<>();
            lista.add("Cosa1");
            lista.add("Cosa2");
            lista.add("Cosa3");
            lista.add("Cosa4");

            for (String name : lista){
                System.out.println(name);
            }

            LinkedList<String> lista2 = new LinkedList<>();
            lista2.add("linked1");
            lista2.add("linked2");
            lista2.add("linked3");
            lista2.add("linked4");

            for (String name : lista2){
                System.out.println(name);
            }
        }
    }
}
