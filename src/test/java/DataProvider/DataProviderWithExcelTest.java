package DataProvider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderWithExcelTest {

    @Test(dataProvider = "dataProviderWithExcel")
    public void test1(String username, String password, String fname, String lname){
        System.out.println(username);
    }

    @DataProvider
    public Object[][] dataProviderWithExcel(){

        Object[][] data = new Object[0][0];
        
        try(FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/DataProvider/inputValues.xlsx")) {
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            DataFormatter dataFormatter = new DataFormatter();

            int rowNum = sheet.getLastRowNum();
            int columnNum = sheet.getRow(0).getLastCellNum();

            data = new Object[rowNum][columnNum];
            for (int i = 1; i <= rowNum; i++) {
                for (int j = 0; j < columnNum; j++) {
                    data[i-1][j] = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
