package retailfx
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectXpath
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import io.appium.java_client.MobileDriver as MobileDriver
import io.appium.java_client.MobileElement as MobileElement
import org.openqa.selenium.WebElement as WebElement
import java.text.DecimalFormat as DecimalFormat

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Validation {
	// This is to compare if the string pulled from the element contains the expected string
	public static checkContainString(String pulledString, String expectedString) {
		if (pulledString.contains(expectedString))
			return true
		else
			return false
	}

	// This is to perform child element count under a parent element on any page as long as they share the same xpathValue
	// Applicable for Accounts, Cards page
	// To be reworked when new resource_id is introduced to the navigation screen
	public static countChildElement(String childClass) {
		// default parent container directory
		String parentContainerView = '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup['

		// declaring the following the default child nodes under the parent container
		// childAccountView = Image object of the container, childType = Text object of the product type, childNum = Text object of the number, childAmount = Text object of the balance
		String childContainerView = 'android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView[1]'
		String childType = 'android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]'
		String childNum = 'android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[2]'
		String childAmount = 'android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[3]'

		// this class returns an integer value indicating number of elements found
		int count = 0

		// declare mobile drivers to look for elements by className and xpathValue
		MobileDriver mb = MobileDriverFactory.getDriver()

		// declare counters
		int childIndex = 1
		int childCount = 1

		// declare the parent path from xpathValue
		String parentPath = parentContainerView+childCount+']'

		// declare that the path exists and will go through validation
		Boolean pathExist = true

		// perform search element based on xpathValue with format parent_url/child_node[index]
		while (pathExist == true) {
			// find child element using this function will return a list
			List <WebElement> childCheck = mb.findElementsByXPath(parentPath+'/'+childClass+'['+childIndex+']')
			// if child element exists it will not return empty list (condition != [])
			if (childCheck != []) {
				childCount+=1
				parentPath = parentContainerView+childCount+']'
			}
			/* if child element doesn't exist it will return empty list (condition == [])
			 returning childCount - 1 when not found as we don't include the counter to search for next child node */
			else {
				pathExist = false
				childCount-=1
			}
		}

		return childCount
	}

	public static checkElementExists(String testObject) {
		// perform check if the element existed
		Boolean checkExist = Mobile.verifyElementExist(findTestObject(testObject), 30, FailureHandling.OPTIONAL)

		return checkExist
	}

	public static convertUSDToMYR(String currency_TextMsg)
	{


		println('This is' + currency_TextMsg)

		currency_TextMsg = currency_TextMsg.replace('USD 1 = MYR ', '')

		double forex = Double.valueOf(currency_TextMsg)

		double forex1 = 50.00 / forex

		DecimalFormat decimalFormat = new DecimalFormat('#,###.00')

		String roundedNumber = decimalFormat.format(forex1)

		return roundedNumber



	}

	public static convertGBPToMYR(String currency_TextMsg)
	{
		println('This is' + currency_TextMsg)

		currency_TextMsg = currency_TextMsg.replace('GBP 1 = MYR ', '')

		double forex = Double.valueOf(currency_TextMsg)

		double forex1 = 50.00 / forex

		DecimalFormat decimalFormat = new DecimalFormat('#,###.00')

		String roundedNumber = decimalFormat.format(forex1)

		return roundedNumber

	}

	public static convertMYRtoUSD(String currency_TextMSG)
	{

		println('This is' + currency_TextMSG)

		currency_TextMSG = currency_TextMSG.replace('USD 1 = MYR ', '')

		double forex = Double.valueOf(currency_TextMSG)

		double forex1 = 10.00 * forex

		DecimalFormat decimalFormat = new DecimalFormat('#,###.00')

		String roundedNumber = decimalFormat.format(forex1)

		return roundedNumber
	}


	public static staffConvertUSDToMYR(String currency_TextMsg, double amountTOConver)
	{
		//def currency_TextMsg = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		println('This is' + currency_TextMsg)

		currency_TextMsg = currency_TextMsg.replace('USD 1 = MYR ', '')

		double forex = Double.valueOf(currency_TextMsg)

		double forex1 = amountTOConver / forex

		DecimalFormat decimalFormat = new DecimalFormat('#,###.00')

		String roundedNumber = decimalFormat.format(forex1)

		return roundedNumber



	}

	public static staffConvertMYRtoUSD(String currency_TextMSG, double amountToConvert)
	{

		println('This is' + currency_TextMSG)

		currency_TextMSG = currency_TextMSG.replace('USD 1 = MYR ', '')

		double forex = Double.valueOf(currency_TextMSG)

		double forex1 = 10.00 * forex

		DecimalFormat decimalFormat = new DecimalFormat('#,###.00')

		String roundedNumber = decimalFormat.format(forex1)

		return roundedNumber
	}

	public static staffConvertMYRToGBP(String currency_TextMsg, double amountTOConver)
	{
		//def currency_TextMsg = Mobile.getText(findTestObject('General/android.widget.TextView _Conversion'), 0, FailureHandling.CONTINUE_ON_FAILURE)

		println('This is' + currency_TextMsg)

		currency_TextMsg = currency_TextMsg.replace('GBP 1 = MYR ', '')

		double forex = Double.valueOf(currency_TextMsg)

		double forex1 = amountTOConver / forex

		DecimalFormat decimalFormat = new DecimalFormat('#,###.00')

		String roundedNumber = decimalFormat.format(forex1)

		return roundedNumber



	}

	public static scrolltoG1AAccount(String Account_No)
	{
		for (int i = 0; i < 3; i++) {

			if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.OPTIONAL))
			{
				Mobile.delay(2)
				Mobile.takeScreenshot()
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : '9000 0001 8837']), 0, FailureHandling.CONTINUE_ON_FAILURE)
				break;

			}
			else
			{
				scrollFromTopToBottom()
			}

		}

	}


	public static scrollFromTopToBottom() {
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

	public static datetime() {

		LocalDateTime myDateObj = LocalDateTime.now()

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("d MMM yyyy HH:mm:ss")

		String formattedDate = myDateObj.format(myFormatObj)

		return formattedDate

	}

	public static Terms_Condition() {

		Boolean check_terms = Mobile.verifyElementExist(findTestObject('Object Repository/SOW2-Market Order/Agreement/android.widget.TextView - Terms  Conditions'), 10, FailureHandling.OPTIONAL)

		if (check_terms == true) {
			scrollFromTopToBottom()

			Mobile.takeScreenshot()

			scrollFromTopToBottom()

			Mobile.takeScreenshot()

			scrollFromTopToBottom()

			Mobile.takeScreenshot()


			'Tap Agree and Confirm'
			Mobile.tap(findTestObject('Global Account Page/android.widget.TextView - Agree  Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)
		} else {
			FailureHandling.CONTINUE_ON_FAILURE
		}
	}

	public static push_notification() {

		/*This function is used to check the Message of push notification*/

		Mobile.openNotifications()

		Mobile.delay(10)

		if (Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'MAE (UAT)']), 0, FailureHandling.OPTIONAL)) {
			Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'MAE (UAT)']), 0, FailureHandling.CONTINUE_ON_FAILURE)

			if (Mobile.verifyElementText(findTestObject('Global Account Page/dynamicText', [('text') : 'Maybank2u: Currency Exchange']),
			'Maybank2u: Currency Exchange', FailureHandling.CONTINUE_ON_FAILURE)) {
				Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Maybank2u: Currency Exchange']), 0, FailureHandling.CONTINUE_ON_FAILURE)

				Mobile.waitForElementNotPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Notifications']), 0, FailureHandling.CONTINUE_ON_FAILURE)

				def Notif_statement = Mobile.getText(findTestObject('Push_Notif/android.widget.TextView - First_Notification'), 0, FailureHandling.CONTINUE_ON_FAILURE)

				Mobile.comment(Notif_statement)

				Mobile.takeScreenshot()

				Mobile.tap(findTestObject('Push_Notif/back_button'), 0, FailureHandling.CONTINUE_ON_FAILURE)
			}
		} else {
			Mobile.closeNotifications()
		}
	}


}