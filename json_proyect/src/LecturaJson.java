import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LecturaJson {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        try (FileReader reader = new FileReader("employees.json")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
