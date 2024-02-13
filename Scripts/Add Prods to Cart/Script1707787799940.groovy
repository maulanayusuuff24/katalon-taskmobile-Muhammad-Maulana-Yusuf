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

Mobile.startApplication('C:\\Users\\Maulana Y\\Downloads\\Android-Solodroid_E-CommerceApp Demo_3.2.0.apk\\Solodroid_E-CommerceApp Demo_3.2.0.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Samsung Galaxy S10 - Black'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/EditText-Product qty'), '1', 0)

Mobile.tap(findTestObject('Object Repository/Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/Button Cart-Kanan Atas'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView - Samsung Galaxy S10 - Black'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - CHECKOUT'), 0)

Mobile.setText(findTestObject('Object Repository/EditText - Your Name'), 'Nama', 0)

Mobile.setText(findTestObject('Object Repository/EditText - Email'), 'nama@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/EditText - Phone Number'), '0811222333', 0)

Mobile.setText(findTestObject('Object Repository/EditText - Your Address'), 'Jalan kemang raya', 0)

Mobile.tap(findTestObject('Object Repository/Shipping'), 0)

Mobile.tap(findTestObject('Object Repository/CheckedTextView - FedEx'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/EditText - Comment'), 'Oke', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/ProcessCheckout-Button'), 0)

Mobile.tap(findTestObject('android.widget.Button - YES'), 0)

Mobile.verifyElementVisible(findTestObject('android.widget.TextView - Thank you for ordering, your order will be review soon, invoice detail will be sent to your email when the order is ready'), 
    0)

Mobile.tap(findTestObject('android.widget.Button - OK'), 0)

