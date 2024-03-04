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
import retailfx.Utility as Utility

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.waitForElementPresent(findTestObject('Dashboard_Login/android.widget.TextView - Login'), 0)

Mobile.verifyElementExist(findTestObject('Dashboard_Login/android.widget.TextView - Login'), 0)

Mobile.takeScreenshot()

Utility.doubleTap()

Mobile.waitForElementPresent(findTestObject('General/android.widget.TextView - DEV OPTIONS'), 0)

Mobile.waitForElementPresent(findTestObject('General/android.widget.TextView - com.maybank2u.life.uat'), 0)

Mobile.takeScreenshot()

appVer = Mobile.getText(findTestObject('General/android.widget.TextView - App Ver'), 0)

println('The app Number' + appVer)

Mobile.tap(findTestObject('General/android.widget.Close_Buttone'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard_Login/android.widget.TextView - Login'), 0)

Mobile.verifyElementExist(findTestObject('Dashboard_Login/android.widget.TextView - Login'), 0)

Mobile.takeScreenshot()

Mobile.comment(appVer)

