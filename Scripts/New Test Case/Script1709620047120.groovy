import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import retailfx.Currency_Calculator as numpad
import retailfx.Validation as Validation
import java.text.DecimalFormat as DecimalFormat

Mobile.startExistingApplication('com.maybank2u.life.uat')
Mobile.openNotifications()

Mobile.delay(10)

if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MAE (UAT)']), 0, FailureHandling.OPTIONAL)) {
	
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'MAE (UAT)']), 0, FailureHandling.CONTINUE_ON_FAILURE)

	if (Mobile.verifyElementText(findTestObject('Global Account Page/dynamicText', [('text') : 'Maybank2u: Currency Exchange']),
		'Maybank2u: Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)) {
		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Maybank2u: Currency Exchange']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		def Notif_statement = Mobile.getText(findTestObject('null'), 0, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.comment(Notif_statement)
	}
} else {
	Mobile.closeNotifications()
}