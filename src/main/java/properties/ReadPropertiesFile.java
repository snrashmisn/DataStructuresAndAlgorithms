package main.java.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by rasn on 8/23/16.
 */
public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        final Properties props = new Properties();
        String a = "we";
        props.load(new FileInputStream("/Users/rasn/work/prompts/SecondaryText.properties"));
        System.out.println("props.getProperty(\"en_US.0001\") = " + props.getProperty("en_US.0001"));
        System.out.println("props.getProperty(\"en_US.0002\") = " + props.getProperty("en_US.0002"));
        System.out.println("props.getProperty(\"en_US.0003\") = " + props.getProperty("en_US.0003"));
        System.out.println("props.getProperty(\"en_US.0004\") = " + props.getProperty("en_US.0004"));

        System.out.println("props.getProperty(\"en_GB.0001\") = " + props.getProperty("en_GB.0001"));
        System.out.println("props.getProperty(\"en_GB.0002\") = " + props.getProperty("en_GB.0002"));
        System.out.println("props.getProperty(\"en_GB.0003\") = " + props.getProperty("en_GB.0003"));
        System.out.println("props.getProperty(\"en_GB.0004\") = " + props.getProperty("en_GB.0004"));
    }
}
