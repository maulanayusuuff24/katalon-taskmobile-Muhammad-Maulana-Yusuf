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

Mobile.tap(findTestObject('Object Repository/Mobile App/TextView - Category'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.TextView - Electronics  Gadgets'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile App/android.widget.TextView - Electronics  Gadgets (1)'), 
    'Electronics & Gadgets')

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.ImageButton-Back'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.TextView - Fashions'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.ImageButton-Back'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.TextView - Baby Gear'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.ImageButton-Back'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.TextView - Home  Furniture'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.ImageButton-Back'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.TextView - Health  Sports'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.ImageButton-Back'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.TextView - Office  Industry'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile App/android.widget.ImageButton-Back'), 0)

