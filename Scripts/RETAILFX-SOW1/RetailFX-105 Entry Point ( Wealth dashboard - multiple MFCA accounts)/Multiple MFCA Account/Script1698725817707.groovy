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
import org.openqa.selenium.Keys as Keys
import retailfx.Validation as Validation

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.takeScreenshot()

'Wait for homepage to show'
Mobile.waitForElementPresent(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Take a Screenshot'
Mobile.takeScreenshot()
'Tap Login'
Mobile.tap(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0)


pinNum = '111111'

numpad.enterNumpad(pinNum)



'wait until homepage load'
Mobile.waitForElementPresent(findTestObject('Dashboard_Login/android.widget.TextView - View All Accounts'), 0)

'Verify the Username is the Onboarding Name'
Mobile.verifyElementExist(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
				'Name', 1)]), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Dashboard_Login/android.widget.TextView - View All Accounts'), 0)

checkLinkedDevice = Validation.checkElementExists('Object Repository/Global Account Page/android.widget.TextView - Kill Switch')

if (checkLinkedDevice == true) {
	'Verify is in Manage Device page'
	Mobile.verifyElementExist(findTestObject('Object Repository/Global Account Page/android.widget.TextView - Kill Switch'), 0, FailureHandling.CONTINUE_ON_FAILURE)

	'Manage Devices page'
	Mobile.takeScreenshot()

	'Tap on proceed button'
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Got It']), 10, FailureHandling.CONTINUE_ON_FAILURE)
} else {
	FailureHandling.CONTINUE_ON_FAILURE
}

'Wait for Account Page to load'
Mobile.waitForElementPresent(findTestObject('Dashboard_Wealth/android.widget.TextView - ACCOUNTS'), 0)

Mobile.verifyElementExist(findTestObject('Dashboard_Wealth/android.widget.TextView - ACCOUNTS'), 0)

Mobile.takeScreenshot()

'Swipe the Menu'
Mobile.swipe(609, 274, 0, 0)

'Tap on Wealth'
Mobile.tap(findTestObject('Object Repository/Dashboard_Wealth/android.widget.TextView - WEALTH'), 0)

'Wait until page load'
Mobile.waitForElementPresent(findTestObject('Object Repository/Dashboard_Wealth/Wealth_Dashboard_ForeignCurrency'), 0)


'Verify ForeignCurrency account'
Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard_Wealth/Wealth_Dashboard_ForeignCurrency'), 0)



'Verify Wealth Portfolio'
Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard_Wealth/View Wealth Portfolio'), 0)
'Verify There are two accounts'
Mobile.verifyElementExist(findTestObject('Dashboard_Wealth/android.widget.TextView - No. of accounts 2'), 0)

'TakeScreenshot'
Mobile.takeScreenshot()

'Tap on the Account'
Mobile.tap(findTestObject('Object Repository/Dashboard_Wealth/Wealth_Dashboard_ForeignCurrency'), 0)

