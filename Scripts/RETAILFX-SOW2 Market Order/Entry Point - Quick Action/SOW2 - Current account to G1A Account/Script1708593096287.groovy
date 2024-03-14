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


int a = 8

'Select G1A Account'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No', 
                a)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.delay(5)

'Tap on the Im converting'
Mobile.tap(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), 0, FailureHandling.CONTINUE_ON_FAILURE)


digits = '1000'

currency_Numpad(digits)


'Select USD'
CustomKeywords.'utilities.Mobile_Keywords.sow2market_orderdropdown'('US Dol', 'USD - US Dollar')

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 5, FailureHandling.CONTINUE_ON_FAILURE)

def currency_TextMsg = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String roundedNumber = Validation.staffConvertUSDToMYR(currency_TextMsg, 10.00)


Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Conversion fee']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'get Conversion Fee'
def Conversion_Fee = Mobile.getText(findTestObject('SOW2-Market Order/ConversionFee_Text'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Total to pay']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR 10.00']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 5, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.verifyElementExist(findTestObject('General/android.widget.EditText _AmountReceived', [('text') : roundedNumber]),
	5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()


'Tap Next'
Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Next']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Select account'
CustomKeywords.'utilities.Market_Order.Account_Selection'('564017148767')

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Current Account-i (MYR)']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Tap to get qoute'
Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Get Quote']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for confirmation page to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 5, FailureHandling.CONTINUE_ON_FAILURE)

def currency_TextMsg1 = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String roundedNumber1 = Validation.staffConvertUSDToMYR(currency_TextMsg1, 10.00)


Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Current Account-i (MYR)']), 5,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer to']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (USD)']), 5,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD ' + roundedNumber1]), 5, FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Order ID']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Get ReferenceID'
def reference_id = Mobile.getText(findTestObject('Market Order Page/android.widget.TextView - Reference ID'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Order ID']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Date & time']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Converted from']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount received']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD ' + roundedNumber1]), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction type']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Conversion']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Share Receipt']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)


'Tap Share Receipt'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Share Receipt']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(10)

'Wait for Share Receipt to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Exchange']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Receipt show successful'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Completed']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'From account']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Current Account-i\n\n5640 1714 8767']), 5, FailureHandling.CONTINUE_ON_FAILURE)



Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'To account']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (USD)\n\n9000 0002 1160']), 5, FailureHandling.CONTINUE_ON_FAILURE)


CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : Conversion_Fee]), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount received']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD ' + roundedNumber1]), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewBack_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 5,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()


'tap Done'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 0, FailureHandling.CONTINUE_ON_FAILURE)


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





