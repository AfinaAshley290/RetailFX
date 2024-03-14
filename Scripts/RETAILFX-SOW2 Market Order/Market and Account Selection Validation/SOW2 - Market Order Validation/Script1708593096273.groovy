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

Mobile.startExistingApplication('com.maybank2u.life.uat')

CustomKeywords.'utilities.Entry_Point.Quick_Action'(8)

checkLinkedDevice = Validation.checkElementExists('Object Repository/Market Order Page/android.widget.TextView - Enter your password')

'Check is there is password page'
if (checkLinkedDevice == true) {
    'Verify is in Manage Device page'
    Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Username_Password').getValue(
            'Password', 8), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

    'Manage Devices page'
    Mobile.takeScreenshot()

    'Tap on proceed button'
    Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 10, FailureHandling.CONTINUE_ON_FAILURE)
} else {
    FailureHandling.CONTINUE_ON_FAILURE
}

Mobile.delay(10)

Validation.Terms_Condition()


'TC036 -  Validate the currency dropdown ccy1'
Mobile.comment('TC036')

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/SOW2-Market Order/Convert_Dropdown/android.widget.TextView - Convert_Dropdown'), 
    5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR - Malaysian Ringgit']), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD - US Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP - British Pound Sterling']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR - Malaysian Ringgit']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 1 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 1 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('TC043 & TC045 - Validate the amount 1 field & Validate the converting amount default to 0.00')

Mobile.verifyElementText(findTestObject('Object Repository/Calc_Pad/android.widget.EditText - 0.00'), '0.00', FailureHandling.CONTINUE_ON_FAILURE)

'Enter 0.01 Currency'
Mobile.comment('TC048 and TC049')

Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.EditText - 0.00'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15)

digits = '1'

currency_Numpad(digits)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'The minimum amount is MYR1.00.']), 
    5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'The minimum amount is MYR1.00.']), 
    5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()

Mobile.delay(10)

'TC052'
Mobile.comment('TC052')

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15)

digits1 = '1000000000'

currency_Numpad(digits1)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Reach the max value: MYR1,000,000.00']), 
    5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Reach the max value: MYR1,000,000.00']), 
    5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()

/* CCY2*/
'Validate Currency Dropdown CCY2'
Mobile.comment('TC054,TC055 and TC058')

'Verify Select Currency Page'
Mobile.tap(findTestObject('SOW2-Market Order/Select_Currency Dropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD - US Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP - British Pound Sterling']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'EUR - Euro']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'AUD - Australian Dollar']), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'JPY - Japanese Yen']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'SGD - Singapore Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'CAD - Canadian Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Select Currency Page'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'USD - US Dollar']), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.sow2market_orderdropdown'('US Dol', 'USD - US Dollar')

'Validate CCY1 = 0.00 if CCY2 = 0.00'
def get_amount = Mobile.getText(findTestObject('SOW2-Market Order/Amount_To_Received'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText _Amount to Received'), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(10)

numpad.remove_Amount(get_amount)
Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.Image'), 5, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), '0.00', FailureHandling.CONTINUE_ON_FAILURE)

'TC066 - Validate Exchange Rate value when currency 2 change'

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText _Amount to Received'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15)

digits2 = '20000'

currency_Numpad(digits2)

def currency_TextMsg2 = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 5, FailureHandling.CONTINUE_ON_FAILURE)

String roundedNumber2 = Validation.staffConvertMYRtoUSD(currency_TextMsg2, 10.00)

Mobile.comment('Print out Exchange Rate' + currency_TextMsg2)

Mobile.verifyElementText(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), roundedNumber2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'TC082 - Validate the currency on error message when user input amount 2 below than minimum'
def get_amount2 = Mobile.getText(findTestObject('SOW2-Market Order/Amount_To_Received'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText _Amount to Received'), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(10)

numpad.remove_Amount(get_amount2)

Mobile.delay(15)

digits3 = '1'

currency_Numpad(digits3)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'The minimum amount is USD1.00.']),
	5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'The minimum amount is USD1.00.']),
	5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()


Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText _Amount to Received'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(10)

digits4 = '0000000000'

currency_Numpad(digits4)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Reach the max value: USD1,000,000.00']),
	5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Reach the max value: USD1,000,000.00']),
	5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 1 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify The Market Order Page'
Mobile.verifyElementExist(findTestObject('SOW2-Market Order/BackButton_MarketOrder'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/CancelButtone_MarketOrder'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'TC002'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 1 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Market Order Page/android.widget.TextView - Im converting'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'to']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Select currency']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Next']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'TC034 - Validate the ccy1 value is default to the account chose by the user'
Mobile.comment('TC034')

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'TC031 - Validate the back button on Market Order page'
Mobile.comment('TC031')

Mobile.tap(findTestObject('SOW2-Market Order/BackButton_MarketOrder'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Market Order Page/android.widget.TextView - Im converting'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Market Order Page/android.widget.TextView - Im converting'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

'TC032 - Validate the close button on Market Order page'
Mobile.comment('TC032')

Mobile.tap(findTestObject('SOW2-Market Order/CancelButtone_MarketOrder'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

def currency_Numpad(String digits) {
   int digit_length = digits.length()
	
			for(int i=0;i<digit_length;i++) {
	
				if((digits[i])=='1') {
	
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 1'), 5, FailureHandling.OPTIONAL)
				}
				else if((digits[i])=='2') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 2'), 5, FailureHandling.OPTIONAL)
				}
				else if((digits[i])=='3') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 3'), 5, FailureHandling.OPTIONAL)
				}
	
				else if((digits[i])=='4') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 4'), 5, FailureHandling.OPTIONAL)
				}
				else if((digits[i])=='5') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 5'), 5, FailureHandling.OPTIONAL)
				}
				else if((digits[i])=='6') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 6'), 5, FailureHandling.OPTIONAL)
				}
				else if((digits[i])=='7') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 7'), 5, FailureHandling.OPTIONAL)
				}
				else if((digits[i])=='8') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 8'), 5, FailureHandling.OPTIONAL)
				}
				else if((digits[i])=='9') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 9'), 5, FailureHandling.OPTIONAL)
				}
				else if((digits[i])=='0') {
					Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 0'), 5, FailureHandling.OPTIONAL)
				}
			}
	
	
			Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.Image'), 5, FailureHandling.OPTIONAL)
}

