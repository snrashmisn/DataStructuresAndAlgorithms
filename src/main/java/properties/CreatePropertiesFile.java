package main.java.properties;

/**
 * Created by rasn on 8/23/16.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreatePropertiesFile {
    public static void main(String[] args) {

        Properties prop = new Properties();
        OutputStream output = null;

        try {

            output = new FileOutputStream("config.properties");

            // set the properties value
            prop.setProperty("OAuthEndpoint", "https://idbroker.webex.com/idb");
            prop.setProperty("ScimClientId", "C3afb2453bed9fb2790d7b6b51b4f532ef17c6de26c3ed5935483aa82761f1f32");
            prop.setProperty("ScimClientSecret", "22f559151f93995afbd6bb6015e0c982bfc50ce37ef62317210a316f9d7d3f4d");
            prop.setProperty("ScimEndpointUrl", "https://identity.webex.com");
            prop.setProperty("OrgId","6078fba4-49d9-4291-9f7b-80116aab6974");
            prop.setProperty("MachineAccountName","VORServiceForProd");
            prop.setProperty("MachineAccountPassword","Z-1SM6;b]gq~80@^5IKwl;[eq2M7BxA1");
            prop.setProperty("ScimClientScope","Identity:SCIM");


            // save properties to project root folder
            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
