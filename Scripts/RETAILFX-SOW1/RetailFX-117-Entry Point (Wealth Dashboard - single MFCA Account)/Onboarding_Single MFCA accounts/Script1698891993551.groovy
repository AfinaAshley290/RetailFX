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
import retailfx.OTP as OTP
import retailfx.Validation as Validation
import utilities.Mobile_Keywords as Utility



Mobile.startExistingApplication('com.maybank2u.life.uat')



Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_Button01'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_button02'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_button03'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Got_It_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Onboarding_Obj/Agree_Button1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Onboarding_Obj/Log_In_Now_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Log In Now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard_Login/Onboarding_Login/Username'), findTestData('Username_Password').getValue('Username', 
        3), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Yes, Its Mine'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Username_Password').getValue(
        'Password', 3), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

checkLinkedDevice = Validation.checkElementExists('Object Repository/Onboarding_Obj/android.widget.TextView - Your Maybank2u ID is already linked to the following device')

if (checkLinkedDevice == true) {
	
	'Verify is in Manage Device page'
	Mobile.verifyElementExist(findTestObject('Object Repository/Onboarding_Obj/Proceed_Button'),
		0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'Manage Devices page'
	Mobile.takeScreenshot()

	'Tap on proceed button'
	Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Proceed_Button'), 10, FailureHandling.CONTINUE_ON_FAILURE)
} else {
	FailureHandling.CONTINUE_ON_FAILURE
}


Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Your PIN no. is 111111'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.ImageView'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Your PIN no. is 111111'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.ImageView'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Set Up Later'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Yes, Proceed'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

def OTP_TextMsg = Mobile.getText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - OTP'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

OTP_TextMsg = OTP_TextMsg.replace('Your OTP no. is ', '')

def otpArr2 = OTP_TextMsg.toCharArray()

OTP.enterOTP(OTP_TextMsg)

Mobile.tap(findTestObject('OTP_Number/Enter_Image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.EditText - Enter your name'), 
    'Afina', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

println('the account number: ' + findTestData('Username_Password').getValue('Account_Number', 1))

def Acc_Number = findTestData('Username_Password').getValue('Account_Number', 3)

Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/GetCurrency', [('text') : Acc_Number]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Skip'), 0, FailureHandling.CONTINUE_ON_FAILURE)

/*Secure2u setup */

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Activate Secure2u'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Activate Now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Your OTP no. is 235719'), 0)
def OTP_TextMsg2 = Mobile.getText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - OTP'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

OTP_TextMsg2 = OTP_TextMsg2.replace('Your OTP no. is ', '')

OTP.enterOTP(OTP_TextMsg2)

Mobile.tap(findTestObject('Onboarding_secure2u/Check_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Onboarding_secure2u/android.widget.EditText - Your ID number'), findTestData('Username_Password').getValue(
        'IC_Number', 3), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/device_name_continue_button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)
