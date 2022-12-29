import java.util.ArrayList;

public class arraListEjercicio {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for( int i = 0; i < 10; i++){
            lista.add(i);
            if ( i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }


    }
}
