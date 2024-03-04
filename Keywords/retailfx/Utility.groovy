package retailfx
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.time.Duration
import java.time.LocalTime
import java.time.format.DateTimeFormatter

import com.google.api.client.util.DateTime
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import io.appium.java_client.MobileElement
import io.appium.java_client.MultiTouchAction
import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.touch.WaitOptions

import io.appium.java_client.touch.offset.PointOption

class Utility {
	public static void doubleTap() {

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
}