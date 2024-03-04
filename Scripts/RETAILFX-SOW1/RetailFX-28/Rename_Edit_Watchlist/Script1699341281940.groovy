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
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/01_VerifyElementText - Currency Exchange'), 'Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)


'Take Screenshot when user is on Currency Exchange screen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/01_UserOn_CurrencyExchangeScreen')

Mobile.takeScreenshot()

'User Taps on Watchlist'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/02_UserTapOn_Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Watchlist/android.widget.TextView - Watchlist'), 15, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is on Watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/03_VerifyElementText_UserIsOn - Watchlist'), 'Watchlist')

'Take Screenshot when user is on Watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/02_UserOn_WatchlistScreen')

Mobile.takeScreenshot()

'User taps on Watchlist dropdown'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/04_UserTapsOnWatchlistDropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when Watchlist dropdown appears'
Mobile.takeScreenshot('Screenshots/RetailFX-28/03_UserTapsOn_WatchlistDropdownScreen')

Mobile.takeScreenshot()

'User selects Watchlist 1'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/05UserSelects - Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user selects Watchlist 1 from dropdown'
Mobile.takeScreenshot('Screenshots/RetailFX-28/04_UserSelects_Watchlist_1_from_Dropdown')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/06_UserTapOn - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is on Watchlist 1'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/07_VerifyElementText - Watchlist 1'), 'Watchlist 1', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when Watchlist 1 is selected'
Mobile.takeScreenshot('Screenshots/RetailFX-28/05_UserSccessfullySelects_Watchlist_1')

Mobile.takeScreenshot()

'user taps on Edit button'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/08_UserTapOn- Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is on Edit watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/09_VerifyElementText - Edit Watchlist'), 'Edit Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is on Edit Watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/06_UserNavigatesTo_EditWatchlist_Screen')

Mobile.takeScreenshot()

'User clears the name of Watchlist'
Mobile.clearText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/10_ClearTextofWatchlist - Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when watchlist name is wiped off'
Mobile.takeScreenshot('Screenshots/RetailFX-28/07_UserClears_WatchlistName')

Mobile.takeScreenshot()

'User taps on Back buton'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/11_UserTapsOnBackButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when pop-up warning appears on the screen'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/12_VerifyElementText - Your changes will not be saved'), 
    'Your changes will not be saved.', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when warning pop-up appears on the csreen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/08_A_Pop-Up_Warning_Appears')

Mobile.takeScreenshot()

'User taps on Confirm'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/13_UserTapsOnConfirm - Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'User navigated back to the watchlist'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/14_UserNavigatedBackTo - Watchlist'), 'Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is navigated to Watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/09_Pop-Up_Disappears_UponClicking_Confirm')

Mobile.takeScreenshot()

'User taps on Edit button'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/15_UserTapsOn - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is on Edit Watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/16_VerifyElementText - Edit Watchlist'), 'Edit Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is on Edit Watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/10_UserTapsOnEditWatchlistAgain')

Mobile.takeScreenshot()

'User clears the name of Watchlist'
Mobile.clearText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/17_ClearWatchlistName- Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after clearing the name of the watchlist'
Mobile.takeScreenshot('Screenshots/RetailFX-28/11_User_Clears_WatchlistName')

Mobile.takeScreenshot()

'User set text with 31 characters'
Mobile.setText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/28_UserEnters_31_Characters'), '1234567890123456789012345678901', 
    0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot when user enetrs 31 charaters and the value doesn\'t get added'
Mobile.takeScreenshot('Screenshots/RetailFX-28/11.1_User_Enters_31_Characters')

Mobile.takeScreenshot()

'User sets text with 30 characters '
Mobile.setText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/29_UserEnters_30_Character'), '123456789012345678901234567890', 
    0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot for the 30 character value that gets entered'
Mobile.takeScreenshot('Screenshots/RetailFX-28/11.2_User_Enters_30_Characters')

Mobile.takeScreenshot()

'User clears 30 character text'
Mobile.clearText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/30_UserClearsText - 123456789012345678901234567890'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot after wiping off the value'
Mobile.takeScreenshot('Screenshots/RetailFX-28/11.3_User_Clears_Text')

Mobile.takeScreenshot()

'User sets text with special characters'
Mobile.setText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/31_UserEntersSpecialCharacters'), '!@#$%^&*(', 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot for the text field with special characters'
Mobile.takeScreenshot('Screenshots/RetailFX-28/11.4_User_Enters_SpecialCharacters')

Mobile.takeScreenshot()

'User clears text again\r\n'
Mobile.clearText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/32_UserClearsText'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot after wiping off the value'
Mobile.takeScreenshot('Screenshots/RetailFX-28/11.5_User_Clears_WatchkistText')

Mobile.takeScreenshot()

'User sets text with multiple spaces'
Mobile.setText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/33_UserEntersSpaces'), '                               ', 
    0, FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot when no value added when spaces are added'
Mobile.takeScreenshot('Screenshots/RetailFX-28/11.6_User_EntersSpaces')

Mobile.takeScreenshot()

'User set text for the watchlist name'
Mobile.setText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/18_SetWatchlistName'), 'WatchlistTest', 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after setting the watchlist name'
Mobile.takeScreenshot('Screenshots/RetailFX-28/12_User_setsThe_WatchlistName_to_WatchlistTest')

Mobile.takeScreenshot()

'User taps on Update'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/19_UserTapOn - Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'A confirmation message appears on the footer of the screen when user taps on confirm'
Mobile.takeScreenshot('Screenshots/RetailFX-28/13_User_taps_On_Update')

Mobile.takeScreenshot()

'VerifyElementText when user sets new name for the watchlist'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/20_VerifyElementText - WatchlistTest'), 'WatchlistTest', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the new watchlist name'
Mobile.takeScreenshot('Screenshots/RetailFX-28/14_A_confirmation_Message_AppearsON-Footer')

Mobile.takeScreenshot()

'User taps on Edit'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/21_UserTapsOnEdit - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is navigated to Edit Watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/22_UserNavigatedTo - Edit Watchlist'), 'Edit Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is navigated to Edit watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/15_UserNavigatesTo_Edit_Watchlist_Screen')

Mobile.takeScreenshot()

'User taps on Reset to Default name button'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/23_UserTapsOn - Reset To Default Name'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after user taps on Reset to Default Name button'
Mobile.takeScreenshot('Screenshots/RetailFX-28/16_User_Resets_To_DefaultName')

Mobile.takeScreenshot()

'User taps on Update'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/24_UserTapsOn- Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

'Take Screenshot when confirmation pop-up is displayed on the screen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/17_Seccessful_Update_Message_AppearsOn_Footer')

Mobile.takeScreenshot()

'VerifyElementText when user resets the Watchlist name'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/25_VerifyElementText_Reset - Watchlist 1'), 'Watchlist 1', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user resets the watchlist name'
Mobile.takeScreenshot('Screenshots/RetailFX-28/18_The_ResetName_Watchlist_1_appears_On_Screen')

Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/26_UserTapsOnBackButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is navigated back to Currency Exchange screen'
Mobile.verifyElementText(findTestObject('Object Repository/Select_Currency_Page/RetailFX-028/27_VerifyElementText - Currency Exchange'), 'Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user is navigated back to Currency Exchange screen'
Mobile.takeScreenshot('Screenshots/RetailFX-28/19_UserNavigated_Back_To_CurrencyExchangeScreen')

Mobile.takeScreenshot()

