import java.io.File;

public class Write {

    private String fileName;
    private String path;

    public Write() {

    }

    public Write path(String path) {
        this.path = path;
        return this;
    }

    public Write filename(String fileName) {
        this.fileName = fileName;
        return this;
    }

}
