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

//Mobile.startExistingApplication('com.maybank2u.life.uat')

//Mobile.tap(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0)

//pinNum = '111111'

//numpad.enterNumpad(pinNum)

Mobile.delay(5)

'Verify and Click <Customise> button'
Mobile.tap(findTestObject('Object Repository/Mange_Quick_Actions/android.widget.TextView - Customise'), 0)

'Details screenshot'
Mobile.takeScreenshot()

'Remove Currency Exchange from Quick Action'
Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.TextView - RemoveButton_Currency Exchange'), 0)

Mobile.takeScreenshot()

Mobile.swipe(271, 1756, 0, 0)

'Detail Screenshot'
Mobile.takeScreenshot()

'Select \'Pay Bills\''
Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.TextView - Pay Bills'), 0)

Mobile.takeScreenshot()

'Click <Save Changes>'
Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.TextView - Save Changes'), 0)

'Detail Screenshot'
Mobile.takeScreenshot()

'Verify the Currency Frequecy Not Available Anymore'
Mobile.verifyElementNotExist(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0)

Mobile.closeApplication()

