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

WebUI.setText(findTestObject('Object Repository/Follow/Follow_01_02/input_UsernameSearch'), 'Namiiiah0905')

WebUI.sendKeys(findTestObject('Object Repository/Follow/Follow_01_02/input_UsernameSearch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Follow/Follow_01_02/div_Bt_Filter'))

WebUI.click(findTestObject('Object Repository/Follow/Follow_01_02/div_Profiles'))

WebUI.click(findTestObject('Object Repository/Follow/Follow_01_02/div_Apply'))

WebUI.click(findTestObject('Object Repository/Follow/Follow_01_02/div_Profile'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Follow/Follow_01_02/div_Bt_Follow'), 5)

