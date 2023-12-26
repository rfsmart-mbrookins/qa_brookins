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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ebmm-test.login.us2.oraclecloud.com/')

WebUI.setText(findTestObject('Object Repository/OracleObjects/input_userid'), 'dev.one')

WebUI.setEncryptedText(findTestObject('Object Repository/OracleObjects/input_password'), 'UAHdl0l4+Bq3CwnfK3WMeA==')

WebUI.click(findTestObject('Object Repository/OracleObjects/btn_Sign In'))

WebUI.click(findTestObject('Object Repository/OracleObjects/btn_menudropdown'))

WebUI.click(findTestObject('Object Repository/OracleObjects/div_Procurement'))

WebUI.click(findTestObject('Object Repository/OracleObjects/span_PurchaseOrders'))

WebUI.click(findTestObject('Object Repository/OracleObjects/btn_tasklist'))

WebUI.click(findTestObject('Object Repository/OracleObjects/lnk_CreateOrder'))

//WebUI.click(findTestObject('Object Repository/OracleObjects/lnk_ManageOrders'))

//ProcurementBU options 0 Dev1, 1 QA, 2 US

WebUI.selectOptionByValue(findTestObject('Object Repository/OracleObjects/dd_ProcurementBU'),'2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OracleObjects/dd_ReqBU'),'2', true)

WebUI.setText(findTestObject('Object Repository/OracleObjects/txt_Supplier'),'Mid')

WebUI.click(findTestObject('Object Repository/OracleObjects/dd_Option_Midtown Computer Supplies 10001'))

WebUI.click(findTestObject('Object Repository/OracleObjects/btn_Create'))

WebUI.click(findTestObject('Object Repository/OracleObjects/btn_AddPOLine'))

WebUI.setText(findTestObject('Object Repository/OracleObjects/txt_ItemNum'),'AS65001')

WebUI.click(findTestObject('Object Repository/OracleObjects/txt_POLineQty'))
WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/OracleObjects/txt_POLineQty'), '10')

WebUI.setText(findTestObject('Object Repository/OracleObjects/txt_ReqDate'), '01/01/2025')

WebUI.click(findTestObject('Object Repository/OracleObjects/btn_SubmitPO'))

WebUI.verifyTextPresent("submitted for approval.",true)

//View PO Created
WebUI.click(findTestObject('Object Repository/OracleObjects/btn_tasklist'))

WebUI.click(findTestObject('Object Repository/OracleObjects/lnk_ManageOrders'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OracleObjects/dd_ProBU'),'3', true)

WebUI.click(findTestObject('Object Repository/OracleObjects/btn_Search'))



