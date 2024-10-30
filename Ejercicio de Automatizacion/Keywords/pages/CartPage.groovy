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

public class CartPage {
	def validateProductInCart(String expectedName, String expectedPrice) {
		String productName = WebUI.getText(findTestObject('CartPage/Page_Swag Labs/lbl_CartProductPage'))
		String productPrice = WebUI.getText(findTestObject('CartPage/Page_Swag Labs/lbl_CartProductPrice'))

		if (productName == expectedName && productPrice == expectedPrice) {
			println("Artículo y precio correctos en el carrito")
		} else {
			println("Artículo o precio incorrecto en el carrito")
		}
	}

	def proceedToCheckout() {
		WebUI.click(findTestObject('CartPage/Page_Swag Labs/btn_Checkout'))
	}
}


