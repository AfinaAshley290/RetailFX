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
import retailfx.numpad as numpad

Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - View All'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Afina'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Currency Exchange'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Tabung'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Financial Goals'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Promotions'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Junior'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Sama-Sama Lokal'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Movies  Leisure'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Kill Switch'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Secure2u'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Tap, Track, Win'), 0)


Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Notifications'), 0)

Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Hello,'), 0)


Mobile.verifyElementExist(findTestObject('ViewAll_Page/android.widget.TextView - Logout'), 0)

Mobile.tap(findTestObject('ViewAll_Page/android.widget.TextView - Currency Exchange'), 0)

















