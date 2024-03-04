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

contact_bank_header = Mobile.getText(findTestObject('Object Repository/Contact The Bank/android.widget.TextView - Contact Bank'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(contact_bank_header, 'Contact Bank', false, FailureHandling.CONTINUE_ON_FAILURE)

contact_bank_content = Mobile.getText(findTestObject('Object Repository/Contact The Bank/android.widget.TextView - For any enquiries regarding your account, please call the Customer Care Hotline at 1 300 88 6688'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(contact_bank_content, 'For any enquiries regarding your account, please call the Customer Care Hotline at 1 300 88 6688.', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

contact_bank_call_now = Mobile.getText(findTestObject('Object Repository/Contact The Bank/android.widget.TextView - Call Now'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(contact_bank_call_now, 'Call Now', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Contact The Bank/android.widget.TextView - Call Now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

phone_number = Mobile.getText(findTestObject('Contact The Bank/android.widget.TextView - 1300886688'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(phone_number, '1300886688', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Contact The Bank/android.widget.Button - CANCEL'), 0, FailureHandling.CONTINUE_ON_FAILURE)

