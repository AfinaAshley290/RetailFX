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
import retailfx.Validation as Validation

WebUI.callTestCase(findTestCase('Home_Page/Login Page'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Global Account Page/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

checkLinkedDevice = Validation.checkElementExists('Object Repository/Global Account Page/android.widget.TextView - Kill Switch')

if (checkLinkedDevice == true) {
    'Verify is in Manage Device page'
    Mobile.verifyElementExist(findTestObject('General/android.widget.TextView - Kill Switch (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)

    'Manage Devices page'
    Mobile.takeScreenshot()

    'Tap on proceed button'
    Mobile.tap(findTestObject('General/android.widget.TextView - Got It (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
} else {
    FailureHandling.CONTINUE_ON_FAILURE
}


Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

'Verify Accounts Header'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Accounts']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Accounts Global Access Account-i'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i']), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

'Verify Accounts No'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Total Currency Balance'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Total Currency Balance']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify Based on indicative rates as at todays date'
Mobile.verifyElementExist(findTestObject('General/android.widget.TextView - Based on indicative rates as at'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify View Transactions Exist'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'View Transactions']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Your Currency section exists'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Your Currencies']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Total Currency Balance'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Home currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Total Currency Balance'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'TRANSACT']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Total Currency Balance'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MANAGE']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(158, 2070, 0, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'DETAILS']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Current balance']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'One-day float']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'tap on FX tab'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'FX']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Convert Currency Button'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromBottomToTop'()

Mobile.tap(findTestObject('Global Account Page/android.widget.TextView - View Transactions'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/Transaction_Page/android.widget.TextView - Transactions'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/Transaction_Page/android.widget.TextView - Transactions'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/Transaction_Page/android.widget.ImageView'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/Transaction_Page/android.widget.ExpandTransaction'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/Transaction_Page/android.widget.TextView - Cancel'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/Transaction_Page/android.widget.TextView - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/Transaction_Page/android.widget.TextView - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/Transaction_Page/android.widget.ImageView'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/android.widget.TextView - View Transactions'), 20, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'MANAGE']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Auto Sweep']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Auto Sweep']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Check for on Conversion JPY'
Mobile.tap(findTestObject('Market Order Page/android.widget.TextView - JPY_Currency'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'ACTIONS']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Back to home currency'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Home currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'FX']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'More features coming your way.']), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0)

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)

checkLinkedDevice = Validation.checkElementExists('Object Repository/Market Order Page/android.widget.TextView - Enter your password')

'Check is there is password page'
if (checkLinkedDevice == true) {
	
	Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), 'Maybank@1', 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 10, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.delay(2)

	'Manage Devices page'
	Mobile.takeScreenshot()


	Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), 'maybank@1', 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 10, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.delay(2)
	
	'Manage Devices page'
	Mobile.takeScreenshot()
	
    'Verify is in Manage Device page'
    Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Username_Password').getValue(
            'Password', 3), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

    'Manage Devices page'
    Mobile.takeScreenshot()

    'Tap on proceed button'
    Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 10, FailureHandling.CONTINUE_ON_FAILURE)
} else {
    FailureHandling.CONTINUE_ON_FAILURE
}


/*Mobile.verifyElementAttributeValue(findTestObject('Global Account Page/android.widget.TextView - Agree  Confirm'), 'clickable', 
    'false', 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

'Tap Agree and Confirm'
Mobile.tap(findTestObject('Global Account Page/android.widget.TextView - Agree  Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)*/

