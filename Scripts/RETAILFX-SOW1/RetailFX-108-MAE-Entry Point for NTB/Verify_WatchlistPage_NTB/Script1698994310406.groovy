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
Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0)

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

'Click on View All Accounts'
Mobile.tap(findTestObject('Dashboard_Login/android.widget.TextView - View All Accounts'), 0)

'Wait until Account shows'
Mobile.waitForElementPresent(findTestObject('Dashboard_Wealth/android.widget.TextView - ACCOUNTS'), 0)

Mobile.takeScreenshot()

'Swipe the Menu'
Mobile.swipe(609, 274, 0, 0)

'Tap on Wealth'
Mobile.tap(findTestObject('Object Repository/Dashboard_Wealth/android.widget.TextView - WEALTH'), 0)

'Verify ForeignCurrency label is visible'
Mobile.verifyElementNotExist(findTestObject('Object Repository/Dashboard_Wealth/Wealth_Dashboard_ForeignCurrency'), 0)

Mobile.takeScreenshot()

'Click on Home Button'
Mobile.tap(findTestObject('General/Home_Button'), 0)

'Go the next Quick Action page'
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

'Verify No Account Available'
Mobile.waitForElementPresent(findTestObject('NTB_TEST CASE/android.widget.TextView - No Account Available'), 0)

'Verify Buy and Sell foreign currencies seamlessly online with a Global Access Account-i. Apply for an account now'
Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - Buy and Sell foreign currencies seamlessly online with a Global Access Account-i. Apply for an account now'), 
    0)

'Verify Watchlist Button Available'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/Watchlist'), 0)

'Verify Currency Calculator Available'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/Currency Calculator'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - Apply Now'), 0)

Mobile.takeScreenshot()

'Click Currency Exchange'
Mobile.tap(findTestObject('Currency_Exchange_Page/Watchlist'), 0)

/*Verify Watchlist Page*/
Mobile.waitForElementPresent(findTestObject('NTB_TEST CASE/android.widget.TextView - Recommended Watchlist'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - Recommended Watchlist'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - Global Access Account-i'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - Apply for a Global Access'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - Account-i to unlock the'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - full watchlist features'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - AUDMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - AUDUSD'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - EURMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - GBPMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - GBPUSD'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - JPYMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - SGDMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - USDMYR'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - AUDMYR'), 0)

Mobile.takeScreenshot()

'Tap on on of the Currency Pair'
Mobile.tap(findTestObject('NTB_TEST CASE/android.widget.EurMyrChartButton'), 0)

'Verify Pop up Apply For Account'
Mobile.waitForElementPresent(findTestObject('NTB_TEST CASE/android.view.View - You need an account to continue'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.view.View - You need an account to continue'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - You need a multi-currency account to edit watchlists. Apply for a Global Access Account-i today'), 
    0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.Button - Apply For Account'), 0)

Mobile.takeScreenshot()

'Tap on Apply For Account'
Mobile.tap(findTestObject('NTB_TEST CASE/android.widget.Button - Apply For Account'), 0)

Mobile.waitForElementPresent(findTestObject('NTB_TEST CASE/android.widget.TextView - Recommended Watchlist'), 0)

Mobile.verifyElementExist(findTestObject('NTB_TEST CASE/android.widget.TextView - Recommended Watchlist'), 0)

Mobile.tap(findTestObject('Watchlist/android.widget.Image - watchlist 3 dot btn'), 0)

Mobile.tap(findTestObject('Watchlist/android.view.View - Contact Bank - Watchlist'), 0)

WebUI.callTestCase(findTestCase('RETAILFX-SOW1/RetailFX-Watchlist/Watchlist - Contact the bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)

