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
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import java.text.DecimalFormat

import internal.GlobalVariable

public class numpad {
	public static enterNumpad (String digits) {
		int digit_length = digits.length()

		for (int i = digit_length-6; i < digit_length; i++) {
			enterDigit (digits[i])
			Mobile.delay(1)
		}
	}

	// using dynamic element, they share the same tag
	private static enterDigit (String pin) {
		Mobile.delay(10)
		Mobile.tap(findTestObject('Calc_Numpad/android.widget.TextView - ' + pin), 10, FailureHandling.CONTINUE_ON_FAILURE)
	}



}

public class calc {
	public static enterNumpad (String digits) {
		int digit_length = digits.length()

		for (int i = 0; i < digit_length; i++) {
			enterDigit (digits[i])
			Mobile.delay(1)
		}
	}

	// using dynamic element, they share the same tag
	private static enterDigit (String pin) {

		Mobile.delay(10)
		Mobile.tap(findTestObject('Calc_Numpad/android.widget.TextView - ' + pin), 10, FailureHandling.CONTINUE_ON_FAILURE)
	}


}

public class OTP{

	public static enterOTP(String digits) {
		int digit_length = digits.length()

		for (int i = digit_length-6; i < digit_length; i++) {
			enterDigit (digits[i])
			Mobile.delay(1)
		}

	}

	private static enterDigit (String pin) {
		Mobile.tap(findTestObject('OTP_Number/Button_' + pin), 10)
	}

}

public class Currency_Calculator{

	public static enterCurrency(String digits) {
		int number_length = digits.length()


		for (int i = 0; i < number_length; i++) {
			enterDigit_1 (digits[i])
			Mobile.delay(1)
		}

	}

	private static enterDigit_1 (String pin) {
		Mobile.delay(3)
		Mobile.tap(findTestObject('OTP_Number/Button_' + pin), 10, FailureHandling.CONTINUE_ON_FAILURE)
	}




	public static roundCurrency(String currency_TextMsg, String Amount_Covert) {

		double forex = Double.valueOf(currency_TextMsg)

		double amount = Double.valueOf(Amount_Covert)

		double forex1 = amount / forex

		DecimalFormat decimalFormat = new DecimalFormat("#0.00");

		String roundedNumber = decimalFormat.format(forex1);

		return roundedNumber
	}

	public static Currency_Numpad(String digits) {

		int digit_length = digits.length()

		for(int i=0;i<digit_length;i++) {

			if((digits[i])=='1') {

				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 1'), 5, FailureHandling.OPTIONAL)
			}
			else if((digits[i])=='2') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 2'), 5, FailureHandling.OPTIONAL)
			}
			else if((digits[i])=='3') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 3'), 5, FailureHandling.OPTIONAL)
			}

			else if((digits[i])=='4') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 4'), 5, FailureHandling.OPTIONAL)
			}
			else if((digits[i])=='5') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 5'), 5, FailureHandling.OPTIONAL)
			}
			else if((digits[i])=='6') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 6'), 5, FailureHandling.OPTIONAL)
			}
			else if((digits[i])=='7') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 7'), 5, FailureHandling.OPTIONAL)
			}
			else if((digits[i])=='8') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 8'), 5, FailureHandling.OPTIONAL)
			}
			else if((digits[i])=='9') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 9'), 5, FailureHandling.OPTIONAL)
			}
			else if((digits[i])=='0') {
				Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.TextView - 0'), 5, FailureHandling.OPTIONAL)
			}
		}


		Mobile.tap(findTestObject('Object Repository/Calc_Pad/android.widget.Image'), 5, FailureHandling.OPTIONAL)
	}

	public static remove_Amount(String digits) {

		int digit_length = digits.length()


		for (int i = 0; i < digit_length; i++) {

			Mobile.tap(findTestObject('Object Repository/SOW2-Market Order/Remove_amount'), 5, FailureHandling.OPTIONAL)

			Mobile.delay(1)
		}
	}

}




