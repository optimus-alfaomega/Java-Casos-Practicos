import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Find<T> {
    // T value;
    List<T> list;
    Map<T, Object> map;
    T array[];
    int type = 0;

    public Find() {

    }

    public Find<T> setCollection(Map<T, Object> map) {
        this.type = 1;
        this.map = map;
        return this;
    }

    public Find<T> setCollection(List<T> list) {

        this.type = 2;
        this.list = list;

        return this;
    }

    public Find<T> setCollection(T[] array) {

        this.type = 3;
        this.array = array;

        return this;
    }

    public boolean findValue(T value) {

        boolean isnull = false;
        switch (this.type) {
            case 1:
                isnull = this.map == null;
                break;
            case 2:
                isnull = this.list == null;
                break;
            case 3:
                isnull = this.array == null;

                break;
            default:
                isnull = true;
                break;
        }

        if (isnull) {

            return false;
        }

        switch (this.type) {
            case 1:
                return map.containsKey(value);
            case 2:
                return list.contains(value);
            case 3:
                // int lastIndex = this.array.length - 1;
                /*
                 * for (int a = 0; a < this.array.length; a++) {
                 * if (this.array[a] == value)
                 * return true;
                 * if (this.array[lastIndex] == value) {
                 * return true;
                 * } else {
                 * lastIndex--;
                 * }
                 * 
                 * }
                 */
                for (int a = 0, b = this.array.length - 1; a < this.array.length; a++, b--) {
                    if (this.array[a] == value)
                        return true;
                    if (this.array[b] == value) {
                        return true;
                    }
                    if (a == b || b < a) {
                        return false;
                    }
                }
            default:
                return false;

        }

    }

    /*
     * public void setValue(T value) {
     * this.value = value;
     * }
     * 
     * public void printValue() {
     * System.out.println(value);
     * }
     */
}
