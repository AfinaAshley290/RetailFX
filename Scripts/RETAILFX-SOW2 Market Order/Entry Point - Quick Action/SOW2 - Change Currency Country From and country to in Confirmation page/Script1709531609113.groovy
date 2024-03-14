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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import retailfx.Currency_Calculator as numpad
import retailfx.Validation as Validation
import java.text.DecimalFormat as DecimalFormat


Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.delay(15)

int a = 8

'Select G1A Account'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No',
				a)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15)

'Tap on Convert Currency'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Check for the 1st Login'
checkLinkedDevice = Validation.checkElementExists('Object Repository/Market Order Page/android.widget.TextView - Enter your password')

'Check is there is password page'
if (checkLinkedDevice == true) {
	'Verify is in Manage Device page'
	Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Username_Password').getValue(
			'Password', a), 0, FailureHandling.CONTINUE_ON_FAILURE)

	Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

	'Manage Devices page'
	Mobile.takeScreenshot()

	'Tap on proceed button'
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 10, FailureHandling.CONTINUE_ON_FAILURE)
} else {
	FailureHandling.CONTINUE_ON_FAILURE
}

Mobile.delay(15)

'Tap on the Im converting'
Mobile.tap(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15)

digits = '5000'

numpad.Currency_Numpad(digits)

'Select GBP'
CustomKeywords.'utilities.Mobile_Keywords.sow2market_orderdropdown'('USD', 'USD - US Dollar')

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 5, FailureHandling.CONTINUE_ON_FAILURE)

def currency_TextMsg = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 5, FailureHandling.CONTINUE_ON_FAILURE)

println('This is' + currency_TextMsg)

currency_TextMsg = currency_TextMsg.replace('USD 1 = MYR ', '')

double forex = Double.valueOf(currency_TextMsg)

double forex1 = 50.00 / forex

DecimalFormat decimalFormat = new DecimalFormat('#0.00')

String roundedNumber = decimalFormat.format(forex1)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Conversion fee']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Total to pay']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR 50.00']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('General/android.widget.EditText _AmountReceived', [('text') : roundedNumber]),
	5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Next']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Account Selection Page'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD/MYR']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Im coverting'
Mobile.verifyElementExist(findTestObject('android.widget.TextView - Im converting'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR 50.00']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer to']), 5, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.takeScreenshot()

'Tap to get qoute'
Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Get Quote']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for confirmation page to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 5, FailureHandling.CONTINUE_ON_FAILURE)

def currency_TextMsg2 = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 5, FailureHandling.CONTINUE_ON_FAILURE)

String roundedNumber2 = Validation.staffConvertUSDToMYR(currency_TextMsg2, 50.00)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (MYR)']), 5,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer to']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (USD)']), 5,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD ' + roundedNumber2]), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction type']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Conversion']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Tap on Currency'
Mobile.tap(findTestObject('SOW2-Market Order/Confirmation/Currency_Change'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 1 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Account Selection Page'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 1 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('TC039 - Validate user able to search for the currency')
CustomKeywords.'utilities.Market_Order.MarketOrder_FromDropdown'('GBP', 'GBP - British Pound Sterling')

Mobile.delay(5)

'Verify Select Currency Page'
CustomKeywords.'utilities.Mobile_Keywords.sow2market_orderdropdown'('MYR', 'MYR - Malaysian Ringgit')

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 5, FailureHandling.CONTINUE_ON_FAILURE)

/*def currency_TextMsg3 = Mobile.getText(findTestObject('General/android.widget.TextView - ConversionGBP'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String roundedNumber3 = Validation.staffConvertMYRToGBP(currency_TextMsg3, 50.00)*/

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Conversion fee']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Total to pay']), 5, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '60.00']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 5, FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.verifyElementExist(findTestObject('General/android.widget.EditText _AmountReceived', [('text') : roundedNumber3]),
	5, FailureHandling.CONTINUE_ON_FAILURE)*/

Mobile.takeScreenshot()

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Next']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Account Selection Page'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP/MYR']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Im coverting'
Mobile.verifyElementExist(findTestObject('Market Order Page/android.widget.TextView - Im converting'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR 60.00']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer to']), 5, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.takeScreenshot()

'Tap to get qoute'
Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Get Quote']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for confirmation page to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (MYR)']), 5,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (GBP)']), 5,
	FailureHandling.CONTINUE_ON_FAILURE)


Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer to']), 5, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 5, FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP ' + roundedNumber3]), 5, FailureHandling.CONTINUE_ON_FAILURE)*/

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction type']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Conversion']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'I have read and agree to the BNM Foreign Exchange Rules, I accept the declaration as well as the Terms & Conditions for this transfer.']),
	5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

'Confirm Term & Condition'
Mobile.tap(findTestObject('SOW2-Market Order/android.view.View - I have read and agree to the BNM Foreign Exchange Rules, I accept the declaration as well as the Terms  Conditions for this transfer'),
	0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

'Tap Confirm'
Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Confirm']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Transaction Successful page'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 5,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Reference ID']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Get ReferenceID'
def reference_id = Mobile.getText(findTestObject('Market Order Page/android.widget.TextView - Reference ID'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Order ID']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Date & time']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Converted from']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount received']), 5, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP ' + roundedNumber3]), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction type']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Conversion']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Share Receipt']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Share Receipt']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

'Wait for Share Receipt to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Exchange']), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

'Receipt show successful'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Completed']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Exchange']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'From account']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (GBP)\n\n9000 0001 8837']),
	5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'To account']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (MYR)\n\n9000 0001 8837']),
	5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction type']), 5, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Conversion']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount received']), 5, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP ' + roundedNumber3]), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewBack_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 5,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 0, FailureHandling.CONTINUE_ON_FAILURE)


