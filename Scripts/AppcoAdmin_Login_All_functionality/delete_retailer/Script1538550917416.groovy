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

WebUI.rightClick(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/input_User Name_ac_username'))

WebUI.setText(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/input_User Name_ac_username'), 
    'surunewadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/input_Password_ac_password'), 
    'MSduNhp+OwRYVoWm2u96PQ==')

WebUI.click(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/a_Retailers              Retai'))

WebUI.click(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/a_Edit Retailer'))

WebUI.click(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/button_Delete'))

WebUI.click(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/button_YES'))

WebUI.click(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/p_Retailer has been deleted su'))

WebUI.click(findTestObject('Object Repository/delete_retailer/delete_retailer/Page_AppCohesion/span_OK'))

