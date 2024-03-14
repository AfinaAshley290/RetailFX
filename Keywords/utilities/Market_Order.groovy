package utilities
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import io.appium.java_client.MobileElement

import io.appium.java_client.MultiTouchAction

import io.appium.java_client.TouchAction

import io.appium.java_client.android.AndroidDriver

import io.appium.java_client.touch.WaitOptions

import io.appium.java_client.touch.offset.PointOption
import org.openqa.selenium.Keys as Keys
import retailfx.Currency_Calculator as numpad
import retailfx.Validation as Validation

class Market_Order {

	@Keyword
	def MarketOrder() {
	}

	@Keyword
	def Account_Selection(String Account_Number) {

		'Swipe to find the account'
		for (int i = 0; i < 9; i++) {

			if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : Account_Number]), 0, FailureHandling.OPTIONAL)) {
				Mobile.delay(2)
				Mobile.takeScreenshot()
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : Account_Number]), 0, FailureHandling.OPTIONAL)
				break;
			}
			else {
				Mobile.swipe(450, 884, 0, 884, FailureHandling.OPTIONAL)
			}
		}
	}

	@Keyword
	def Confirmation_Page() {
		
	}

	@Keyword
	def Transaction_Page() {
	}

	@Keyword
	def Transcript_Receipt() {
	}

	@Keyword
	def Currency_Numpad(String digits) {

		int digit_length = digits.length()

		for(int i=0;i<digit_length;i++) {

			if((digits[i])=='1') {

				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 1'), 0)
			}
			else if((digits[i])=='2') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 2'), 0)
			}
			else if((digits[i])=='3') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 3'), 0)
			}

			else if((digits[i])=='4') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 4'), 0)
			}
			else if((digits[i])=='5') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 5'), 0)
			}
			else if((digits[i])=='6') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 6'), 0)
			}
			else if((digits[i])=='7') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 7'), 0)
			}
			else if((digits[i])=='8') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 8'), 0)
			}
			else if((digits[i])=='9') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 9'), 0)
			}
			else if((digits[i])=='0') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 0'), 0)
			}
		}


		Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.Image'), 0)
	}

	@Keyword
	def MarketOrder_FromDropdown(String Currency, String Currency_name){

		Mobile.tap(findTestObject('Object Repository/SOW2-Market Order/Convert_Dropdown/android.widget.TextView - Convert_Dropdown'),
				5, FailureHandling.OPTIONAL)

		Mobile.waitForElementPresent(findTestObject('SOW2-Market Order/Convert_Dropdown/android.view.View - Select Currency'), 5,
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('SOW2-Market Order/Convert_Dropdown/android.widget.EditText_Select_Currency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.setText(findTestObject('SOW2-Market Order/Convert_Dropdown/android.widget.EditText_Select_Currency'), Currency, 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : Currency_name]),
		5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : Currency_name]), 5, FailureHandling.CONTINUE_ON_FAILURE)
	}
}
