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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pinterest.com/')

WebUI.click(findTestObject('Object Repository/Login/Login/div_Log in'))

WebUI.setText(findTestObject('Object Repository/Login/Login/input_Email_email'), 'nhitam0905@gmail.com')

WebUI.setText(findTestObject('Object Repository/Login/Login/input_Password'), 'C0123456789')

WebUI.click(findTestObject('Object Repository/Login/Login/div_Log in_1'))

WebUI.click(findTestObject('Settings/Settings_01/div_Bt_Settings'))

WebUI.click(findTestObject('Settings/Settings_01/div_Settings'))

WebUI.click(findTestObject('Settings/Settings_02_03/div_Account management'))

WebUI.click(findTestObject('Object Repository/Settings/Settings_05_06/button_Change'))

WebUI.setText(findTestObject('Settings/Settings_05_06/input_OldPassword'), 'T123')

WebUI.setText(findTestObject('Settings/Settings_05_06/input_NewPassword'), 'T123456789')

WebUI.click(findTestObject('Object Repository/Settings/Settings_05_06/button_Change Password'))

WebUI.verifyTextPresent('Your old password was entered incorrectly. Please enter it again.', false)

