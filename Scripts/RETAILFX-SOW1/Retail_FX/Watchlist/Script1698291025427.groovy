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
import org.apache.commons.lang3.StringUtils as StringUtils

Mobile.startExistingApplication('com.maybank2u.life.uat')

'navigation to watchlist starts'
Mobile.tap(findTestObject('Watchlist/android.widget.TextView - View All Accounts'), 0)

Mobile.waitForElementPresent(findTestObject('Watchlist/android.widget.TextView - ACCOUNTS'), 0)

Mobile.swipe(900, 300, 300, 300)

Mobile.tap(findTestObject('Watchlist/android.widget.TextView - WEALTH'), 0)

Mobile.waitForElementPresent(findTestObject('Watchlist/android.widget.ImageView - First Wealth Tab'), 0)

Mobile.tap(findTestObject('Watchlist/android.widget.ImageView - First Wealth Tab'), 0)

'Watchlist navigation reached'
Mobile.tap(findTestObject('Watchlist/android.widget.TextView - Watchlist'), 0)

Mobile.waitForElementPresent(findTestObject('Watchlist/android.widget.Image - first watchlist tab'), 0)

'Store currency for later use - X path is used here'
currency = Mobile.getText(findTestObject('Watchlist/android.widget.TextView - first watchlist tab currency'), 0)

'screenshot of the watchlist tabs'
Mobile.takeScreenshot()

'Test for contact the bank'
Mobile.tap(findTestObject('Watchlist/android.widget.Image - watchlist 3 dot btn'), 0)

Mobile.tap(findTestObject('Watchlist/android.view.View - Contact Bank - Watchlist'), 0)

WebUI.callTestCase(findTestCase('RETAILFX-SOW1/RetailFX-Watchlist/Watchlist - Contact the bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'X path is used here'
Mobile.tap(findTestObject('Watchlist/android.widget.Image - first watchlist tab'), 0)

'Validate that the header Chart & News '
news_header = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - Chart  News'), 0)

Mobile.verifyMatch(news_header, 'Chart & News', false)

'Validate the currency is the same as the outer currency - X path used here'
displayed_cur = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - Currency'), 0)

Mobile.verifyMatch(displayed_cur, currency, false)

'Validate the latest news label'
latest_news_label = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - Latest News'), 
    0)

Mobile.verifyMatch(latest_news_label, 'Latest News', false)

'Validate the view all news label'
view_all_news_label = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - View All News'), 
    0)

Mobile.verifyMatch(view_all_news_label, 'View All News', false)

'Verify first news tab exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Watchlist/android.view.View - First news tab'), 0)

'Verify news header not empty'
news_header = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - First news tab content'), 
    0)

Mobile.verifyNotEqual(news_header, '', FailureHandling.CONTINUE_ON_FAILURE)

'Verify timestamp not empty'
news_timestamp = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - First news tab time'), 
    0)

Mobile.verifyNotMatch(news_timestamp, '', false)

'Test for contact the bank'
Mobile.tap(findTestObject('Watchlist/android.widget.Image - Chart n News 3 dot btn'), 0)

Mobile.tap(findTestObject('Watchlist/android.view.View - Contact Bank - Chart n News'), 0)

WebUI.callTestCase(findTestCase('RETAILFX-SOW1/RetailFX-Watchlist/Watchlist - Contact the bank'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'screenshot of the news tabs'
Mobile.takeScreenshot()

search_keyword = news_header.substring(0, 7)

Mobile.tap(findTestObject('Watchlist/android.widget.TextView - First news tab content'), 0)

'verify full news timestamp not empty'
full_news_timestamp = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - full news timestamp'), 
    0)

Mobile.verifyNotMatch(full_news_timestamp, '', false)

'verify the header matches the header in the previous page'
full_news_header = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - full news header'), 
    0)

Mobile.verifyMatch(full_news_header, news_header, false)

'verify that the full news content line 1 is not empty'
full_news_content_l1 = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - full news content line 1'), 
    0)

Mobile.verifyNotMatch('full_news_content_l1', '', false)

'Screenshot of the search full news page'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist/android.widget.Image - full news x btn'), 0)

Mobile.tap(findTestObject('Watchlist/android.widget.TextView - View All News'), 0)

'Enter the search keyword X path used here'
Mobile.setText(findTestObject('Object Repository/Watchlist/android.widget.EditText - Search text field'), search_keyword, 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Watchlist/android.view.View - searched news tab 1'), 0)

'Verify news header not empty'
news_header = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - First News tab header in search'), 
    0)

Mobile.verifyNotMatch(news_header, '', false)

'Verify search news timestamp not empty'
news_timestamp = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - First News tab timestamp in search'), 
    0)

Mobile.verifyNotMatch(news_timestamp, '', false)

'Screenshot of the search news page'
Mobile.takeScreenshot()

'open up full news'
Mobile.tap(findTestObject('Watchlist/android.widget.TextView - First News tab header in search'), 0)

'verify full news timestamp not empty'
full_news_timestamp = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - full news timestamp'), 
    0)

Mobile.verifyNotMatch(full_news_timestamp, '', false)

'verify the header matches the header in the previous page'
full_news_header = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - full news header'), 
    0)

Mobile.verifyMatch(full_news_header, news_header, false)

'verify that the full news content line 1 is not empty'
full_news_content_l1 = Mobile.getText(findTestObject('Object Repository/Watchlist/android.widget.TextView - full news content line 1'), 
    0)

Mobile.verifyNotMatch('full_news_content_l1', '', false)

'Screenshot of the search full news page'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Watchlist/android.widget.Image - full news x btn'), 0)

Mobile.closeApplication()

