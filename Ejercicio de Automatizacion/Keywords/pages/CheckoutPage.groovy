package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class CheckoutPage {
	def enterShippingInformation(String firstName, String lastName, String postalCode) {
		WebUI.setText(findTestObject('CheckoutPage/Page_Swag Labs/input_Name'), 'Marjhory')
		WebUI.setText(findTestObject('CheckoutPage/Page_Swag Labs/input_lastName'), 'De Los Santos')
		WebUI.setText(findTestObject('CheckoutPage/Page_Swag Labs/input_postalCode'), '91002')
		WebUI.click(findTestObject('CheckoutPage/Page_Swag Labs/btn_Continue'))
	}

	def validateProductInCheckout(String expectedName, String expectedPrice) {
		String checkoutName = WebUI.getText(findTestObject('Overview/Page_Swag Labs/lbl_CheckoutName'))
		String checkoutPrice = WebUI.getText(findTestObject('Overview/Page_Swag Labs/lbl_CheckoutPrice'))

		if (checkoutName == expectedName && checkoutPrice == expectedPrice) {
			println("Artículo y precio correctos en la factura")
		} else {
			println("Artículo o precio incorrecto en la factura")
		}
	}

	def finishPurchase() {
		WebUI.click(findTestObject('Overview/Page_Swag Labs/btn_Finish'))
	}
}
