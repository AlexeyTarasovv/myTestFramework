package DataProvider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class DataProviderWithExcelTest {

    @Test(dataProvider = "dataProviderWithExcelWithMap")
    public void test1(Map<String, String> map){
        System.out.println(map.get("username"));
    }

    @DataProvider
    public Object[][] dataProviderWithExcelWithMap(){

        try(FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/DataProvider/inputValues.xlsx"))
        {
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            DataFormatter dataFormatter = new DataFormatter();

            int rowNum = sheet.getLastRowNum();
            int columnNum = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rowNum][1];
            Map<String, String> map;

            for (int i = 1; i <= rowNum; i++) {
                map = new HashMap<>();
                for (int j = 0; j < columnNum; j++) {
                    String key = dataFormatter.formatCellValue(sheet.getRow(0).getCell(j));
                    String value = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
                    map.put(key, value);
                }
                data[i-1][0] = map;
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test(dataProvider = "dataProviderWithExcelArray")
    public void test2(String username, String password, String fname, String lname){
        System.out.println(username);
    }

    @DataProvider
    public Object[][] dataProviderWithExcelArray(){

        try(FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/DataProvider/inputValues.xlsx"))
        {
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            DataFormatter dataFormatter = new DataFormatter();

            int rowNum = sheet.getLastRowNum();
            int columnNum = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rowNum][columnNum];
            for (int i = 1; i <= rowNum; i++) {
                for (int j = 0; j < columnNum; j++) {
                    data[i-1][j] = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
                }
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
