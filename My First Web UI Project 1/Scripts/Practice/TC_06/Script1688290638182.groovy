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

int currentTab
String title

// Step 1: Open browse then open URLs
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com')

WebUI.maximizeWindow()

currentTab = WebUI.getWindowIndex()

assert WebUI.getUrl() == 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'

// Step 2: Click  link 'OrangeHRM, Inc.' and verify refirect to HRM page (url and title) 
WebUI.click(findTestObject('opensource-demo/Page_Login/link_OrangeHRM'))
WebUI.switchToWindowIndex(currentTab + 1)
assert WebUI.getUrl() == 'https://www.orangehrm.com/'
String title = WebUI.getWindowTitle()
WebUI.verifyEqual(title.contains('OrangeHRM HR Software'),true)

WebUI.closeBrowser()
