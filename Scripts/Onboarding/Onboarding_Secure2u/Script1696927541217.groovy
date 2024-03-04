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

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Activate Secure2u'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Activate Now'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Confirm'), 0)

//Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Your OTP no. is 235719'), 0)
def OTP_TextMsg = Mobile.getText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - OTP'), 
    0)

OTP_TextMsg = OTP_TextMsg.replace('Your OTP no. is ', '')

def otpArr2 = OTP_TextMsg.toCharArray()

for (def i = 0; i < OTP_TextMsg.length(); i++) {
    if ((otpArr2[i]) == '1') {
        Mobile.tap(findTestObject('OTP_Number/Button_1'), 0)
    } else if ((otpArr2[i]) == '2') {
        Mobile.tap(findTestObject('OTP_Number/Button_2'), 0)
    } else if ((otpArr2[i]) == '3') {
        Mobile.tap(findTestObject('OTP_Number/Button_3'), 0)
    } else if ((otpArr2[i]) == '4') {
        Mobile.tap(findTestObject('OTP_Number/Button_4'), 0)
    } else if ((otpArr2[i]) == '5') {
        Mobile.tap(findTestObject('OTP_Number/Button_5'), 0)
    } else if ((otpArr2[i]) == '6') {
        Mobile.tap(findTestObject('OTP_Number/Button_6'), 0)
    } else if ((otpArr2[i]) == '7') {
        Mobile.tap(findTestObject('OTP_Number/Button_7'), 0)
    } else if ((otpArr2[i]) == '8') {
        Mobile.tap(findTestObject('OTP_Number/Button_8'), 0)
    } else if ((otpArr2[i]) == '9') {
        Mobile.tap(findTestObject('OTP_Number/Button_9'), 0)
    } else if ((otpArr2[i]) == '0') {
        Mobile.tap(findTestObject('OTP_Number/Button_0'), 0)
    }
}

Mobile.tap(findTestObject('Onboarding_secure2u/Check_Button'), 0)

Mobile.setText(findTestObject('Onboarding_secure2u/android.widget.EditText - Your ID number'), findTestData('Username_Password').getValue(
        'IC_Number', 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Continue'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Done'), 0)

Mobile.closeApplication()

