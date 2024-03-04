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

	if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.OPTIONAL))
	{
		Mobile.delay(2)
		Mobile.takeScreenshot()
	    Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.CONTINUE_ON_FAILURE)
	   break;
	
	}
	else
	{
		CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()
	}
		
}


Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Accounts']), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'FX']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'More features coming your way.']), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

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

def currency_TextMsg = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String roundedNumber = Validation.convertUSDToMYR(currency_TextMsg)

'Verify Conversion fee available'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Conversion fee']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify Total to pay available'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Total to pay']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify MYR 50 available'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR 50.00']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify Amount to receive available'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify the conversion amount is the same'
Mobile.verifyElementExist(findTestObject('General/android.widget.EditText _AmountReceived', [('text') : roundedNumber]), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()
'Click Next button'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Next']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Account Selection Page')
'Verify The labe Step 2 of 2'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the conversion USD/MYR label'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD/MYR']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Im coverting label'
Mobile.verifyElementExist(findTestObject('Market Order Page/android.widget.TextView - Im converting'), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify the MYR 50 is showing'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR 50.00']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer to']), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

/*Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Kindly read the BNM Foreign Exchange Rules, the declaration and the Terms and Conditions.for this transfer before proceeding']), 
    0, FailureHandling.CONTINUE_ON_FAILURE)*/
Mobile.takeScreenshot()

'Tap to get qoute'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Get Quote']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Confirmation Page')

def currency_TextMsg2 = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String roundedNumber2 = Validation.convertUSDToMYR(currency_TextMsg2)

'Wait for confirmation page to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify the Transfer from Globle Access Account is showing'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i']), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer to']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify the Transfer To Globle Access Account is showing'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i']), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify the conversion amount is the same'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD ' + roundedNumber2]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction type']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Conversion']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'I have read and agree to the BNM Foreign Exchange Rules, I accept the declaration as well as the Terms & Conditions for this transfer.']), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

'Confirm Term & Condition'
Mobile.tap(findTestObject('Market Order Page/android.widget.ImageView_TermCondition'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirm']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Transaction Successful Page')

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction successful']), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction successful']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Reference ID']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Get ReferenceID'
def reference_id = Mobile.getText(findTestObject('Market Order Page/android.widget.TextView - Reference ID'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Order ID']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Date & time']), 0, FailureHandling.CONTINUE_ON_FAILURE)

def date_time = Mobile.getText(findTestObject('Global Account Page/dynamicText', [('text') : 'Date & time']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Converted from']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount received']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify the conversion amount is the same'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD ' + roundedNumber2]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction type']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Conversion']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Share Receipt']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Share Receipt']), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(5)

Mobile.comment('Share Receipt Page')

'Wait for Share Receipt to show'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Exchange']), 15, FailureHandling.OPTIONAL)

Mobile.delay(5)

'Receipt show successful'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Completed']), 5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : date_time]), 5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Exchange']), 5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'From account']), 5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (MYR)\n\n9000 0001 8837']), 
    5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'To account']), 5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (USD)\n\n9000 0001 8837']), 
    5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction type']), 5, FailureHandling.OPTIONAL)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Conversion']), 5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount received']), 5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD ' + roundedNumber2]), 5, FailureHandling.OPTIONAL)

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

CustomKeywords.'utilities.Mobile_Keywords.scrollFromBottomToTop'()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'View Transactions']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('General/android.widget.TextView - transaction summary', [('text') : 'CONVERT MYR to USD INCREDIBLE HULK *REF:' + reference_id]), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

def Currency = Mobile.getText(findTestObject('SOW2-Market Order/TransactionHistory- AmountConvert'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Transaction Conversion is Correct'
Mobile.comment(Currency)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('View_Transaction/android.widget.ImageView_XtransactionButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)


