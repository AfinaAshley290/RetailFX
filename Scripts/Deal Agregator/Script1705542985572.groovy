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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import retailfx.calc as numpad
import retailfx.Validation as Validation
import java.text.DecimalFormat as DecimalFormat
import retailfx.data_to_excel as ExportExcel

Mobile.startExistingApplication('com.maybank2u.life.uat')

for (def row=1; row<=findTestData('Market_Order_Conventional').getRowNumbers(); row++)
{
	int a = 8
	
	
	Mobile.comment('Data Number' + findTestData('Market_Order_Conventional').getValue('Tradable CCY Pair', row))
	
	'Select G1A Account'
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : findTestData('Username_Password').getValue('G1A_Account_No',
					a)]), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'Tap on Convert Currency'
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Convert Currency']), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'Check for the 1st Login'
	checkLinkedDevice = Validation.checkElementExists('Object Repository/Market Order Page/android.widget.TextView - Enter your password')
	
	'Check is there is password page'
	if (checkLinkedDevice == true) {
		'Verify is in Manage Device page'
		Mobile.setText(findTestObject('Object Repository/Dashboard_Login/Onboarding_Login/Password'), findTestData('Username_Password').getValue(
				'Password', a), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)
	
		'Manage Devices page'
		Mobile.takeScreenshot()
	
		'Tap on proceed button'
		Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Continue']), 10, FailureHandling.CONTINUE_ON_FAILURE)
	} else {
		FailureHandling.CONTINUE_ON_FAILURE
	}
	
	Mobile.delay(10)
	
	/*****************************************Markert Order Page*****************************************************************************/
	
	Mobile.comment('Market Order Page')
	
	'Select Currency From'
	CustomKeywords.'utilities.Deal_Agregator.MarketOrder_FromDropdown'(findTestData('Market_Order_Conventional').getValue('Base CCY', row))
	
	'Tap on the Im converting'
	Mobile.tap(findTestObject('SOW2-Market Order/android.widget.TextView _EditText'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	pinNum = findTestData('Market_Order_Conventional').getValue('Amount', row)
	
	Mobile.delay(20)
	
	currency_Numpad(pinNum)
	
	
	
	'Select Currency'
	CustomKeywords.'utilities.Deal_Agregator.sow2market_orderdropdown'(findTestData('Market_Order_Conventional').getValue('Term CCY', row))	
	
	'Verify Exchange Rate'
	Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Exchange Rate']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	
	'Tap Next'
	Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Next']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	/**********************************************************************************************************************************************************/
	
	/*****************************************Account Selection Page*****************************************************************************/
	
	
	Mobile.comment('Account Selection Page')
	
	'Verify Step 2 of 2 page'
	Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	'Verify Account Selection Page'
	Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Step 2 of 2']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	
	
	
	'Tap to get qoute'
	Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Get Quote']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	/**********************************************************************************************************************************************************/
	
	/*****************************************Confirmation Page************************************************************************************************/
	
	Mobile.comment('Confirmation Page')
	
	'Wait for confirmation page to show'
	 Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Confirmation']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	 Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transfer from']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	
	Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)
	
	'Confirm Term & Condition'
	Mobile.tap(findTestObject('SOW2-Market Order/android.view.View - I have read and agree to the BNM Foreign Exchange Rules, I accept the declaration as well as the Terms  Conditions for this transfer'),
		5, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('SOW2-Market Order/android.widget.Dynamic_Button', [('text') : 'Confirm']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	/**********************************************************************************************************************************************************/
	
	/*****************************************Transaction Successful Page************************************************************************************************/
	
	Mobile.comment('Transaction Successful Page')
	
	Mobile.waitForElementPresent(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 5,
		FailureHandling.CONTINUE_ON_FAILURE)
	
	def reference_id = Mobile.getText(findTestObject('Market Order Page/android.widget.TextView - Reference ID'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementExist(findTestObject('Global Account Page/dynamicText', [('text') : 'Transaction Successful']), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.takeScreenshot()
	
	ExportExcel.write_to_excel(row, reference_id)
	
	Mobile.comment(reference_id)
	
	'Tap the Button Done'
	Mobile.tap(findTestObject('Global Account Page/dynamicText', [('text') : 'Done']), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	
}


def currency_Numpad(String digits) {
	
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


