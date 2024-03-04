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

'Go the next Quick Action page'
Mobile.tap(findTestObject('Quick_Action/android.view.ViewGroup'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click on View All icon'
Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - View All'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait until View all page shown'
Mobile.waitForElementPresent(findTestObject('ViewAll_Page/android.widget.TextView - Afina'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the user name is the same'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Afina'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify the Currency Exchange is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Tabung is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Tabung'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Financial Goals is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Financial Goals'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Promotions is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Promotions'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Junior is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Junior'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Sama Sama Lokal is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Sama-Sama Lokal'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Moview & Leisure is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Movies  Leisure'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Kill Switch is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Kill Switch'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Secure2u is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Secure2u'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Tap, Track, Win is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Tap, Track, Win'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Notifications is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Notifications'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Hello Label is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Hello,'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Logout Button is showing'
Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Logout'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click on Currency Exchange'
Mobile.tap(findTestObject('ViewAll_Page/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for Currency Exchange Page to load'
Mobile.waitForElementPresent(findTestObject('Currency_Exchange_Page/android.widget.TextView - Currency Exchange Label'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Currency Exchange Page to load'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/android.widget.TextView - Currency Exchange Label'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify the watchlist is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Currency Calculator is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Currency Calculator'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Rate Alert is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Rate Alert'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Order Status is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Order Status'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Convert Currency is Available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Convert Currency Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify 3 dot button is available'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/android.view.ViewGroup - 3Dot button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click 3 dot button is available'
Mobile.tap(findTestObject('Currency_Exchange_Page/android.view.ViewGroup - 3Dot button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait for Contact Bank pop- up'
Mobile.waitForElementPresent(findTestObject('Currency_Exchange_Page/android.widget.TextView - Contact Bank Link'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Cancel Button is available'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/android.widget.ImageView - Cancel Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Verify the Back Button is available'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/android.view.ViewGroup - Back Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Contact Back Link is available'
Mobile.verifyElementExist(findTestObject('Currency_Exchange_Page/android.widget.TextView - Contact Bank Link'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click on Cancel Button'
Mobile.tap(findTestObject('Currency_Exchange_Page/android.widget.ImageView - Cancel Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click Back Button'
Mobile.tap(findTestObject('Currency_Exchange_Page/Foreign_currency_backButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click Back Button on View All page'
Mobile.tap(findTestObject('ViewAll_Page/android.widget.View_ALL_BackButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Swipe Quick Action to left'
Mobile.tap(findTestObject('Quick_Action/android.view.tap_left'), 0, FailureHandling.CONTINUE_ON_FAILURE)

