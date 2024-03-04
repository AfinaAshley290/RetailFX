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

'Tap on the Customise'
Mobile.tap(findTestObject('Object Repository/Mange_Quick_Actions/android.widget.TextView - Customise'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for Manage Quick Actions load'
Mobile.waitForElementPresent(findTestObject('Mange_Quick_Actions/android.widget.TextView - Manage Quick Actions'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Manage Quick Actions page shown'
Mobile.verifyElementExist(findTestObject('Mange_Quick_Actions/android.widget.TextView - Manage Quick Actions'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Mange_Quick_Actions/android.widget.TextView - Simply hold and drag to rearrange the actions'),
	0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Mange_Quick_Actions/android.widget.TextView - Your current favourite actions'),
	0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Mange_Quick_Actions/android.widget.TextView - Save Changes'), 'clickable',
	'false', 0, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

'Remove Pay Bills'
Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.Remove_Image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Swipe down'
Mobile.swipe(271, 1756, 0, 0)

Mobile.takeScreenshot()

'Add Currency Exchange'
Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)


/*CustomKeywords.'utilities.Mobile_Keywords.crollFromBottomToTop'()


'Manage Drag and drop to position'
Mobile.dragAndDrop(findTestObject('Mange_Quick_Actions/android.widget.TextView - Currency Exchange'), findTestObject('Mange_Quick_Actions/android.widget.TextView - Pay Card'),
	0)*/

'Save Changes'
Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.TextView - Save Changes'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify the Currency Frequecy Added'
Mobile.verifyElementExist(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)

