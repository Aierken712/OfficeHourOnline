package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;
    private static FileInputStream fileInputStream;

    static {

        try {
            // file Reader as byte code
            fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);

        }catch (Exception e){
            System.out.println("The config file did not load");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
