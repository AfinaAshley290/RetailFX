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

'Click on Watchlist Button'
Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Currency_Pair = Mobile.getText(findTestObject('Watchlist_Page/android.widget.TextView - AUDMYR (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click on Chart for AUD/MYR pair'
Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.Image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait until Chart & News page open'
Mobile.waitForElementPresent(findTestObject('Watchlist_Chart/android.widget.TextView - AUDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Currency_Pair_Header = Mobile.getText(findTestObject('Watchlist_Chart/android.widget.TextView - AUDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Currency header match with the Currency pair we choose'
Mobile.verifyMatch(Currency_Pair_Header, Currency_Pair, false)

'Take a Screenshot'
Mobile.takeScreenshot()

'Tap on 1D'
Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 1 D'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 1 W'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 1 M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 3 M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 6 M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 1 Y'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

'Change the Chart View'
Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.Image (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Tap on 1D'
Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 1 D'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 1 W'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 1 M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 3 M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 6 M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - 1 Y'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

'Change the Chart to previous image'
Mobile.tap(findTestObject('Watchlist_Chart/android.widget.Image (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take a Screenshot'
Mobile.takeScreenshot()

Chart = Mobile.getText(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - Chart'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Chart_News = Mobile.getText(findTestObject('Object Repository/Watchlist_Chart/android.widget.TextView - Chart  News'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Chart Header is visible'
Mobile.verifyMatch(Chart, 'Chart', false, FailureHandling.CONTINUE_ON_FAILURE)

'Verify the Chart Header is visible'
Mobile.verifyMatch(Chart_News, 'Chart & News', false, FailureHandling.CONTINUE_ON_FAILURE)

'Test for contact the bank'
Mobile.tap(findTestObject('Watchlist/android.widget.Image - watchlist 3 dot btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Watchlist/android.view.View - Contact Bank - Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('RETAILFX-SOW1/RetailFX-Watchlist/Watchlist - Contact the bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Watchlist_Chart/android.widget.Back_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Watchlist_Chart/android.widget.Back_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.closeApplication()

