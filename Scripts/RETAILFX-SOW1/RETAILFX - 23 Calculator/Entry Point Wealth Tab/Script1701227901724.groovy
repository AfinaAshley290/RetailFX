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


'Click on View All Accounts'
Mobile.tap(findTestObject('Dashboard_Login/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait until Account shows'
Mobile.waitForElementPresent(findTestObject('Dashboard_Wealth/android.widget.TextView - ACCOUNTS'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Swipe the Menu'
Mobile.swipe(609, 274, 0, 0)

'Tap on Wealth'
Mobile.tap(findTestObject('Object Repository/Dashboard_Wealth/android.widget.TextView - WEALTH'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Dashboard_Wealth/Wealth_Dashboard_ForeignCurrency'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify ForeignCurrency label is visible'
Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard_Wealth/Wealth_Dashboard_ForeignCurrency'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify Wealth Portfolio link visible'
Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard_Wealth/View Wealth Portfolio'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Frequecy Account No is the Same'
Mobile.verifyElementExist(findTestObject('Dashboard_Wealth/Wealth_Page_AccNo', [('text') : findTestData('Username_Password').getValue(
				'Frequecy_Acc_No1', 3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Tap on the ForeignCurrency'
Mobile.tap(findTestObject('Dashboard_Wealth/Wealth_Page_AccNo', [('text') : findTestData('Username_Password').getValue('Frequecy_Acc_No1',
				3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)
