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

def GAAAcountNo = '9000 0001 9892'

WebUI.callTestCase(findTestCase('Home_Page/Login Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.startExistingApplication('com.maybank2u.life.uat')*/
Mobile.verifyElementExist(findTestObject('Global Account Page/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

checkLinkedDevice = Validation.checkElementExists('Object Repository/Global Account Page/android.widget.TextView - Kill Switch')

if (checkLinkedDevice == true) {
	'Verify is in Manage Device page'
	Mobile.verifyElementExist(findTestObject('Object Repository/Global Account Page/android.widget.TextView - Kill Switch'),
		0, FailureHandling.CONTINUE_ON_FAILURE)

	'Manage Devices page'
	Mobile.takeScreenshot()

	'Tap on proceed button'
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Got It']), 10, FailureHandling.CONTINUE_ON_FAILURE)
} else {
	FailureHandling.CONTINUE_ON_FAILURE
}


for (int i = 0; i < 3; i++) {
	
		if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : GAAAcountNo]), 5, FailureHandling.OPTIONAL))
		{
			Mobile.delay(2)
			Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : GAAAcountNo]), 0, FailureHandling.CONTINUE_ON_FAILURE)

            Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : GAAAcountNo]), 0, FailureHandling.CONTINUE_ON_FAILURE)

            Mobile.takeScreenshot()

            Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : GAAAcountNo]), 0, FailureHandling.CONTINUE_ON_FAILURE)
		   break;
		
		}
		else
		{
			CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()
		}
			
	}


