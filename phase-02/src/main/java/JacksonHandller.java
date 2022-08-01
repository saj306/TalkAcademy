
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JacksonHandller {

    public static void importDataFromJasonFile() {
        ArrayList<Employee> employees = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            employees = objectMapper.readValue(new File("src/main/resources/EmployeeData.json"), new TypeReference<ArrayList<Employee>>() {
            });
            Employee.setEmployees(employees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exportDataToXmlFile() {

        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File("src/main/resources/EmployeeInformation.xml"), Employee.getEmployees());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
