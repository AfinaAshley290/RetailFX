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


Mobile.delay(5)


CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

'tap on USD'
Mobile.tap(findTestObject('Market Order Page/android.widget.TextView_Click on USD'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()


Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'ACTIONS']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(5)

Mobile.tap(findTestObject('Market Order Page/android.view.ViewGroupCurrency_text'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

pinNum = '5000'

numpad.enterCurrency(pinNum)

Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewEnter_buttone'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Select Currency Page'
Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewExpand_Select_Currency'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.Market_Currency'('US Dol', 'USD - US Dollar')

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 0, FailureHandling.CONTINUE_ON_FAILURE)

def currency_TextMsg = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String roundedNumber = Validation.convertMYRtoUSD(currency_TextMsg)


//Mobile.verifyElementExist(findTestObject('General/android.widget.EditText _AmountReceived', [('text') : roundedNumber]), 
   // 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(5)
Mobile.tap(findTestObject('Market Order Page/android.widget.EditText _AmountReceivedTextbox'), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(5)
pinNum2 = '1500000'

numpad.enterCurrency(pinNum2)

Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewEnter_buttone'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Check on Im Coverting'

def currency_TextMsg2 = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)



String roundedNumber2 = Validation.convertUSDToMYR(currency_TextMsg2)



//Mobile.verifyElementExist(findTestObject('General/android.widget.EditText _AmountReceived', [('text') : roundedNumber2]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Next']), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Account Selection Page'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD/MYR']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Get Quote']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for confirmation page to show'


Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i']), 0,
	FailureHandling.CONTINUE_ON_FAILURE)


//Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR ' + roundedNumber2]), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

'Confirm Term & Condition'
Mobile.tap(findTestObject('Market Order Page/android.widget.ImageView_TermCondition'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirm']), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Transaction Successful page'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction successful']), 0,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction successful']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Get ReferenceID'
def reference_id = Mobile.getText(findTestObject('Market Order Page/android.widget.TextView - Reference ID'), 0, FailureHandling.CONTINUE_ON_FAILURE)

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

//Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (USD)\n\n9000 0001 8837']), 5,
	//FailureHandling.CONTINUE_ON_FAILURE)



Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'To account']), 5, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (MYR)\n\n9000 0001 8837']), 5,
	//FailureHandling.CONTINUE_ON_FAILURE)


CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()


//Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR ' + roundedNumber2]), 5, FailureHandling.CONTINUE_ON_FAILURE)

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

//Mobile.verifyElementExist(findTestObject('General/android.widget.TextView - transaction summary', [('text') : 'CONVERT MYR to USD INCREDIBLE HULK *REF:' + reference_id]), 
    //0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('USD ' + roundedNumber)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('View_Transaction/android.widget.ImageView_XtransactionButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()



