import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://app-qa.appcohesion.io/')

WebUI.setText(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/input_User Name_ac_username'), 'NewRetailerB@7_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'NewRetailerB@7_9')

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/i_Inventory by Distributor'))

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/div_Inventory'))

WebUI.setText(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/input__productname'), 'RUGER-UCSR7GCZ')

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/img__searchproduct'))

WebUI.setText(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/input_Pistols_markup0'), '12.9')

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/button_AddUpdate'))

WebUI.verifyTextPresent('SUCCESS', true)

WebUI.verifyTextPresent('Markup updated successfully.', true)

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/span_OK'))

