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
import utilities.Mobile_Keywords as Mobile_Keywords
import org.openqa.selenium.Keys as Keys

'Tap on Watchlist Button'
Mobile.tap(findTestObject('Object Repository/RetailFX-31/android.widget.TextView - Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for Watchlist page to Load'
Mobile.waitForElementPresent(findTestObject('RetailFX-31/android.widget.TextView - Watchlist (1)'), 20, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Tap on Recommend Watchlist'
Mobile.tap(findTestObject('Watchlist_Remove/android.widget.Image_watchlistDropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Scroll tp Watchlist 2'
Mobile.scrollToText('Watchlist 2')

'Tap on Watchlist 2'
Mobile.tap(findTestObject('Object Repository/RetailFX-31/android.widget.TextView - Watchlist 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Tap done Button'
Mobile.tap(findTestObject('Object Repository/RetailFX-31/android.widget.Button - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for Watchlist 2 load'
Mobile.waitForElementPresent(findTestObject('RetailFX-31/android.widget.TextView - Watchlist 2 (1)'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the page is Watchlist 2'
Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.TextView - Watchlist 2 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Tap edit link'
Mobile.tap(findTestObject('Object Repository/RetailFX-31/android.widget.TextView - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for Edit page load'
Mobile.waitForElementPresent(findTestObject('RetailFX-31/android.widget.TextView - Edit Watchlist'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Edit Page'
Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.TextView - Edit Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Currency_pair = Mobile.getText(findTestObject('RetailFX-31/android.widget.TextView - First_Currency_Pair'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Remove the Currency Pair on the First Row'
Mobile.tap(findTestObject('RetailFX-31/android.widget.TextView - GetCurrencyRemoveButtonByIndex', [('index') : '1']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Click Update button'
Mobile.tap(findTestObject('RetailFX-31/android.widget.Button - Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify for the Youve successfully update Watchlist 2 to show'
Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.TextView - Youve successfully updated Watchlist 2'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify the Currency Pair is deleted'
Mobile.verifyElementNotExist(findTestObject('RetailFX-31/android.widget.TextView - VerifyText', [('text') : ('\'' + Currency_pair) + 
            '\'']), 15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Tap edit link'
Mobile.tap(findTestObject('Object Repository/RetailFX-31/android.widget.TextView - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('RetailFX-31/android.widget.TextView - Edit Watchlist'), 15, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Edit Page'
Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.TextView - Edit Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('RetailFX-31/android.widgetBackButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for Watchlist 2 load'
Mobile.waitForElementPresent(findTestObject('RetailFX-31/android.widget.TextView - Watchlist 2 (1)'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the page is Watchlist 2'
Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.TextView - Watchlist 2 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Tap edit link'
Mobile.tap(findTestObject('Object Repository/RetailFX-31/android.widget.TextView - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('RetailFX-31/android.widget.TextView - Edit Watchlist'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Edit Page'
Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.TextView - Edit Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Set Text to Test 123243545 '
Mobile.setText(findTestObject('Object Repository/Test/android.widget.EditText - Watchlist 2'), 'Test 12345463', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('RetailFX-31/android.widget.Button - Reset To Default Name'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Test/android.widget.EditText - Watchlist 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Update Button is not clickable'
Mobile.verifyElementAttributeValue(findTestObject('RetailFX-31/android.widget.Button - Update'), 'enabled', 'false', 0, FailureHandling.CONTINUE_ON_FAILURE)

Currency_pair_1 = Mobile.getText(findTestObject('RetailFX-31/android.widget.TextView - First_Currency_Pair'), 0, FailureHandling.CONTINUE_ON_FAILURE)

println(Currency_pair_1)

'Remove the Currency Pair on the First Row'
Mobile.tap(findTestObject('RetailFX-31/android.widget.TextView - GetCurrencyRemoveButtonByIndex', [('index') : '1']), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Update Button is clickable'
Mobile.verifyElementAttributeValue(findTestObject('RetailFX-31/android.widget.Button - Update'), 'enabled', 'true', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Tap Back buttone'
Mobile.tap(findTestObject('RetailFX-31/android.widgetBackButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('RetailFX-31/android.view.View - Are you sure you want to exit this page'), 
    20, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('RetailFX-31/android.view.View - Are you sure you want to exit this page'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.TextView - Your changes will not be saved'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.Button - Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('RetailFX-31/android.widget.Button - Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify for the Youve successfully update Watchlist 2 to show'
Mobile.verifyElementNotExist(findTestObject('RetailFX-31/android.widget.TextView - Youve successfully updated Watchlist 2'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify the Currency Pair is deleted'
Mobile.verifyElementExist(findTestObject('RetailFX-31/android.widget.TextView - VerifyText', [('text') : ('\'' + Currency_pair_1) + 
            '\'']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.closeApplication()

