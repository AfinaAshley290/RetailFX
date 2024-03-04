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


'VerifyElementText when user is on Currency Exchange screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-30/01_VerifyElementText - Currency Exchange'), 'Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is on Currency Exchange screen'
Mobile.takeScreenshot('Screenshots/RetailFx-30/01_UserOn_CurrencyExchangeScreen')

Mobile.takeScreenshot()

'User taps on Watchlist'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/02_UserTapOnWatchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is navigated to Watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-30/03_VerifyElementText - Watchlist'), 'Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is on Watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFx-30/02_UserNavigatedTo_Watchlist_creen')

Mobile.takeScreenshot()

'User taps on watchlist dropdown'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/04_UserTapOnWatchlistDropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when watchlist dropdown is appeared'
Mobile.takeScreenshot('Screenshots/RetailFx-30/03_UserTapsOn_WatchlistDropdown')

Mobile.takeScreenshot()

'User selects Watchlist 1 from the dropdown'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/05_UserSelects - Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user selects Watchlist 1 from the dropdown'
Mobile.takeScreenshot('Screenshots/RetailFx-30/04_UserSelects_Watchlist_1')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/06_UserTapsOn - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user changes the watchlist to Watchlist 1'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-30/07_verifyElementText - Watchlist 1'), 'Watchlist 1', FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot when user is on Watchlist 1'
Mobile.takeScreenshot('Screenshots/RetailFx-30/05_Watchlist_1_Selected')

Mobile.takeScreenshot()

'User taps on Edit button for watchlist '
Mobile.tap(findTestObject('Object Repository/RetailFx-30/08_UserTapOnWatchlistEdit - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is on Edit Watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-30/09_VerifyElementText - Edit Watchlist'), 'Edit Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is on Edit Watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFx-30/06_UserIsOn_EditWatchlist_Screen')

Mobile.takeScreenshot()

'User taps on Select currency pair'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/10_UserTapsOn - Select Currency Pairs'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is on Select currency pair screen'
Mobile.takeScreenshot('Screenshots/RetailFx-30/07_UserIsOn_CurrencyPairs_Screen')

Mobile.takeScreenshot()

'User selects CAD/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/11_UserSelects - CADMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after user selects CAD/MYR'
Mobile.takeScreenshot('Screenshots/RetailFx-30/08_UserSelects_CAD/MYR')

Mobile.takeScreenshot()

'User selects CHF/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/12_UserSelects - CHFMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot afetr user selects CHF/MYR'
Mobile.takeScreenshot('Screenshots/RetailFx-30/09_UserSelects_CHF/MYR')

Mobile.takeScreenshot()

'User selects CNY/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/13_UserSelects - CNYMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot after user selects CNY/MYR'
Mobile.takeScreenshot('Screenshots/RetailFx-30/10_UserSelects_CNY/MYR')

Mobile.takeScreenshot()

'User selects DKK/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/14_UserSelects - DKKMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot after user selects DKK/MYR'
Mobile.takeScreenshot('Screenshots/RetailFx-30/11_UserSelects_DKK/MYR')

Mobile.takeScreenshot()

'User scrolls down the list'
Mobile.scrollToText('JPY/MYR')

'Take Screenshot when user scrolls down the screen'
Mobile.takeScreenshot('Screenshots/RetailFx-30/12_UserScrollScreen')

Mobile.takeScreenshot()

'User selects JPY/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/15-UserSelects - JPYMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take scfreenshot after user selects JPY/MYR'
Mobile.takeScreenshot('Screenshots/RetailFx-30/13_UserSelects_JPY/MYR')

Mobile.takeScreenshot()

'User selects NOK/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/16_UserSelects - NOKMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot after user selects NOK/MYR'
Mobile.takeScreenshot('Screenshots/RetailFx-30/14_UserSelects_NOK/MYR')

Mobile.takeScreenshot()

'User selects NZD/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/17_UserSelects - NZDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot when user selects NZD/MYR'
Mobile.takeScreenshot('Screenshots/RetailFx-30/15_UserSelects_NZD/MYR')

Mobile.takeScreenshot()

'User selects 11th item as QAR/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/18_UserSelects11th_item - QARMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'An error appears at the bottom of the screen restricting user from selecting more than 10 items'
Mobile.takeScreenshot('Screenshots/RetailFx-30/16_ErrorDisplaysUponSelecting_11_items')

Mobile.takeScreenshot()

Mobile.delay(4)

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/19_UserTapsOn - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is navigated back to Edit Watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-30/20_VerifyElementText - Edit Watchlist'), 'Edit Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is on Edit Watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFx-30/17_UserNavigatedTo_EditWatchlist')

Mobile.takeScreenshot()

'Drag and move the currency pair position'
Mobile.dragAndDrop(findTestObject('dragAndDrop/01_Drag_android.widget.Image'), findTestObject('dragAndDrop/02_Drop_android.widget.Image'), 
    10, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after successfully changing the order of the currency pair'
Mobile.takeScreenshot('Screenshots/RetailFx-30/18_UserDragsAndChangeThePositionOfCurrencyPairInTheList')

Mobile.takeScreenshot()

'User taps on Update'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/23_UserTapsOn - Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Successful update message appears on the footer of the screen'
Mobile.takeScreenshot('Screenshots/RetailFx-30/19_SuccessfulUpdateMessageDisplayedOnFooter')

Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/RetailFx-30/24_UserTapsOnBackButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is on Currency Exchange screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-30/25_VerifyElementText- Currency Exchange'), 'Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is on Currency Exchange screen'
Mobile.takeScreenshot('Screenshots/RetailFx-30/20_UserNavigatedToCurrencyExchangeScreen')

Mobile.takeScreenshot()

