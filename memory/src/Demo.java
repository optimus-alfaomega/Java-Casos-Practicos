import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        Find<Integer> f = new Find<Integer>();
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);

        boolean resp = f.setCollection(l).findValue(1);
        System.out.println(resp);
        Map<Integer, Object> key = new HashMap<Integer, Object>();
        key.put(1, 3);
        key.put(2, 6);
        resp = f.setCollection(key).findValue(3);
        System.out.println(resp);
        Integer[] array = new Integer[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        resp = f.setCollection(array).findValue(3);
        System.out.println(resp);

        /*
         * Map<String, List<Integer>> key = new HashMap<String, List<Integer>>();
         * 
         * List<Integer> coleccion = new ArrayList<Integer>();
         * coleccion.add(1);
         * coleccion.add(2);
         * coleccion.add(3);
         * List<Integer> coleccion2 = new ArrayList<Integer>();
         * coleccion2.add(4);
         * coleccion2.add(5);
         * coleccion2.add(6);
         * 
         * key.put("1", coleccion);
         * key.put("2", coleccion2);
         * 
         * System.out.println(key.size());
         */
    }

}
