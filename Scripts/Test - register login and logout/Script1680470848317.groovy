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

WebUI.navigateToUrl('http://54.237.50.114:3000/')

WebUI.click(findTestObject('Object Repository/Page_Fondre/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Document/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Registration_RegUsername'), Username)

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Username_RegEmail'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Email_RegPassword'), Password)

WebUI.click(findTestObject('Object Repository/Page_Document/button_Register'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Document/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Login_Email'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Email_Password'), Password)

WebUI.click(findTestObject('Object Repository/Page_Document/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Fondre/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Document/svg_Close-outline-f21'))

WebUI.closeBrowser()

