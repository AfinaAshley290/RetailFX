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


'VerifyElemnetText_User_Is_On_Currency_Exchange_Screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/01_VerifyElementText_for_Screen - Currency Exchange'), 
    'Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when user is on Currency Exchange screen'
Mobile.takeScreenshot('Screenshots/RetailFX-32/01_User_Is_On_Currency Exchange_Screen')

Mobile.takeScreenshot()

'User taps on watchlist '
Mobile.tap(findTestObject('Object Repository/RetailFx-32/02_User_Taps_On_Watchlist'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user navigated to watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/03_VerifyElementText_When_User_reaches - Watchlist'), 
    'Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when user is navigated to Watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-32/02_User_Is_On_Watchlist_Screen')

Mobile.takeScreenshot()

'User taps on watchlist dropdown'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/04_User_Taps_On_Watchlist_Dropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when watchlist dropdown appears'
Mobile.takeScreenshot('Screenshots/RetailFX-32/03_User_Taps_On_Watchlist_Dropdown')

Mobile.takeScreenshot()

'User selects Watchlist 1'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/05_User_Selects_Watchlist - Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when Screenshot one is selected'
Mobile.takeScreenshot('Screenshots/RetailFX-32/04_User_Selects_Watchlist_1')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/06_User_Taps_On - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is on Watchlist 1 screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/07_VerifyElementText_User_Inside_Watchlist_Screen - Watchlist 1'), 
    'Watchlist 1', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when user is on Watchlist 1 screen'
Mobile.takeScreenshot('Screenshots/RetailFX-32/07_Watchlist_1_Screen_Item_Gets_Displayed')

Mobile.takeScreenshot()

'User taps on back button on the top left corner'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/08_User_Taps_On_Back_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user navigated back to currency exchange screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/09_VerifyElementText_User_Navigated_back- Currency Exchange'), 
    'Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when user is navigated back to Currency Exchange screen'
Mobile.takeScreenshot('Screenshots/RetailFX-32/08_User_Navigated_Back_To_Currency_Exchange')

Mobile.takeScreenshot()

'User taps on watchlist again'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/10_UserTaps_On_Watchlist_Again'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is navigated to watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/11_VerifyElementText_User_Navigates_To- Watchlist'), 
    'Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when user is again navigated to watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-32/09_User_Navigated_Forward_To_Watchlist_Screen')

Mobile.takeScreenshot()

'User taps on 3 dots'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/12_User_Taps_On_3_Dots'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when Contact Bank dropdown appears'
Mobile.takeScreenshot('Screenshots/RetailFX-32/10_User_Tap_On_3_Dots_For_Contact_Bank')

Mobile.takeScreenshot()

'User taps on Contact bank'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/13_User_Taps_On - Contact Bank'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText for the Contact Bank pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/14_VerifyElementText_Contact_Bank_Pop-up - For any enquiries regarding your account, please call the Customer Care Hotline at 1 300 88 6688'), 
    'For any enquiries regarding your account, please call the Customer Care Hotline at 1 300 88 6688.', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the pop-up screen Contact Bank'
Mobile.takeScreenshot('Screenshots/RetailFX-32/11_Contact_Bank_Pop-Up_Visible_to_User')

Mobile.takeScreenshot()

'User taps on Close icon present on the pop-up'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/15_UserTapsOnClose_Icon_On_Pop-up'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen after contact bank pop-up is closed'
Mobile.takeScreenshot('Screenshots/RetailFX-32/12_The_Pop-up_Is_Closed_By_User')

Mobile.takeScreenshot()

'User taps on Watchlist dropdown'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/16_Tap_On_WatchlistDropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when watchlist list appears'
Mobile.takeScreenshot('Screenshots/RetailFX-32/13_The_watchlist_Dropdown_Is_Visible_To-User')

Mobile.takeScreenshot()

'User taps on Watchlist 1'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/17_Select_Watchlist1 - Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting Watchlist 1'
Mobile.takeScreenshot('Screenshots/RetailFX-32/14_User_Selects_Watchlist_1')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/18_Tap_On - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot Once Watchlist 1 is selected'
Mobile.takeScreenshot('Screenshots/RetailFX-32/15_User_Confirms_Done_For_Watchlist_1')

Mobile.takeScreenshot()

'VerifyElementText when user navigated to watchlist 1 screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/19_VerifyElementText_BlankWatchlist - You have no currency pairs selected for this watchlist yet. Tap Edit to get started'), 
    'You have no currency pairs selected for this watchlist yet. Tap Edit to get started.', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot once user is navigated to Watchlist 1 screen'
Mobile.takeScreenshot('Screenshots/RetailFX-32/16_Blank_Watchlist_Present_For_Watchlist_1')

Mobile.takeScreenshot()

'User taps on Edit'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/20_UserTapsOnEdit - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot once user is inside Edit screen for Watchlist 1'
Mobile.takeScreenshot('Screenshots/RetailFX-32/17_User_Navigates_To_Edit_Watchlist_Screen')

Mobile.takeScreenshot()

'User taps on Select Currency Pairs'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/21_User_Taps_On- Select Currency Pairs'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot once the list of currency pair appears'
Mobile.takeScreenshot('Screenshots/RetailFX-32/18_User_Navigates_To_Currency_Pair_List')

Mobile.takeScreenshot()

'User selects AED/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/22_UserSelects - AEDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when Pair count changes to 1/0'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/23_PairCount_Changes_To- 110 pairs selected'), '1/10 pairs selected', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting one currency pair'
Mobile.takeScreenshot('Screenshots/RetailFX-32/19_User_Selects_AED/MYR')

Mobile.takeScreenshot()

'User selects AUD/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/24_UserSelects - AUDMYR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when Pair count changes to 2/10'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/25_PairCount_Changes_To - 210 pairs selected'), '2/10 pairs selected', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting second currency pair'
Mobile.takeScreenshot('Screenshots/RetailFX-32/20_User_Selects_AUD/MYR')

Mobile.takeScreenshot()

'User selects BND/MYR'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/26_UserTaps_On - BNDMYR'), 0)

'VerifyElementText when Pair count changes to 3/10'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/27_Pair_Count_Changes_To - 310 pairs selected'), 
    '3/10 pairs selected', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting third currency pair'
Mobile.takeScreenshot('Screenshots/RetailFX-32/21_User_Selects_BND/MYR')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/28_UserTaps_On - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen after selecting currency pairs'
Mobile.takeScreenshot('Screenshots/RetailFX-32/22_User_Taps_Done')

Mobile.takeScreenshot()

'User taps on Update'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/29_UserTapsOn - Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when currency pairs are updated '
Mobile.takeScreenshot('Screenshots/RetailFX-32/23_User_Taps_Update_Confirmation_Pop-Up_Displayed_On_Footer')

Mobile.takeScreenshot()

'User taps on Edit'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/30_UserTapsOn - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user navigated to edit watchlist screen'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/31_VerifyElementText- Edit Watchlist'), 'Edit Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user navigated to edit watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-32/24_User_Navigates_To_Edit_Watchlist_Screen')

Mobile.takeScreenshot()

'User clears the Text that displays Watchlist 1'
Mobile.clearText(findTestObject('Object Repository/RetailFx-32/32_UserClears_Text - Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after wiping the text Watchlist 1'
Mobile.takeScreenshot('Screenshots/RetailFX-32/25_User_deletes_Text_Watchlist_1', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

'Set text to Test Watchlist'
Mobile.setText(findTestObject('Object Repository/RetailFx-32/33_UserSets_Text_Test_Watchlist'), 'Test Watchlist', 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after setting the text to Test Watchlist'
Mobile.takeScreenshot('Screenshots/RetailFX-32/26_User_sets_Text_Test_Watchlist')

Mobile.takeScreenshot()

'User taps on Update'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/34_UserTaps_On- Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot once the user taps on Update'
Mobile.takeScreenshot('Screenshots/RetailFX-32/27_confirmation_Message_Displays_On_The_Footer')

Mobile.takeScreenshot()

'User taps on Edit again'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/35_UserTapsOn- Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'VerifyElementText when user is on edit watchlist screen'
Mobile.takeScreenshot('Screenshots/RetailFX-32/28_User_Taps_On_Edit_Again')

Mobile.takeScreenshot()

'User taps on Reset to Default Name button'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/36_UserTapsOn- Reset To Default Name'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after the user taps Reset To Default Name button'
Mobile.takeScreenshot('Screenshots/RetailFX-32/29_User_Taps_On_Default_Name_Button')

Mobile.takeScreenshot()

'The element Text changes to Watchlist 1'
Mobile.verifyElementText(findTestObject('Object Repository/RetailFx-32/37_VerifyElementText_Text_Changes_To - Watchlist 1'), 
    'Watchlist 1', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when the text changes to Watchlist 1'
Mobile.takeScreenshot('Screenshots/RetailFX-32/30_The_Watchlist_Name_Changes_Back_To_Watchlist_1')

Mobile.takeScreenshot()

'User taps on Update'
Mobile.tap(findTestObject('Object Repository/RetailFx-32/38_User_Taps_On_Update- Update'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the screen when the watchlist name is updated'
Mobile.takeScreenshot('Screenshots/RetailFX-32/31_The_Watchlist_Name_gets_Updated_and_Confirmation_Message_Displayed_On_footer')

Mobile.tap(findTestObject('Watchlist_Remove/android.widget.Image (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

