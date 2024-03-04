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

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.takeScreenshot()

Mobile.delay(5)



/*Mobile.swipe(65, 714, 0, 0)

Mobile.delay(5)

Mobile.swipe(74, 275, 0, 0)

Mobile.waitForElementPresent(findTestObject('Dashboard_Login/android.widget.ImageView (5)'), 0) */
Mobile.tap(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0)

Mobile.takeScreenshot()

pinNum = '111111'

numpad.enterNumpad(pinNum)

'Verify Currency exchange icon is displayed under quick actions'
Mobile.waitForElementPresent(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0)

'Verify Currency exchange icon'
Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0)

Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0)

Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0)

Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0)

Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0)





