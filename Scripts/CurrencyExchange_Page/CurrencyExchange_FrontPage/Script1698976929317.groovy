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


'Verify the watchlist is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Watchlist'), 0)

'Verify the Currency Calculator is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Currency Calculator'), 0)

'Verify the Rate Alert is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Rate Alert'), 0)

'Verify the Order Status is available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Order Status'), 0)

'Verify Convert Currency is Available'
Mobile.verifyElementExist(findTestObject('Object Repository/Currency_Exchange_Page/Convert Currency Button'), 0)

