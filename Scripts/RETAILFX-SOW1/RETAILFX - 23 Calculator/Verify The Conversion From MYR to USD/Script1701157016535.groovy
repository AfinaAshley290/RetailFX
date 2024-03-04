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


Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Calculator']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Calculator']), 20,
	FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Calculator']), 20,
	FailureHandling.CONTINUE_ON_FAILURE)

'Verify The Conversion From MYR to USD'
Mobile.tap(findTestObject('General/android.widget.ImageFrom_Dropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.select_Currency'('MYR', 'MYR - Malaysian Ringgit')

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Calculator']), 20, 
    FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('General/android.widget.EditText _Ammount'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('General/android.widget.Image_enterButton'), 20, FailureHandling.CONTINUE_ON_FAILURE)

pinNum = '50000'

numpad.enterCurrency(pinNum)

Mobile.tap(findTestObject('General/android.widget.Image_enterButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the To Currency'
Mobile.tap(findTestObject('General/android.widget.ImageTo_Dropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'utilities.Mobile_Keywords.select_Currency'('USD', 'USD - US Dollar')

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Calculator']), 20, 
    FailureHandling.CONTINUE_ON_FAILURE)


/*Mobile.waitForElementPresent(findTestObject('General/android.widget.Image_enterButton'), 20, FailureHandling.CONTINUE_ON_FAILURE)

pinNum = '50000'

numpad.enterCurrency(pinNum)

Mobile.tap(findTestObject('General/android.widget.Image_enterButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)*/

Mobile.tap(findTestObject('General/android.widget.Button_Dynamic', [('text') : 'Calculate']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD']), 0, FailureHandling.CONTINUE_ON_FAILURE)

def currency_TextMsg = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

println('This is' + currency_TextMsg)

currency_TextMsg = currency_TextMsg.replace('USD 1 = MYR ', '')

double forex = Double.valueOf(currency_TextMsg)

double forex1 = 500.00 / forex

DecimalFormat decimalFormat = new DecimalFormat('#0.00')

String roundedNumber = decimalFormat.format(forex1)

Mobile.verifyElementExist(findTestObject('General/android.widget.EditText _AmountReceived', [('text') : roundedNumber]), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

obile.tap(findTestObject('General/android.widget.Image_SwapButton'), 0, FailureHandling.STOP_ON_FAILURE)

'Verify the From Currency'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD - US Dollar']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the To Currency'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR - Malaysian Ringgit']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Enter Amount'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'USD']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Enter Amount set to 0.00'
Mobile.verifyElementExist(findTestObject('General/android.widget.EditText_Dynamic', [('text') : '0.00']), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('General/android.widget.EditText _Ammount'), 0, FailureHandling.STOP_ON_FAILURE)

pinNum = '50000'

numpad.enterCurrency(pinNum)

Mobile.tap(findTestObject('General/android.widget.Image_enterButton'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('General/android.widget.Button_Dynamic', [('text') : 'Calculate']), 0, FailureHandling.CONTINUE_ON_FAILURE)

def currency_TextMsg = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

println('This is' + currency_TextMsg)

currency_TextMsg = currency_TextMsg.replace('USD 1 = MYR ', '')

double forex = Double.valueOf(currency_TextMsg)

double forex1 = 500.00 * forex

DecimalFormat decimalFormat = new DecimalFormat('#0.00')

String roundedNumber = decimalFormat.format(forex1)

Mobile.verifyElementExist(findTestObject('General/android.widget.EditText _AmountReceived', [('text') : roundedNumber]), 0, FailureHandling.CONTINUE_ON_FAILURE)


