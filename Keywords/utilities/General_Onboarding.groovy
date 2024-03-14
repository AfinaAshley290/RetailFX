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
import retailfx.OTP as OTP
import retailfx.Validation as Validation
import utilities.Mobile_Keywords as Utility



class General_Onboarding {
	@Keyword
	def Onboarding_Retailfx(int i) {

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_Button'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_Button01'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_button02'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_button03'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Got_It_Button'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Onboarding_Obj/Agree_Button1'), 0, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Object Repository/Onboarding_Obj/Log_In_Now_Button'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Log In Now'), 0,
				FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Existing M2UMAE user Log in here'),
				0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Dashboard_Login/Onboarding_Login/Username'), findTestData('Username_Password').getValue('Username',
				i), 0, FailureHandling.OPTIONAL)

		Mobile.hideKeyboard(FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Yes, Its Mine'),
				0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Username_Password').getValue(
				'Password', i), 0, FailureHandling.OPTIONAL)

		Mobile.hideKeyboard(FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue (1)'), 0, FailureHandling.OPTIONAL)

		def checkLinkedDevice = Validation.checkElementExists('Object Repository/Onboarding_Obj/android.widget.TextView - Your Maybank2u ID is already linked to the following device')

		if (checkLinkedDevice == true) {
			'Verify is in Manage Device page'
			Mobile.verifyElementExist(findTestObject('Object Repository/Onboarding_Obj/Proceed_Button'), 0, FailureHandling.OPTIONAL)

			'Manage Devices page'
			Mobile.takeScreenshot()

			'Tap on proceed button'
			Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Proceed_Button'), 10, FailureHandling.OPTIONAL)
		} else {
			FailureHandling.OPTIONAL
		}

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Your PIN no. is 111111'),
				0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.ImageView'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Your PIN no. is 111111'),
				0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.ImageView'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Set Up Later'),
				0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Yes, Proceed'),
				0, FailureHandling.OPTIONAL)

		def OTP_TextMsg = Mobile.getText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - OTP'),
				0, FailureHandling.OPTIONAL)

		OTP_TextMsg = OTP_TextMsg.replace('Your OTP no. is ', '')

		def otpArr2 = OTP_TextMsg.toCharArray()

		OTP.enterOTP(OTP_TextMsg)

		Mobile.tap(findTestObject('OTP_Number/Enter_Image'), 0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.EditText - Enter your name'),
				findTestData('Username_Password').getValue('Name', i), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue (1)'), 0, FailureHandling.OPTIONAL)

		println('the account number: ' + findTestData('Username_Password').getValue('Account_Number', 1))

		def Acc_Number = findTestData('Username_Password').getValue('Account_Number', i)

		Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/GetCurrency', [('text') : Acc_Number]), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Skip'), 0, FailureHandling.OPTIONAL)

		'Secure2U Activation'
		Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Activate Secure2u'), 0, FailureHandling.OPTIONAL)

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Secure2u']), 10, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Secure2u']), 10, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Register Secure2u Now']), 5, FailureHandling.OPTIONAL)

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'One Time Password']), 20, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirm']), 0, FailureHandling.OPTIONAL)

		def OTP_TextMsg2 = Mobile.getText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - OTP'),
				0, FailureHandling.OPTIONAL)

		OTP_TextMsg2 = OTP_TextMsg2.replace('Your OTP no. is ', '')

		OTP.enterOTP(OTP_TextMsg2)

		Mobile.tap(findTestObject('Onboarding_secure2u/Check_Button'), 0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Onboarding_secure2u/android.widget.EditText - Your ID number'), findTestData('Username_Password').getValue(
				'IC_Number', i), 0, FailureHandling.OPTIONAL)

		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 0, FailureHandling.OPTIONAL)

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Next']), 20, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Next']), 0, FailureHandling.OPTIONAL)

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Call Us Now']), 5, FailureHandling.OPTIONAL)

		if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 0, FailureHandling.OPTIONAL)) {

			Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 5, FailureHandling.OPTIONAL)
		} else {

			Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Later']), 5, FailureHandling.OPTIONAL)
		}


		'Check if Logout page available'

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Logout']), 5, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Username_Password').getValue(
			'Name', i)]), 0, FailureHandling.OPTIONAL)

		if (Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Logout']), 5, FailureHandling.OPTIONAL)) {
			Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Logout']), 5, FailureHandling.OPTIONAL)

			Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'You’ve successfully logged out. Come back soon!']), 5, FailureHandling.OPTIONAL)

			Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Quit App']), 5, FailureHandling.OPTIONAL)
		}
	}

	@Keyword

	def Onboarding_Different_User(int i) {
		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_Button'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_Button01'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_button02'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Next_button03'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Got_It_Button'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Onboarding_Obj/Agree_Button1'), 0, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Object Repository/Onboarding_Obj/Log_In_Now_Button'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Log In Now'), 0,
				FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Existing M2UMAE user Log in here'),
				0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Dashboard_Login/Onboarding_Login/Username'), findTestData('Different_User').getValue('Username',
				i), 0, FailureHandling.OPTIONAL)

		Mobile.hideKeyboard(FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Yes, Its Mine'),
				0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Different_User').getValue(
				'Password', i), 0, FailureHandling.OPTIONAL)

		Mobile.hideKeyboard(FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue (1)'), 0, FailureHandling.OPTIONAL)

		def checkLinkedDevice = Validation.checkElementExists('Object Repository/Onboarding_Obj/android.widget.TextView - Your Maybank2u ID is already linked to the following device')

		if (checkLinkedDevice == true) {
			'Verify is in Manage Device page'
			Mobile.verifyElementExist(findTestObject('Object Repository/Onboarding_Obj/Proceed_Button'), 0, FailureHandling.OPTIONAL)

			'Manage Devices page'
			Mobile.takeScreenshot()

			'Tap on proceed button'
			Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/Proceed_Button'), 10, FailureHandling.OPTIONAL)
		} else {
			FailureHandling.OPTIONAL
		}

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Your PIN no. is 111111'),
				0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.ImageView'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Your PIN no. is 111111'),
				5, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.ImageView'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Set Up Later'),
				0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Yes, Proceed'),
				0, FailureHandling.OPTIONAL)

		def OTP_TextMsg = Mobile.getText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - OTP'),
				0, FailureHandling.OPTIONAL)

		OTP_TextMsg = OTP_TextMsg.replace('Your OTP no. is ', '')

		def otpArr2 = OTP_TextMsg.toCharArray()

		OTP.enterOTP(OTP_TextMsg)

		Mobile.tap(findTestObject('OTP_Number/Enter_Image'), 0, FailureHandling.OPTIONAL)

		Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.EditText - Enter your name'),
				findTestData('Different_User').getValue('Name', i), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/android.widget.TextView - Continue (1)'), 0, FailureHandling.OPTIONAL)

		println('the account number: ' + findTestData('Different_User').getValue('Account_Number', 1))

		def Acc_Number = findTestData('Different_User').getValue('Account_Number', i)

		Mobile.tap(findTestObject('Dashboard_Login/Onboarding_Login/GetCurrency', [('text') : Acc_Number]), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Onboarding_Obj/android.widget.Close_Button'), 0, FailureHandling.OPTIONAL)

		/*Mobile.tap(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - Skip'), 0, FailureHandling.OPTIONAL)
		 'Secure2U Activation'
		 Mobile.tap(findTestObject('Object Repository/Onboarding_secure2u/android.widget.TextView - Activate Secure2u'), 0, FailureHandling.OPTIONAL)
		 Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Secure2u']), 10, FailureHandling.OPTIONAL)
		 Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Secure2u']), 10, FailureHandling.OPTIONAL)
		 Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Register Secure2u Now']), 5, FailureHandling.OPTIONAL)
		 Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'One Time Password']), 20, FailureHandling.OPTIONAL)
		 Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirm']), 0, FailureHandling.OPTIONAL)
		 def OTP_TextMsg2 = Mobile.getText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/android.widget.TextView - OTP'),
		 0, FailureHandling.OPTIONAL)
		 OTP_TextMsg2 = OTP_TextMsg2.replace('Your OTP no. is ', '')
		 OTP.enterOTP(OTP_TextMsg2)
		 Mobile.tap(findTestObject('Onboarding_secure2u/Check_Button'), 0, FailureHandling.OPTIONAL)
		 Mobile.setText(findTestObject('Onboarding_secure2u/android.widget.EditText - Your ID number'), findTestData('Different_User').getValue(
		 'IC_Number', i), 0, FailureHandling.OPTIONAL)
		 Mobile.hideKeyboard()
		 Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 0, FailureHandling.OPTIONAL)
		 Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Next']), 20, FailureHandling.OPTIONAL)
		 Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Next']), 0, FailureHandling.OPTIONAL)
		 Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Call Us Now']), 5, FailureHandling.OPTIONAL)
		 if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 0, FailureHandling.OPTIONAL)) {
		 Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 5, FailureHandling.OPTIONAL)
		 } else {
		 Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Later']), 5, FailureHandling.OPTIONAL)
		 }*/


		'Check if Logout page available'

		Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Login']), 0, FailureHandling.OPTIONAL)

		Mobile.verifyElementExist(findTestObject('Dashboard_Login/User_name', [('text') : findTestData('Different_User').getValue(
			'Name', i)]), 0, FailureHandling.OPTIONAL)

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
		/*Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No',
		 i)]), 0, FailureHandling.CONTINUE_ON_FAILURE)*/

		'Tap on Convert Currency'
		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)
	}
}