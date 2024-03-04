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

//Verify the Landing Page


'Verify the Foreign currency Name'
Mobile.verifyElementExist(findTestObject('Landing_Page/android.widget.TextView - Investment Master Foreign Currency Account - i'), 
    0)

'Verify the Account'
Mobile.verifyElementExist(findTestObject('Landing_Page/android.widget.TextView - 7640 1602 6385'), 0)

'Verify Foreign Currency Dropdown'
Mobile.verifyElementExist(findTestObject('Landing_Page/android.widget.TextView - Foreign Currency - USD'), 0)

'Verify the Total Currency'
Mobile.verifyElementExist(findTestObject('Landing_Page/android.widget.TextView - Total Currency'), 0)

'Verify the Value in RM Lable'
Mobile.verifyElementExist(findTestObject('Landing_Page/android.widget.TextView - Value in RM'), 0)

'Verify Today Price in RM'
Mobile.verifyElementExist(findTestObject('Landing_Page/android.widget.TextView - Today Price in RM'), 0)

'Tap on the Foreign Currency - USD'
Mobile.tap(findTestObject('Currency_Exchange_Page/android.widget.TextView - Foreign Currency (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Landing_Page/android.widget.ImageView (1)'), 0)

'Verify the Button Cancel is Visible'
Mobile.verifyElementExist(findTestObject('Object Repository/Landing_Page/android.widget.TextView - Cancel'), 0)

'Verify the Button Done is visible'
Mobile.verifyElementExist(findTestObject('Object Repository/Landing_Page/android.widget.TextView - Done'), 0)

'Verify Foreign Currency USD is visble'
Mobile.verifyElementExist(findTestObject('Object Repository/Landing_Page/android.widget.TextView - Foreign Currency - USD'), 
    0)

'Click Cancel'
Mobile.tap(findTestObject('Object Repository/Landing_Page/android.widget.TextView - Cancel'), 0)

'Verify Back to Landing Page'
Mobile.verifyElementExist(findTestObject('Landing_Page/Landing Page'), 0)

'Click the Button Expand'
Mobile.tap(findTestObject('Landing_Page/android.widget.ImageView (1)'), 0)

'Click on Foreign Currency- USD'
Mobile.tap(findTestObject('Object Repository/Landing_Page/android.widget.TextView - Foreign Currency - USD'), 0)

'Click Done'
Mobile.tap(findTestObject('Object Repository/Landing_Page/android.widget.TextView - Done'), 0)

'Verify Back to Landing Page'
Mobile.verifyElementExist(findTestObject('Landing_Page/Landing Page'), 0)

'Click X button'
Mobile.tap(findTestObject('Object Repository/Landing_Page/android.widget.ImageView (2)'), 0)

Mobile.closeApplication()

