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

WebUI.waitForPageLoad(30)

WebUI.check(findTestObject('retailer admin All Repo/menu list/menuopen (1)'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/My profile option'))

WebUI.waitForPageLoad(50)

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/menu list/Edit profile button'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('retailer admin All Repo/menu list/Edit profile button'), 30)

WebUI.click(findTestObject('retailer admin All Repo/menu list/Edit profile button'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/h4_RETAILER ADMIN'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/h4_RETAILER ADMIN'), 'RETAILER ADMIN')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/label_RETAILER NAME'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_EDIT PROFILE_fname'), 'RACreation')

WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_EDIT PROFILE_usr_lastnam'), 'RACreation')

WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_racreation10_9getnada.co'), '(346) 363-5735')

WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/button_UPDATE PROFILE'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/span_OK_addRetailerCloseDrawer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(90)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen (1)'))

not_run: WebUI.check(findTestObject('retailer admin All Repo/menu list/menuopen'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/Page_AppCohesion/a_Rule'))

not_run: WebUI.mouseOver(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/shipping cost'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'), findTestObject(
        'retailer admin All Repo/menu list/Preferred Distributor'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/check appco'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/check appco'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/distance'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/distance'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/opt check distance'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.check(findTestObject('retailer admin All Repo/menu list/opt check distance'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/distance'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/distance'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/Page_AppCohesion/h4_Shipping Cost'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/Page_AppCohesion/h4_Shipping Cost'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/FFL cost'), '150')

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/Non FFL cost'), '250')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/update rule button'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/update rule button'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/menuopen'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/change password'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/change password'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/old password'))

WebUI.setText(findTestObject('retailer admin All Repo/menu list/old password'), 'RACreation@10_9')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/new password'))

WebUI.setText(findTestObject('retailer admin All Repo/menu list/new password'), 'RAChange@10_9')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/confirm password'))

WebUI.setText(findTestObject('retailer admin All Repo/menu list/confirm password'), 'RAChange@10_9')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/change pwd button'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/change pwd button'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/login now'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/login now'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_User Name_ac_username'), 'RACreation@10_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'RAChange@10_9')

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/button_Login Now'))

WebUI.waitForPageLoad(30)

