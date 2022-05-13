import java.lang.reflect.InvocationTargetException;

import com.co.ao.metadata.Aometadata;

public class Main {

    public Main(Integer a) {

    }

    public Main() {

    }

    public static void suma(Integer a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        Aometadata<Main> metadata = new Aometadata<Main>();
        metadata.configuration(new Main());
        Object atributos[] = new Object[1];
        atributos[0] = 5;
        metadata.Command("suma", atributos, Integer.class);
        Main main = null;

        try {
            main = metadata.getNewInstance(atributos, Integer.class);
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }

        main.suma(9);

    }

}
