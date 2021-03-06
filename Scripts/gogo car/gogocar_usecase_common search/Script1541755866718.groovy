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

WebUI.openBrowser('https://qa.gogocar.com/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/span_GOT IT (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/new use case_common search/span_GOT IT (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/div_Cars_md-thumb md-ink-rippl'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/new use case_common search/div_Cars_md-thumb md-ink-rippl'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_SIGN IN  SIGN UP (1)'))

WebUI.delay(10)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/a_Sign Up'), 
    5)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/a_Sign Up'))

int rn_email

rn_email = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_email (1)'), ('sss' + rn_email) + 
    '@getnada.com')

//WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_email (1)'), 'sss11@getnada.com')
WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_password (1)'), 'sss@123')

WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_firstname'), 'sss')

WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_lastname'), 'sss')

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_I hearby accept the terms'))

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_Sign Up'))

WebUI.delay(10)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'), 10)

WebUI.dragAndDropToObject(findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'), findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'))

not_run: WebUI.waitForElementPresent(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/li_Search'), 
    10)

WebUI.dragAndDropToObject(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/li_Search'), findTestObject(
        'gogo user journey/new use case_common search/Page_GoGoCar/li_Search'))

WebUI.delay(5)

WebUI.dragAndDropToObject(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_World Volkswagen of Nept'), 
    findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_World Volkswagen of Nept'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(15)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_Search_search_bar_input'), 
    1)

//WebUiBuiltInKeywords.sendKeys(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_Search_search_bar_input'), 
// 'Acura ILX 2017')
WebUI.sendKeys(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_Search_search_bar_input'), 
    'Acura ILX 2017')

not_run: WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/input_SIGN IN  SIGN UP_search_'), 
    'Acura ILX 2017')

WebUI.delay(5)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Acura ILX  New car Starts'), 
    10)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Acura ILX  New car Starts'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_2019 Acura ILX wTech  Acur'), 
    5)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_2019 Acura ILX wTech  Acur'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_2019  Acura ILX wTech'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h2_Acura of Brooklyn NY  7853'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_VIN 19UDE2F77KA000076'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_VIN 19UDE2F77KA000076'), 
    'VIN# 19UDE2F77KA000076')

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_STOCK 429348'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_STOCK 429348'), 'STOCK# 429348')

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_GoGoCar Price'), 
    2)

not_run: WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h2_30545'), '$30545', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_MSRP Price'))

not_run: WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h4_30545'), '$30545', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/div_EXPLORE FURTHER'), 3)

WebUI.click(findTestObject('gogo user journey/new use case_common search/div_EXPLORE FURTHER'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.dragAndDropToObject(findTestObject('gogo user journey/new use case_common search/div_EXPLORE FURTHER'), findTestObject(
        'gogo user journey/new use case_common search/div_EXPLORE FURTHER'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/div_Proceed Skip Tradein'), 5)

WebUI.click(findTestObject('gogo user journey/new use case_common search/div_Proceed Skip Tradein'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Please provide your ZIP'), 
    5)

WebUI.setText(findTestObject('gogo user journey/new use case_common search/input_Please provide your ZIP'), '11210')

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/button_Please provide your ZIP'), 
    3)

WebUI.click(findTestObject('gogo user journey/new use case_common search/button_Please provide your ZIP'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/b_Pay in Cash'), 3)

WebUI.click(findTestObject('gogo user journey/new use case_common search/b_Pay in Cash'))

WebUI.delay(15)

not_run: WebUI.clearText(findTestObject('gogo user journey/new use case_common search/input__userCity'))

WebUI.clearText(findTestObject('gogo user journey/new use case_common search/input__zipcode'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_First Name'), 1)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Last Name'), 1)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Email (optional)'), 2)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Street Number'), 2)

WebUI.setText(findTestObject('gogo user journey/new use case_common search/input__streetnumber'), '3111')

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Present Address'), 2)

WebUI.setText(findTestObject('gogo user journey/new use case_common search/input__Address'), '3111  Heliport Loop')

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Present State'), 2)

WebUI.selectOptionByValue(findTestObject('gogo user journey/new use case_common search/select_ALAKAZARCACOCTDEFLGAHII'), 
    'NY', true)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Present City'), 2)

WebUI.setText(findTestObject('gogo user journey/new use case_common search/input__userCity'), 'Brooklyn')

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Present Zip'), 2)

WebUI.setText(findTestObject('gogo user journey/new use case_common search/input__zipcode'), '11210')

WebUI.delay(15)

WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/div_CONTINUE'), 2)

WebUI.click(findTestObject('gogo user journey/new use case_common search/div_CONTINUE'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/a_2019AcuraILXwTech  Acura of'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_ 30545'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_ 30545'))

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_GoGoCar Grand Total'))

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_ 30545'))

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How long do you plan on ke'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/select_Less than 5 years More'), 
    '1', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How many miles per year do'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/select_Less than 10000  More t'), 
    '1', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Where do you plan on havin'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/md-radio-button_ Your own mech'))

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How do you plan on using t'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/md-radio-button_ Personal'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How often do you plan on h'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/md-radio-button_ Yearly'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Do you have any service or'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/md-radio-button_ Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE (1)'))

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Pickup Appointment     No'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/a_Schedule'))

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/a_Schedule'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Pick-up Date'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_Pick-up Date_pickdate'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_Pick-up Date_pickdate'), 
    '11-23-2018')

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/i_Close_glyphicon glyphicon-ca'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Pick-up Time'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/i_Time required_glyphicon glyp_1'))

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/i_Time required_glyphicon glyp_1'))

WebUI.delay(10)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/ul_'), 
    3)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Time required_form-contr'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.focus(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Time required_form-contr'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.dragAndDropToObject(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Time required_form-contr'), 
    findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Time required_form-contr'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.clearText(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Time required_form-contr'))

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Time required_form-contr'), 
    '11', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input__form-control text-cente'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.focus(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input__form-control text-cente'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.dragAndDropToObject(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input__form-control text-cente'), 
    findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input__form-control text-cente'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input__form-control text-cente'), 
    '30', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_PM'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_PM'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_AM'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_AM'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_OK'))

WebUI.delay(10)

WebUI.click(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/div_CONTINUE (1)'))

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/div_CONTINUE (1)'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/div_CONTINUE (1)'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h3_2019 Acura ILX wTech'))

WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h3_2019 Acura ILX wTech'), 
    '2019 Acura ILX w/Tech', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_VIN 19UDE2F77KA000076'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_VIN 19UDE2F77KA000076'), 
    'VIN# 19UDE2F77KA000076', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_STOCK 429348'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_STOCK 429348'), 'STOCK# 429348', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h2_30545 (1)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Page_GoGoCar/h2_30545'), '')

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_Type'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h4_Sedan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h4_Sedan'), 'Sedan', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_Complete'))

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_Complete'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Thank you'))

WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Thank you'), 'Thank you!')

