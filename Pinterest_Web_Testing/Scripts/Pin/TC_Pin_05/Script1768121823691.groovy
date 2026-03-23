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

WebUI.click(findTestObject('Pin/Pin_04_05_06/div_Bt_Home'))

WebUI.refresh()

WebUI.click(findTestObject('Pin/Pin_01/div_Pin1'))

WebUI.click(findTestObject('Object Repository/Pin/Pin_04_05_06/button_MoreBoard'))

WebUI.click(findTestObject('Pin/Pin_04_05_06/div_Bt_Create board'))

WebUI.setText(findTestObject('Pin/Pin_04_05_06/input_BoardName'), 'Test')

WebUI.click(findTestObject('Object Repository/Pin/Pin_04_05_06/div_Create'))

WebUI.delay(3)

WebUI.verifyTextPresent('Saved', false)

