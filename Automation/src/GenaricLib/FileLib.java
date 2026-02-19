package GenaricLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String readPropertiesFile(String key) throws IOException {
		FileInputStream f = new FileInputStream("./testdata/commondata.properties");
		Properties p = new Properties();
		p.load(f);
		String data = p.getProperty(key);
		return data;
	}
	public String readExcelFile(String sheet, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("./testdata/testscrpit.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String data = wb.getSheet(sheet).getRow(rowIndex).getCell(cellIndex).toString();
		return data;
	}


}