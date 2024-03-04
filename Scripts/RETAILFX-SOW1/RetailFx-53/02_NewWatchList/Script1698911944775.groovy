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

Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify Element Text for "Watchlist"'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/01_VerifyElementText- Watchlist'), 'Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the Watchlist Screen'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/01_User_Is_on_Watchlist')

Mobile.takeScreenshot()

'User taps on Watchlist dropdown'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/02_TapOn_WatchlistDropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the Watchlist dropdown'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/02_UserTapsOn_Watchlist')

Mobile.takeScreenshot()

'User selects Watchlist 1'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/03_UserSelects- Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting Watchlist 1'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/03_UserTapsOnWatchlist1')

Mobile.takeScreenshot()

'User taps on Done after selecting Watchlist 1'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/04_UserTapsOn- Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting watchlist 1 from dropdown'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/04_UserTapsOnDone')

Mobile.takeScreenshot()

'Verify Element Text for "No Currency Pairings Selected"'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/05_VerifyElementText - No Currency Pairings Selected'), 
    'No Currency Pairings Selected', FailureHandling.CONTINUE_ON_FAILURE)

'Verify Element Text for "You have no currency pairs selected for this watchlist yet. Tap Edit to get started."'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/06_VerifyElementText - You have no currency pairs selected for this watchlist yet. Tap Edit to get started'), 
    'You have no currency pairs selected for this watchlist yet. Tap Edit to get started.', FailureHandling.CONTINUE_ON_FAILURE)

'User taps on Back Icon on the top left corner of the screen'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/07_UserTapsOnBackIcon_TopLeftCorner'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after navigating back'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/05_UserTapsOn_Top_leftCorner_toNavigateBack')

Mobile.takeScreenshot()

'Verify Element Text for Currency Exchange"'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/08_VerifyElementTextOnNavigatingBack - Currency Exchange'), 
    'Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)

'User taps on Watchlist again'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/09_UserTapsOnWatchlistAgain'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Element Text for "Watchlist"'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/10_UserLandsOn - Watchlist'), 'Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the Watchlist Screen'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/06_UserTapsOnWatchlistIcon')

Mobile.takeScreenshot()

'User taps on Watchlist dropdown'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/11_UserTapsOnWatchlistDropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot for the Watchlist dropdown '
Mobile.takeScreenshot('Screenshots/02_NewWatchList/07_UserTapsOnWatchlistDropdown')

Mobile.takeScreenshot()

'User Selects Watchlist 1'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/12_UserTapsOn - Watchlist 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after Selecting Watchlist 1'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/07.1_UserTapsOnWatchlist_1')

Mobile.takeScreenshot()

'User Taps on Done'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/13_UserTapsOnDone - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting Watchlist 1'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/08_UserTapsOnDone')

Mobile.takeScreenshot()

'Verify Element Text for "Watchlist 1"'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/14_VerifyElementText - Watchlist 1'), 'Watchlist 1', FailureHandling.CONTINUE_ON_FAILURE)

'User taps on Edit'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/15_UserTapsOnEdit - Edit'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot when user navigates to edit screen'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/09_UserTapsOnEdit')
Mobile.takeScreenshot()

'User taps on Currency Pairs'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/16_UserTapsOn_ Select Currency Pairs'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot before selecting the currency pairs'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/10_UserTapsOn_SelectCurrencyPairs')
Mobile.takeScreenshot()

'User scrolls to the bottom of the screen'
Mobile.scrollToText('GBP/SEK')
Mobile.scrollToText('QAR/JPY')
Mobile.scrollToText('SGD/THB')
Mobile.delay(20)



'Take Screenshot after scrolling to the bottom of the screen'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/11_UserScrollstoLastItem')

Mobile.takeScreenshot()

'User taps on SGD/THB radio icon '
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/17_UserTapsOn- SGDTHB'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after selecting SGD/THB'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/12_UserTapsOn_SGD/THB')
Mobile.takeScreenshot()

'Verify Element Text after Pair count increases to 1/10'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/18_The_1_Pair_Count_Increases - 110 pairs selected'), 
    '1/10 pairs selected', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after the count increases to 1/10'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/13_the_PairCount_Text_IncreasesTo_1/10')

Mobile.takeScreenshot()

'User taps on SGD/SEK radio icon '
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/18_UserTapsOn - SGDSEK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Element Text after pair count increases 2/10'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/19_The_2_pair_Count_Increases - 210 pairs selected'), 
    '2/10 pairs selected', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after the count increases to 2/10'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/14_the_PairCount_Text_IncreasesTo_2/10')

Mobile.takeScreenshot()

'User taps on SGD/SAR radio icon '
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/20_UserTapsOn - SGDSAR'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Element Text after pair count increases 3/10'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/21_The3_PairCount_Increases - 310 pairs selected'), 
    '3/10 pairs selected', FailureHandling.CONTINUE_ON_FAILURE)

'Take Screenshot after the count increases to 3/10'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/15_the_PairCount_Text_IncreasesTo_3/10')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/22_UserTapsOn - Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Element Text for Edit Watchlist'
Mobile.verifyElementText(findTestObject('Object Repository/02_NewWatchList/23_VerifyElementText- Edit Watchlist'), 'Edit Watchlist', FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot for edit watchlist'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/16_UserNavigatesToEditWatchListScreen')

Mobile.takeScreenshot()

'user taps on update'
Mobile.tap(findTestObject('Object Repository/02_NewWatchList/24_UserTapsOn - Update'), 0,FailureHandling.CONTINUE_ON_FAILURE)

'Take screenshot after Update is clicked'
Mobile.takeScreenshot('Screenshots/02_NewWatchList/17_TheUpdate_MessageDisplays_OnTheFooter')

Mobile.takeScreenshot()

