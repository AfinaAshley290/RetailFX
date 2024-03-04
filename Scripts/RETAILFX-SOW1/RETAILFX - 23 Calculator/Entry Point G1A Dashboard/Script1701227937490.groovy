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


'Verify the Login button is available'
Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Tap on login button'
Mobile.tap(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

pinNum = '111111'

numpad.enterNumpad(pinNum)

'Wait until UserName shows'
Mobile.waitForElementPresent(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
				'Name', 3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Username is the Onboarding Name'
Mobile.verifyElementExist(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
				'Name', 3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Click on View All Accounts'
Mobile.tap(findTestObject('Dashboard_Login/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait until Account shows'
Mobile.waitForElementPresent(findTestObject('Dashboard_Wealth/android.widget.TextView - ACCOUNTS'), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Tap on G1A Account'
Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.waitForElementPresent(findTestObject('Global Account Page/android.widget.TextView - Accounts'), 20, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Accounts']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify FX tab'
Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'FX']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

CustomKeywords.'utilities.Mobile_Keywords.scrollFromTopToBottom'()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'FX']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Watchlist']), 15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Watchlist']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Calculator']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Rate Alert']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Order Status']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Currency Calculator']), 0, FailureHandling.CONTINUE_ON_FAILURE)



