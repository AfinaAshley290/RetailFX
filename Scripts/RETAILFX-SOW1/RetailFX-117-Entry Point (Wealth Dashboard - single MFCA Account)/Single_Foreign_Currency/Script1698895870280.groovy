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

'Wait until the Frequency Page load'
Mobile.waitForElementPresent(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the watchlist is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()


'Verify the Watchlist'
Mobile.tap(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait until Watchlist page loaded'
Mobile.waitForElementPresent(findTestObject('Watchlist_Page/android.widget.TextView - Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Watchlist page exist'
Mobile.verifyElementExist(findTestObject('Watchlist_Page/android.widget.TextView - Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Click on the Backbutton'
Mobile.tap(findTestObject('Watchlist_Page/watchlist_back_button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait until Foreign Currency load'
Mobile.waitForElementPresent(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify the Currency Calculator is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Currency Calculator'), 0, FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.tap(findTestObject('Object Repository/Currency_Exchange_Page/Currency Calculator'), 0)*/
'Verify the Rate Alert is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Rate Alert'), 0, FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.tap(findTestObject, 0)*/
'Verify the Order Status is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Order Status'), 0, FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.tap(findTestObject, 0)*/
'Verify Convert Currency is Available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Convert Currency Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)


'Click on the Foreign Account'
Mobile.tap(findTestObject('Currency_Exchange_Page/Currency_AccNo_1', [('text') : findTestData('Username_Password').getValue(
                'Frequecy_Acc_No1', 3)]), 0)
'Wait until Investment Master Foreign Currency Account -i page load'
Mobile.waitForElementPresent(findTestObject('Landing_Page/android.widget.TextView - Investment Master Foreign Currency Account - i'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Landing_Page/android.widget.TextView - Investment Master Foreign Currency Account - i'),
	0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

def text_no = findTestData('Username_Password').getValue('Frequecy_Acc_No1', 3)

println('Account No :' + text_no)

'Verify the Foreign Account no is the same'
Mobile.verifyElementExist(findTestObject('Landing_Page/Account_No', [('text') : findTestData('Username_Password').getValue(
                'Frequecy_Acc_No1', 3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click the X button'
Mobile.tap(findTestObject('Object Repository/Multiple_Frequecy_Account/android.widget.ImageView'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait Foreign Currency load'
Mobile.waitForElementPresent(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Foreign Currency page shows'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Click on Back Buttone'
Mobile.tap(findTestObject('Object Repository/Currency_Exchange_Page/Foreign_currency_backButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait until Wealth page shows'
Mobile.waitForElementPresent(findTestObject('Dashboard_Wealth/Wealth_Page_AccNo', [('text') : findTestData('Username_Password').getValue(
                'Frequecy_Acc_No1', 3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)
'Verify the Wealth page shows'
Mobile.verifyElementExist(findTestObject('Dashboard_Wealth/Wealth_Page_AccNo', [('text') : findTestData('Username_Password').getValue(
	'Frequecy_Acc_No1', 3)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Click on Home Button'
Mobile.tap(findTestObject('General/Home_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

