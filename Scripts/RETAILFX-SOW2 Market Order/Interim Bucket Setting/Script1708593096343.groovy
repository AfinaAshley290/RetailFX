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


Validation.scrolltoG1AAccount('9000 0001 8837')


Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Accounts']), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'FX']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)



checkLinkedDevice = Validation.checkElementExists('Object Repository/Market Order Page/android.widget.TextView - Enter your password')

'Check is there is password page'
if (checkLinkedDevice == true) {
	
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


Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Terms & Conditions']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Global Account Page/android.widget.TextView - Agree  Confirm'), 'clickable',
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
Mobile.tap(findTestObject('Global Account Page/android.widget.TextView - Agree  Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('Market Order Page/android.view.ViewGroupCurrency_text'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

pinNum = '5000'

numpad.enterCurrency(pinNum)

Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewEnter_buttone'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Select Currency Page'
Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewExpand_Select_Currency'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)
'Select Currency US'
CustomKeywords.'utilities.Mobile_Keywords.Market_Currency'('US Dol', 'USD - US Dollar')

'Verify Exchange Rate'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.takeScreenshot()
'Click Next button'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Next']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Account Selection Page')
'Verify The labe Step 2 of 2'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 0, FailureHandling.CONTINUE_ON_FAILURE)


CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.takeScreenshot()

'Tap to get qoute'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Get Quote']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Confirmation Page')

'Wait for confirmation page to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

'Confirm Term & Condition'
Mobile.tap(findTestObject('Market Order Page/android.widget.ImageView_TermCondition'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirm']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Transaction Successful Page')

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction successful']), 0,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction successful']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Share Receipt']), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(5)

Mobile.comment('Share Receipt Page')

'Wait for Share Receipt to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Exchange']), 15, FailureHandling.OPTIONAL)

Mobile.delay(5)

'Receipt show successful'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Completed']), 5, FailureHandling.OPTIONAL)


Mobile.takeScreenshot()

Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewBack_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction successful']), 0,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction successful']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Accounts']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Accounts']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

