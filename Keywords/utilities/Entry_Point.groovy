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
import retailfx.numpad as numpad
import retailfx.Validation as Validation
import utilities.Mobile_Keywords as Utility


class Entry_Point {

	@Keyword
	def Quick_Action(int i) {

		'Verify the Login button is available'
		Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.takeScreenshot()

		'Tap on login button'
		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		def pinNum = '111111'

		numpad.enterNumpad(pinNum)

		'Wait until UserName shows'
		Mobile.waitForElementPresent(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
			'Name', i)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

		'Verify the Username is the Onboarding Name'
		Mobile.verifyElementExist(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
			'Name', i)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.takeScreenshot()

		'Tap on the Customise'
		Mobile.tap(findTestObject('Object Repository/Mange_Quick_Actions/android.widget.TextView - Customise'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		'Wait for Manage Quick Actions load'
		Mobile.waitForElementPresent(findTestObject('Mange_Quick_Actions/android.widget.TextView - Manage Quick Actions'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		'Verify the Manage Quick Actions page shown'
		Mobile.verifyElementExist(findTestObject('Mange_Quick_Actions/android.widget.TextView - Manage Quick Actions'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Mange_Quick_Actions/android.widget.TextView - Simply hold and drag to rearrange the actions'),
				0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Mange_Quick_Actions/android.widget.TextView - Your current favourite actions'),
				0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementAttributeValue(findTestObject('Mange_Quick_Actions/android.widget.TextView - Save Changes'), 'clickable',
				'false', 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.takeScreenshot()

		'Remove Pay Bills'
		Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.Remove_Image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		'Swipe down'
		Mobile.swipe(271, 1756, 0, 0)

		Mobile.takeScreenshot()

		'Add Currency Exchange'
		Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)


		/*CustomKeywords.'utilities.Mobile_Keywords.crollFromBottomToTop'()
		 'Manage Drag and drop to position'
		 Mobile.dragAndDrop(findTestObject('Mange_Quick_Actions/android.widget.TextView - Currency Exchange'), findTestObject('Mange_Quick_Actions/android.widget.TextView - Pay Card'),
		 0)*/

		'Save Changes'
		Mobile.tap(findTestObject('Mange_Quick_Actions/android.widget.TextView - Save Changes'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.takeScreenshot()

		'Verify the Currency Frequecy Added'
		Mobile.verifyElementExist(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Quick_Action/android.widget.TextView - Currency Exchange'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		'Select G1A Account'
		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No',
			i)]), 0, FailureHandling.CONTINUE_ON_FAILURE)

		'Tap on Convert Currency'
		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def Account_Dashboard(int a) {

		Mobile.verifyElementExist(findTestObject('Global Account Page/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Global Account Page/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		def checkLinkedDevice = Validation.checkElementExists('Object Repository/Global Account Page/android.widget.TextView - Kill Switch')

		if (checkLinkedDevice == true) {
			'Verify is in Manage Device page'
			Mobile.verifyElementExist(findTestObject('Object Repository/Global Account Page/android.widget.TextView - Kill Switch'),
					0, FailureHandling.CONTINUE_ON_FAILURE)

			'Manage Devices page'
			Mobile.takeScreenshot()

			'Tap on proceed button'
			Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Got It']), 10, FailureHandling.CONTINUE_ON_FAILURE)
		} else {
			FailureHandling.CONTINUE_ON_FAILURE
		}


		for (int i = 0; i < 3; i++) {

			if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No',
				a)]), 0, FailureHandling.OPTIONAL)) {
				Mobile.delay(2)
				Mobile.takeScreenshot()
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No',
					a)]), 0, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			}
			else {
				scrollFromTopToBottom()
			}
		}


		Mobile.delay(2)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Accounts']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		scrollFromTopToBottom()

		scrollFromTopToBottom()

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'FX']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'More features coming your way.']),
		0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def Currency_account(int a) {

		Mobile.verifyElementExist(findTestObject('Global Account Page/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Global Account Page/android.widget.TextView - View All Accounts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		def checkLinkedDevice = Validation.checkElementExists('Object Repository/Global Account Page/android.widget.TextView - Kill Switch')

		if (checkLinkedDevice == true) {
			'Verify is in Manage Device page'
			Mobile.verifyElementExist(findTestObject('Object Repository/Global Account Page/android.widget.TextView - Kill Switch'),
					0, FailureHandling.CONTINUE_ON_FAILURE)

			'Manage Devices page'
			Mobile.takeScreenshot()

			'Tap on proceed button'
			Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Got It']), 10, FailureHandling.CONTINUE_ON_FAILURE)
		} else {
			FailureHandling.CONTINUE_ON_FAILURE
		}


		for (int i = 0; i < 3; i++) {

			if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No',
				a)]), 0, FailureHandling.OPTIONAL)) {
				Mobile.delay(2)
				Mobile.takeScreenshot()
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No',
					a)]), 0, FailureHandling.CONTINUE_ON_FAILURE)
				break;
			}
			else {
				scrollFromTopToBottom()
			}
		}


		Mobile.delay(2)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Accounts']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		scrollFromTopToBottom()

		scrollFromTopToBottom()

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'FX']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Stay Tuned']), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'More features coming your way.']),
		0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def Login(int a) {
		Mobile.startExistingApplication('com.maybank2u.life.uat')


		'Verify the Login button is available'
		Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.takeScreenshot()

		'Tap on login button'
		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/android.widget.TextView - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		def pinNum = '111111'

		numpad.enterNumpad(pinNum)

		'Wait until UserName shows'
		Mobile.waitForElementPresent(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
			'Name', a)]), 0)

		'Verify the Username is the Onboarding Name'
		Mobile.verifyElementExist(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
			'Name', a)]), 0, FailureHandling.CONTINUE_ON_FAILURE)
	}

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
}