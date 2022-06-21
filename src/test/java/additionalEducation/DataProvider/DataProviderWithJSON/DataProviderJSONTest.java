package additionalEducation.DataProvider.DataProviderWithJSON;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class DataProviderJSONTest {

    @Test(dataProvider = "dataProviderWithJSON")
    public void testWithJSON(Map<String, Object> map){
        map.forEach((k,v)-> System.out.println(k + " " + v));
    }

    @DataProvider
    public Object[][] dataProviderWithJSON() throws IOException {
        HashMap<String, Object> map1 = new ObjectMapper()
                .readValue(new File(System.getProperty("user.dir") + "/src/test/java/additionalEducation/DataProvider/DataProviderWithJSON/config.json"),
                        new TypeReference<HashMap<String, Object>>() {});

        HashMap<String, Object> map2 = new ObjectMapper()
                .readValue(new File(System.getProperty("user.dir") + "/src/test/java/additionalEducation/DataProvider/DataProviderWithJSON/config2.json"),
                        new TypeReference<HashMap<String, Object>>() {});

        Object[][] objects = new Object[2][1];
        objects[0][0] = map1;
        objects[1][0] = map2;

        return objects;
    }
}

