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

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    'RUGER-UCSR7GCZ')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/i_Settings_glyphicon glyphicon'))

WebUI.click(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/i_Settings_glyphicon glyphicon'))

WebUI.waitForPageLoad(50)

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/tr_Ruger'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/tr_Ruger'), 'Ruger', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/tr_Ruger'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/h2_Ruger LC LCP'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/h2_Ruger LC LCP'), 'Ruger LC LCP')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_Manufacturer Part Number3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_3701'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_3701'), '3701')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_ManufacturerRuger'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_Ruger'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_Ruger'), 'Ruger')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_DistributorSS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_SS'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_SS'), 'SS')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_UPC736676037018'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_736676037018'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_736676037018'), 
    '736676037018')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_Base Price180.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_180.00'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_180.00'), '$180.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_Retailer Markup0.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_0.00'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_0.00'), '0.00%')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_Amount Payable180.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_180.00_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/strong_180.00_1'), '$180.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/h4_Only 25 left in stock'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/h4_Only 25 left in stock'), 
    'Only 25 left in stock!')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_25'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/span_25'), '25')

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/p_Manufacturer Part 3701UPC 73'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/p_Manufacturer Part 3701UPC 73'), 
    'Manufacturer Part: 3701UPC: 736676037018', FailureHandling.CONTINUE_ON_FAILURE)

