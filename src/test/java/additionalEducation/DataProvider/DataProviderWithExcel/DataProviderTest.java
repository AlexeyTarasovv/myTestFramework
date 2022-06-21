package additionalEducation.DataProvider.DataProviderWithExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "getData")
    public void test1(Object[] objects){
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    @Test(dataProvider = "getData")
    public void test2(Object[] objects){
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    @DataProvider
    public Object[][] getData(Method m) {
        if (m.getName().equalsIgnoreCase("test1")) {
            return new Object[][] {
                    {"one", "1111", "1"},
                    {"two", "2222", "2"},
                    {"three", "3333", "3"}
            };
        }
        else if (m.getName().equalsIgnoreCase("test2")){
            return new Object[][] {
                    {"two", "2222", "2"},
                    {"three", "3333", "3"},
                    {"one", "1111", "1"}
            };
        }
        return null;
    }
}
