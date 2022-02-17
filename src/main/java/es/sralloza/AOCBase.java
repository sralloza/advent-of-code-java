package es.sralloza;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public abstract class AOCBase implements AOCInterface {
    private String filedata;

    public void run() {
        getData();

        Optional<String> resultA = runPartA();
        if (resultA.isPresent())
        System.out.println("Part A: " + resultA.get());

        Optional<String> resultB = runPartB();
        if (resultB.isPresent())
        System.out.println("Part B: " + resultB.get());
    }

    public void getData() {
        String rootPath = System.getProperty("user.dir");
        String className = getClass().getName();

        String yearDay = className.split("year_")[1];
        String year = yearDay.split(".Day")[0];
        String day = yearDay.split(".Day")[1];

        Path path = Paths.get(rootPath + "/src/main/resources/" + year + "/" + day + ".txt");

        try {
            setFiledata(Files.readString(path, StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.err.println("File not found: " + path);
            System.exit(1);
        }
    }

    public String getFiledata() {
        return filedata;
    }

    public void setFiledata(String filedata) {
        this.filedata = filedata;
    }
}
