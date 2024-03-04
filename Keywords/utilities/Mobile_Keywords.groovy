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



class Mobile_Keywords {


	@Keyword
	def scrollFromTopToBottom() {
		def device_Height = Mobile.getDeviceHeight()

		println device_Height

		def device_Width = Mobile.getDeviceWidth()

		println device_Width

		int startX = device_Width / 2

		int endX = startX

		int startY = device_Height * 0.30

		int endY = device_Height * 0.70

		Mobile.swipe(startX, endY, endX, startY)

		Mobile.delay(5)
	}

	@Keyword
	def takeScreenshot(String ScreenShotName) {
		MobileBuiltInKeywords.takeScreenshot('.//Screenshots//'+ScreenShotName+'.png',FailureHandling.OPTIONAL)
	}


	@Keyword
	def VerifyEqual(def to,def Verify,def expected) {

		Mobile.verifyEqual(Mobile.getText(to, [('text'):Verify]), expected, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def sow2market_orderdropdown(String currency_code, String currency_name) {
		Mobile.tap(findTestObject('SOW2-Market Order/Select_Currency Dropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('SOW2-Market Order/android.view.View - Select Currency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('SOW2-Market Order/android.view.View - Select Currency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('SOW2-Market Order/android.widget.EditText_SearchCurrency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.setText(findTestObject('SOW2-Market Order/android.widget.EditText_SearchCurrency'), currency_code, 5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]),
		5, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]), 5, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def currency_type(String currency_code, String currency_name) {
		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : currency_code]), 0, FailureHandling.OPTIONAL)

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Select Currency']), 0, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Select Currency']), 0, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]), 0,
		FailureHandling.OPTIONAL)

		Mobile.takeScreenshot()

		Mobile.tap(findTestObject('Market Order Page/android.view.ViewGroup_SearchField'), 0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Market Order Page/android.widget.EditText'), currency_code, 0, FailureHandling.OPTIONAL)

		Mobile.delay(5)
		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]), 0,
		FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewBack_Button'), 0, FailureHandling.OPTIONAL)
	}

	@Keyword
	def search_Currency(String currency_code, String currency_name){
		Mobile.tap(findTestObject('Market Order Page/android.view.ViewGroup_SearchField'), 0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Market Order Page/android.widget.EditText'), currency_code, 0, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]), 0,
		FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Market Order Page/android.widget.ImageViewBack_Button'), 0, FailureHandling.OPTIONAL)
	}

	@Keyword
	def Market_Currency(String currency_code, String currency_name){
		Mobile.tap(findTestObject('Market Order Page/android.view.ViewGroup_SearchField'), 0, FailureHandling.OPTIONAL)

		Mobile.delay(5)

		Mobile.setText(findTestObject('Market Order Page/android.widget.EditText'), currency_code, 0, FailureHandling.OPTIONAL)

		Mobile.hideKeyboard()

		Mobile.delay(5)

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]), 5,
		FailureHandling.OPTIONAL)

		Mobile.delay(5)

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]), 5, FailureHandling.OPTIONAL)
	}


	@Keyword
	def scrollFromBottomToTop() {
		def device_Height = Mobile.getDeviceHeight()
		println  device_Height


		'Get Width Height and Store in device_Width variable'

		def device_Width = Mobile.getDeviceWidth()
		println  device_Width

		int startX = device_Width / 2



		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'

		int endX = startX



		'Storing the startY value'

		int startY = device_Height * 0.30



		'Storing the endY value'

		int endY = device_Height * 0.70


		Mobile.delay(5)

		'Swipe Vertical from bottom to top'

		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def select_Currency (String currency_code, String currency_name) {

		Mobile.setText(findTestObject('Market Order Page/android.widget.EditText'), currency_code, 0, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]), 0, FailureHandling.OPTIONAL)

		Mobile.takeScreenshot()

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : currency_name]), 0, FailureHandling.OPTIONAL)
	}


	public void doubleTap() {

		AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()



		'Get Device Height and store to "device_Height" variable'

		def device_Height = Mobile.getDeviceHeight()



		'Get Device Width and store to "device_Width" variable'

		def device_Width = Mobile.getDeviceWidth()



		'Get X1 coordinate of touchpoint 1 (Top Left Side)'

		int X1 = device_Width /2



		'Get Y1 coordinate of touch action 1 (Top Left Side)'

		int Y1 = device_Height/2



		'Get X2 coordinate of touchpoint 2 (Top Right Side)'

		int X2 = X1+100



		'Get Y2 coordinate of touchpoint 2 (Top Right Side)'

		int Y2 = X2+100



		'Create object to "MultiTouchAction" class '

		MultiTouchAction multiTouch = new MultiTouchAction(driver)



		'Create First action Object to "TouchAction" class'

		TouchAction action1 = new TouchAction(driver)



		'Create Second action Object to "TouchAction" class'

		TouchAction action2 = new TouchAction(driver)





		'Press First action with x y coordinates wait 5 Seconds then release'

		action1.press(PointOption.point(X1, Y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()



		'Press Second action with x y coordinates wait 5 Seconds then release'

		action2.press(PointOption.point(X2, Y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()





		'Multi Touch Object to add Multiple touch actions as per you need'

		multiTouch.add(action1).add(action2).perform()
	}




	@Keyword
	def isElementPresent_Mobile(TestObject to, int timeout){
		try {
			KeywordUtil.logInfo("Finding element with id:" + to.getObjectId())

			WebElement element = MobileElementCommonHelper.findElement(to, timeout)
			if (element != null) {
				KeywordUtil.markPassed("Object " + to.getObjectId() + " is present")
			}
			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Object " + to.getObjectId() + " is not present")
		}
		return false;
	}

	/**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */
	@Keyword
	def WebDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}
}