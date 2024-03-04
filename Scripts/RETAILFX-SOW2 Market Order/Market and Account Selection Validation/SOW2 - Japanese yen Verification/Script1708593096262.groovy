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


Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 5, FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.delay(5)

'TC052'
Mobile.comment('Minimum for JPY')

CustomKeywords.'utilities.Deal_Agregator.MarketOrder_FromDropdown'('JPY')

Mobile.delay(15)

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(20)

digits1 = '1000'

currency_Numpad(digits1)

Mobile.delay(20)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'The minimum amount is JPY1000.00.']),
	5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'The minimum amount is JPY1000.00']),
	5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()


Mobile.comment('Maximum for JPY')

Mobile.delay(15)

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(20)

digits1 = '11100000000'

currency_Numpad(digits1)

Mobile.delay(20)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Reach the max value: JPY10,000,000.00']),
	5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Reach the max value: JPY10,000,000.00']),
	5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()

Mobile.delay(20)

CustomKeywords.'utilities.Deal_Agregator.MarketOrder_FromDropdown'('MYR')


Mobile.delay(20)

CustomKeywords.'utilities.Deal_Agregator.MarketOrder_FromDropdown'('JPY')

Mobile.delay(20)

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText _Amount to Received'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15)

digits2 = '1'

currency_Numpad(digits2)

Mobile.delay(20)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'The minimum amount is JPY1000.00.']),
	5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'The minimum amount is JPY1000.00']),
	5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()

Mobile.delay(20)

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText _Amount to Received'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15)

digits2 = '1000000000'

currency_Numpad(digits2)

Mobile.delay(20)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Reach the max value: JPY10,000,000.00']),
	5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Reach the max value: JPY10,000,000.00']),
	5, FailureHandling.OPTIONAL)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('SOW2-Market Order/CancelButtone_MarketOrder'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(20)




def currency_Numpad(String digits) {
    int digit_length = digits.length()

    for (int i = 0; i < digit_length; i++) {
        if ((digits[i]) == '1') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 1'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '2') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 2'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '3') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 3'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '4') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 4'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '5') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 5'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '6') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 6'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '7') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 7'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '8') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 8'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '9') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 9'), 5, FailureHandling.OPTIONAL)
        } else if ((digits[i]) == '0') {
            Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 0'), 5, FailureHandling.OPTIONAL)
        }
    }
    
    Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.Image'), 5, FailureHandling.OPTIONAL)
}

