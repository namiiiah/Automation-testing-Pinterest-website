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

WebUI.click(findTestObject('Search/Search_10/div_Filter'))

WebUI.click(findTestObject('Object Repository/Search/Search_10/input_Videos_Videos'))

WebUI.click(findTestObject('Object Repository/Search/Search_10/div_Apply'))

WebUI.verifyElementPresent(findTestObject('Search/Search_10/div_container1'), 3)

WebUI.click(findTestObject('Object Repository/Search/Search_10/input_Boards_Boards'))

WebUI.click(findTestObject('Object Repository/Search/Search_10/div_Apply'))

WebUI.verifyElementPresent(findTestObject('Search/Search_10/div_container2'), 3)

WebUI.click(findTestObject('Object Repository/Search/Search_10/input_Profiles_Profiles'))

WebUI.click(findTestObject('Object Repository/Search/Search_10/div_Apply'))

WebUI.verifyElementPresent(findTestObject('Search/Search_10/div_container3'), 3)

WebUI.click(findTestObject('Object Repository/Search/Search_10/div_Reset'))

WebUI.click(findTestObject('Object Repository/Search/Search_10/div_Apply'))

WebUI.verifyElementPresent(findTestObject('Search/Search/div_Pin1'), 3)

