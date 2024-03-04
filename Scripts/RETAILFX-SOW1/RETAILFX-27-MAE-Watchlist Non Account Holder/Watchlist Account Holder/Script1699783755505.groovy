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
Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0)

Mobile.takeScreenshot()

'Tap on login button'
Mobile.tap(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0)

pinNum = '111111'

numpad.enterNumpad(pinNum)

'Wait until UserName shows'
Mobile.waitForElementPresent(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
                'Name', 3)]), 0)

'Verify the Username is the Onboarding Name'
Mobile.verifyElementExist(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
                'Name', 3)]), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Quick_Action/android.view.ViewGroup'), 0)

'Click on View All icon'
Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - View All'), 0)

'Wait until page is load'
Mobile.waitForElementPresent(findTestObject('ViewAll_Page/android.widget.TextView - Currency Exchange'), 0)

'Verify Currency Page'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Currency Exchange'), 0)

Mobile.takeScreenshot()

'Click on Currency Exchange'
Mobile.tap(findTestObject('ViewAll_Page/android.widget.TextView - Currency Exchange'), 0)

'Verify Watchlist Button Available'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/Watchlist'), 0)

'Verify Currency Calculator Available'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/Currency Calculator'), 0)

Mobile.takeScreenshot()

'Click Watchlist Button'
Mobile.tap(findTestObject('Currency_Exchange_Page/Watchlist'), 0)

Mobile.verifyElementExist(findTestObject('Watchlist/android.widget.TextView - Watchlist'), 0)

Mobile.verifyElementExist(findTestObject('Watchlist/android.widget.TextView - Dropdown Watchlist'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - AUDMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - EURMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - GBPMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - JPYMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - SGDMYR'), 0)

Mobile.takeScreenshot()

Mobile.swipe(233, 1339, 0, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - USDMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - AUDUSD'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - GBPUSD'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - USDJPY'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - USDSGD'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - Disclaimer The rates quoted are real-time and indicative only and subject to change without notice at our sole discretion'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Watchlist/android.widget.Image - watchlist 3 dot btn'), 0)

Mobile.tap(findTestObject('Watchlist/android.view.View - Contact Bank - Watchlist'), 0)

WebUI.callTestCase(findTestCase('RETAILFX-SOW1/RetailFX-Watchlist/Watchlist - Contact the bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)

