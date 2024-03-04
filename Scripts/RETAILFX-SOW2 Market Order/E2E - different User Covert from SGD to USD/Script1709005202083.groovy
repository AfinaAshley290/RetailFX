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
import retailfx.Utility as Utility
import retailfx.data_to_excel as ExportExcel

Mobile.startExistingApplication('com.maybank2u.life.uat')

for (def row = 1; row <= findTestData('Different_User').getRowNumbers(); row++) {
    CustomKeywords.'utilities.General_Onboarding.Onboarding_Different_User'(row)
	
	username = findTestData('Dealt_MYR_SGD').getValue('Username', row)
	
	base_currency = findTestData('Dealt_MYR_SGD').getValue('Base_Currency', row)
	
	dealt_currency = findTestData('Dealt_MYR_SGD').getValue('Dealt_Currency', row)


    'Check for the 1st Login'
    checkLinkedDevice = Validation.checkElementExists('Object Repository/Market Order Page/android.widget.TextView - Enter your password')

    'Check is there is password page'
    if (checkLinkedDevice == true) {
        'Verify is in Manage Device page'
        Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Different_User').getValue(
                'Password', row), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

        'Manage Devices page'
        Mobile.takeScreenshot()

        'Tap on proceed button'
        Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 10, FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        FailureHandling.CONTINUE_ON_FAILURE
    }
    
    Mobile.delay(10)

    'Select Currency From'
    CustomKeywords.'utilities.Deal_Agregator.MarketOrder_FromDropdown'(findTestData('Different_User').getValue('Base_Currency', 
            row))

    Mobile.delay(10)

    'Tap on the Im converting'
    Mobile.tap(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    digits = '5000'

    numpad.Currency_Numpad(digits)

    'Select Currency'
    CustomKeywords.'utilities.Deal_Agregator.sow2market_orderdropdown'(findTestData('Different_User').getValue('Dealt_Currency', 
            row))

    Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange rate']), 5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot()

    'Tap Next'
    Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Next']), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

    'Verify Account Selection Page'
    Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot()

    'Tap to get qoute'
    Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Get Quote']), 0, FailureHandling.CONTINUE_ON_FAILURE)

    'Wait for confirmation page to show'
    Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.comment('Confirmation Page')

    Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Amount to receive']), 5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

    'Confirm Term & Condition'
    Mobile.tap(findTestObject('SOW2-Market Order/android.view.View - I have read and agree to the BNM Foreign Exchange Rules, I accept the declaration as well as the Terms  Conditions for this transfer'), 
        0, FailureHandling.CONTINUE_ON_FAILURE)

    CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

    'Tap Confirm button'
    Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Confirm']), 0, FailureHandling.CONTINUE_ON_FAILURE)

    'Transaction Successful'
    Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 
        5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 
        5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Reference ID']), 0, FailureHandling.CONTINUE_ON_FAILURE)

     'Get ReferenceID'
    def reference_id = Mobile.getText(findTestObject('Market Order Page/android.widget.TextView - Reference ID'), 5, FailureHandling.CONTINUE_ON_FAILURE)

    def amount_received = Mobile.getText(findTestObject('transaction_successful/Amount received'), 5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.comment(reference_id)

    Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Share Receipt']), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.delay(10)

    'Wait for Share Receipt to show'
    Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Exchange']), 5, 
        FailureHandling.CONTINUE_ON_FAILURE)

    'Receipt show successful'
    Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Completed']), 5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot()

    CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

    Mobile.delay(5)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewBack_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 
        0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 
        0, FailureHandling.CONTINUE_ON_FAILURE)
	
	String CurrentDate = Validation.datetime()
	
	Mobile.comment('The Current Date is ' + CurrentDate)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'Export Data to Excel'
	ExportExcel.dealt_ammount(row, reference_id, username, base_currency, dealt_currency, amount_received)

    Mobile.tap(findTestObject('SOW2-Market Order/Back_Button_Currency_Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Utility.doubleTap()

    Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'DEV OPTIONS']), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'CLEAR DATA & CACHE']), 0, 
        FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'CLEAR DATA & CACHE']), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Button - YES'), 0, FailureHandling.CONTINUE_ON_FAILURE)
}

