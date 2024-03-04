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

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 1 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 1 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Enter 0.01 Currency'
Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.EditText - 0.00'), 0)

Mobile.delay(5)

//CustomKeywords.'utilities.Market_Order.Currency_Numpad'(pinNum)
digits = '5000'

int digit_length = digits.length()

for (int i = 0; i < digit_length; i++) {
    if ((digits[i]) == '1') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 1'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '2') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 2'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '3') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 3'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '4') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 4'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '5') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 5'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '6') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 6'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '7') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 7'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '8') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 8'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '9') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 9'), 0, FailureHandling.OPTIONAL)
    } else if ((digits[i]) == '0') {
        Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 0'), 0, FailureHandling.OPTIONAL)
    }
}

Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.Image'), 0)

'Verify Select Currency Page'
Mobile.tap(findTestObject('SOW2-Market Order/Select_Currency Dropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('SOW2-Market Order/android.view.View - Select Currency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/android.view.View - Select Currency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText_SearchCurrency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('SOW2-Market Order/android.widget.EditText_SearchCurrency'), 'GBP', 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP - British Pound Sterling']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP - British Pound Sterling']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('SOW2-Market Order/DynamicButton', [('text') : 'Next']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Account Selection'

'Verify Step 2 of 2 page'
Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Account Selection Page'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Check the USD/MYR'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP/MYR']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Im coverting label'
Mobile.verifyElementExist(findTestObject('SOW2-Market Order/android.widget.TextView - Im converting'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify MYR'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR 50.00']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer to']), 5, FailureHandling.CONTINUE_ON_FAILURE)

int PositionY = Mobile.getElementHeight(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (MYR)']), 5, FailureHandling.STOP_ON_FAILURE)

println ('Global Access Account-i (MYR)' + PositionY)

'Verify Account Transfer From'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (MYR)']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '900000021160']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(450, 884, 0, 884, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Current Account-i (MYR)']), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '564017148767']), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(450, 884, 0, 884, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Saving Account (MYR)']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '114013997724']), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Transfer To'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Global Access Account-i (GBP)']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '900000021160']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Terms and Condition'
Mobile.verifyElementExist(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - Terms  Conditions'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - Kindly read the'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - BNM Foreign Exchange Rules'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - Terms and Conditions'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - , the'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView -  for this transfer before proceeding'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView -  and the'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - Terms and Conditions'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'BNM Foreign Exchange Rules'
Mobile.tap(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - BNM Foreign Exchange Rules'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'BNM Foreign Exchange Rules']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'BNM Foreign Exchange Rules']), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.ImageView_BNMBackButton'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Terms and Conditions'
Mobile.tap(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - Terms and Conditions'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Terms and Conditions']), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Terms and Conditions']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.ImageView_BackButtonTermandCondition'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'Declaration'
Mobile.tap(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.TextView - declaration'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Declaration']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Declaration']), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('SOW2-Market Order/Term_And_Condition/android.widget.ImageView_BackButtonDeclaration'), 5, FailureHandling.CONTINUE_ON_FAILURE)

