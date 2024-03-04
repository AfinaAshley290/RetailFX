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

//Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_Button'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_Button01'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_button02'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_button03'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Got_It_Button'), 0)

Mobile.tap(findTestObject('Onboarding_Obj/Agree_Button1'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Onboarding_Obj/Log_In_Now_Button'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Log In Now'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Dashboard_Login/Onboarding_Login/Username'), findTestData('Username_Password').getValue('Username', 
        2), 0)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Yes, Its Mine'), 
    0)

Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Username_Password').getValue(
        'Password', 2), 0)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue (1)'), 0)


Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard_Wealth/Message_PasswordNotMatch'), 5)

Mobile.takeScreenshot()

Mobile.closeApplication('com.maybank2u.life.uat')


