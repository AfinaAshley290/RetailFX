package retailfx
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*


class data_to_excel {

	public static write_to_excel(int number_row, reference_number) {
		// Specify the file path
		String filePath = "/Users/00145409nuralianatasha/Desktop/automation_Retail_FX(public_git)/Data Files/Export_ReferenceID.xlsx"

		// Open the Excel file
		FileInputStream fis = new FileInputStream(filePath)
		XSSFWorkbook workbook = new XSSFWorkbook(fis)

		// Get the first sheet of the Excel file
		XSSFSheet sheet = workbook.getSheetAt(0)

		// Write data to a specific cell (e.g., row 1, column 1)
		Row row = sheet.createRow(number_row)
		Cell cell = row.createCell(0)
		cell.setCellValue(reference_number)

		// Save the changes
		FileOutputStream fos = new FileOutputStream(filePath)
		workbook.write(fos)

		// Close the streams
		fos.close()
		workbook.close()
	}

	public static dealt_ammount(int number_row, reference_number, username, base_currency, dealt_currency, amount_receive) {
		// Specify the file path
		String filePath = "/Users/00145409nuralianatasha/Desktop/automation_Retail_FX(public_git)/Data Files/different_UserTest.xlsx"

		// Open the Excel file
		FileInputStream fis = new FileInputStream(filePath)
		XSSFWorkbook workbook = new XSSFWorkbook(fis)

		// Get the first sheet of the Excel file
		XSSFSheet sheet = workbook.getSheetAt(0)

		// Write data to a specific cell (e.g., row 1, column 1)
		Row row = sheet.createRow(number_row)
		Cell cell1 = row.createCell(0)
		Cell cell2 = row.createCell(1)
		Cell cell3 = row.createCell(2)
		Cell cell4 = row.createCell(3)
		Cell cell5 = row.createCell(4)

		//Data to be export
		cell1.setCellValue(username)
		cell2.setCellValue(base_currency)
		cell3.setCellValue(dealt_currency)
		cell4.setCellValue(amount_receive)
		cell5.setCellValue(reference_number)

		// Save the changes
		FileOutputStream fos = new FileOutputStream(filePath)
		workbook.write(fos)

		// Close the streams
		fos.close()
		workbook.close()
	}
}