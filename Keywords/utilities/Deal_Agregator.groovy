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


class Deal_Agregator {

	@Keyword
	def sow2market_orderdropdown(String currency_code) {
		Mobile.tap(findTestObject('SOW2-Market Order/Select_Currency Dropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('SOW2-Market Order/android.view.View - Select Currency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('SOW2-Market Order/android.view.View - Select Currency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText_SearchCurrency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.setText(findTestObject('SOW2-Market Order/android.widget.EditText_SearchCurrency'), currency_code, 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.delay(5)

		switch (currency_code) {
			case 'USD':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'USD - US Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'GBP':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP - British Pound Sterling']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'EUR':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'EUR - Euro']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'AUD':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'AUD - Australian Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'JPY':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'JPY - Japanese Yen']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'SGD':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'SGD - Singapore Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'CAD':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'CAD - Canadian Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'MYR':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR - Malaysian Ringgit']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
		}
	}

	@Keyword
	def MarketOrder_FromDropdown(String Currency){

		Mobile.tap(findTestObject('Object Repository/SOW2-Market Order/Convert_Dropdown/android.widget.TextView - Convert_Dropdown'),
				5, FailureHandling.OPTIONAL)

		Mobile.waitForElementPresent(findTestObject('SOW2-Market Order/Convert_Dropdown/android.view.View - Select Currency'), 5,
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('SOW2-Market Order/Convert_Dropdown/android.widget.EditText_Select_Currency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.setText(findTestObject('SOW2-Market Order/Convert_Dropdown/android.widget.EditText_Select_Currency'), Currency, 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.delay(5)

		switch (Currency) {
			case 'USD':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'USD - US Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'GBP':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'GBP - British Pound Sterling']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'EUR':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'EUR - Euro']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'AUD':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'AUD - Australian Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'JPY':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'JPY - Japanese Yen']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'SGD':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'SGD - Singapore Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			case 'CAD':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'CAD - Canadian Dollar']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;

			case 'MYR':
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'MYR - Malaysian Ringgit']), 5, FailureHandling.CONTINUE_ON_FAILURE)
				break;
		}
	}
}