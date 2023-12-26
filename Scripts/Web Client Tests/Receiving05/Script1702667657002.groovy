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


//Open Browser
WebUI.openBrowser('')

//Navigate to URL
WebUI.navigateToUrl('https://icsus-qa01.oraclecloud.rfsmart.com:8443/webclient/')

//Enter Username
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_Username'), 'dev.one')

//Enter Password
WebUI.setEncryptedText(findTestObject('Object Repository/WebClient_RF-SMART/txt_password'), 'UAHdl0l4+Bq3CwnfK3WMeA==')

//Click Enter button
WebUI.click(findTestObject('Object Repository/WebClient_RF-SMART/btn_Enter'))

//Select Workflow Suite
WebUI.click(findTestObject('Object Repository/WebClient_RF-SMART/lnk_QA Regression'))

//Select link for Receiving 05
WebUI.click(findTestObject('Object Repository/WebClient_RF-SMART/lnk_Receiving05'))

//Enter Org
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), '001')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Enter Purchase Order Number
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_CollectOrder'), '146367')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Enter Packing Slip Number
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_CollectPackingSlip'), '8675309')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Enter Item Number
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_CollectItemNumber'), 'AS65001')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Enter Item Quantity
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_qty'), '1')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Enter Unit of Measure
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_UOM'), 'Bx 4')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Enter Subinventory
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_subinventory'), 'Stores')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Enter Locator
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_locator'), '1.1.1.1')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Enter Quantity of Labels
WebUI.setText(findTestObject('Object Repository/WebClient_RF-SMART/txt_labelqty'), '1')

//Click Enter key
WebUI.sendKeys(findTestObject('Object Repository/WebClient_RF-SMART/txt_org'), Keys.chord(Keys.ENTER))

//Click List button
WebUI.click(findTestObject('Object Repository/WebClient_RF-SMART/btn_List'))

//Select Printer from list
WebUI.click(findTestObject('Object Repository/WebClient_RF-SMART/option_Label Printer'))

//Click Exit link
WebUI.click(findTestObject('Object Repository/WebClient_RF-SMART/btn_Exit'))

//Close Browser
WebUI.closeBrowser()