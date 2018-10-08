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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_User Name_ac_username'), 
    'NewRetailerB@7_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'NewRetailerB@7_9')

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/button_Login Now'))

WebUI.verifyElementPresent(findTestObject('retailer_creation_Storecreation/Page_AppCohesion/a_Dashboard              Dashb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/h3_Employees Onboard'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/a_Dashboard              Dashb'), 
    0)

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/h3_Distributors'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/h3_Orders'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/h3_Firearms'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/a_Orders              Orders'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/a_Stores              Stores'))

WebUI.click(findTestObject('retailer_creation_Storecreation/Page_AppCohesion/i_'))

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STORE NAME_name'), 
    'New Retailer Store')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STORE ADDRESS_address'), 
    '3/10, New QA Build')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STORE ADDRESS_address2'), 
    '2/56, New Street lane')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_ZIP CODE_zip'), '24143')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_CITY_city'), 'Newton Falls')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STATE_state'), 'Ohio')

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/span_Default Store_checkmark'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/button_ADD STORE'))

WebUI.click(findTestObject('retailer_creation_Storecreation/Page_AppCohesion/span_OK'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/button_ADD STORE'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/p_Store Name Already Exists.'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/h4_ERROR'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/span_OK'))

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STORE NAME_name'), 
    'Store No FFL')

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/button_ADD STORE'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/p_Store created successfully.'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/h4_SUCCESS'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/span_OK'))

