import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        System.out.println("start working ....");
        JacksonHandller.importDataFromJasonFile();
        JacksonHandller.exportDataToXmlFile();
    }
}
