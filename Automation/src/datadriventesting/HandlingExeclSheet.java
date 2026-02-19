package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExeclSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("./testdata/testscrpit.xlsx");
		Workbook wd = WorkbookFactory.create(fis);
		String value = wd.getSheet("searchProduct").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);

	}

}
