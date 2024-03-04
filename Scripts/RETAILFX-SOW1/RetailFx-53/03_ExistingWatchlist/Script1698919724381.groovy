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

//Mobile.startExistingApplication('com.maybank2u.life.uat')

'User taps on Edit button'
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/25_UserClickOn- Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after clicking edit button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/01_UserTapsOnEditButton')

Mobile.takeScreenshot()

'User taps on Add currency pair '
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/26_UserTapsOnCurrencypairAdd- Select Currency Pairs'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after clicking Add currency Pair'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/02_UserTapsOnCurrencyPair')

Mobile.takeScreenshot()

'User taps on AED/MYR radio icon '
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/27_UserTapOn - AEDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting AED/MYR radio button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/03_UserSelects_AED/MYR')

Mobile.takeScreenshot()

'User taps on AUD/MYR radio icon '
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/28_UserTapOn- AUDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting AUD/MYR radio button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/04_UserSelects_AUD/MYR')

Mobile.takeScreenshot()

'User taps on BND/MYR radio icon '
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/29_UserTapOn - BNDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting BND/MYR radio button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/05_UserSelects_BND/MYR')

Mobile.takeScreenshot()

'User taps on CAD/MYR radio icon '
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/30_UserTapOn- CADMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting CAD/MYR radio button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/06_UserSelects_CAD/MYR')

Mobile.takeScreenshot()

'User taps on CHF/MYR radio icon '
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/31_UserTapOn- CHFMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting CHF/MYR radio button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/07_UserSelects_CHF/MYR')

Mobile.takeScreenshot()

'User taps on CNY/MYR radio icon '
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/32_UserTapOn - CNYMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting CNY/MYR radio button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/08_UserSelects_CNY/MYR')

Mobile.takeScreenshot()

'User taps on DKK/MYR radio icon '
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/33_UserTapOn - DKKMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting DKK/MYR radio button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/09_UserSelects_DKK/MYR')

Mobile.takeScreenshot()

'User scrolls the screen '
Mobile.scrollToText('GBP/MYR')

'Take Screenshot after scrolling the screen'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/10_UserScrollsDownTheScreen')

Mobile.takeScreenshot()

'User taps on 11th item on radio button'
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/34_ReachedMaximumLimitOnTap - HKDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(5)

'Take screenshot for the error displayed when the 11th item is selected'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/11_UserSelects_HKD/MYR')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/35_UserTapsOn- Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after tapping on Done'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/12_UserTapsOn_Done')

Mobile.takeScreenshot()

'User taps on update button'
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/36_UserTapOnUpdate- Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after user taps on Update'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/13_UserTapsOn_Update')

Mobile.takeScreenshot()

'User taps on Edit'
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/37_UserTapOn - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after tapping Edit button'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/14_UserTapsOn_Edit')

Mobile.takeScreenshot()

'User clears the Watchlist 1 text'
Mobile.clearText(findTestObject('Object Repository/03_ExistingWatchList/38_ClearText - Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'User tales screenshot after deleting the text'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/15_UserClearsTheText_Watchlist_1')

Mobile.takeScreenshot()

'User sets the text as Wat 1'
Mobile.setText(findTestObject('Object Repository/03_ExistingWatchList/39_SetText'), 'Wat 1', 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after setting the text to Wat 1'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/16_UserClearsTheText_Wat_1')

Mobile.takeScreenshot()

'User taps on Update button'
Mobile.tap(findTestObject('Object Repository/03_ExistingWatchList/android.widget.Button - Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after update button is clicked'
Mobile.takeScreenshot('Screenshots/03_ExistingWatchlist/17_UserTapsOnUpdateButton')

Mobile.takeScreenshot()

