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

// Step 1: Open browse then open URLs
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com')

WebUI.maximizeWindow()

// Step 2: Input username and password
WebUI.setText(findTestObject('opensource-demo/Page_Login/txt_Username'), 'Admin')
WebUI.verifyElementAttributeValue(findTestObject('opensource-demo/Page_Login/txt_Username'), 'value','Admin',1)

WebUI.setText(findTestObject('opensource-demo/Page_Login/txt_Password'), 'admin123')
WebUI.verifyElementAttributeValue(findTestObject('opensource-demo/Page_Login/txt_Password'), 'value','admin123',1)

// Step 3: Click Button Login
WebUI.click(findTestObject('opensource-demo/Page_Login/btn_Login'))

// Step 4: Verify 'Dashboard' menu is selected by default
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/opensource-demo/Page_Dashboard/menu_Dashboard'), 'class', 'oxd-main-menu-item active', 20)

WebUI.closeBrowser()