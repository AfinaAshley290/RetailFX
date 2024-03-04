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
import retailfx.numpad as numpad

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.tap(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

pinNum = '111111'

numpad.enterNumpad(pinNum)

/*Go to Welth Dashboar*/
'Wait until UserName shows'
Mobile.waitForElementPresent(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
                'Name', 3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Username is the Onboarding Name'
Mobile.verifyElementExist(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
                'Name', 3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Go the next Quick Action page'
Mobile.tap(findTestObject('Quick_Action/android.view.Swipe_Left'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click on View All icon'
Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - View All'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click on Currency Exchange'
Mobile.tap(findTestObject('ViewAll_Page/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Session_Expire/android.widget.TextView - Session Expired'), 300, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session_Expire/android.widget.TextView - Session Expired'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session_Expire/android.widget.TextView - Looks like youve been inactive for 5 minutes. To continue, please login again'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session_Expire/android.widget.TextView - Log In Now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Session_Expire/android.widget.X_button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

