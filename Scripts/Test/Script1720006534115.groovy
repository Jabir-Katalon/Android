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

Mobile.startApplication('/Users/mohammedjabir/Downloads/IT Glossary_1.5_Apkpure.apk', true)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.TextView - About App'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - About App'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - MCQs'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - General Computer'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - D. Laser'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - B. Vint Cerf'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - D. All the above'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - C. CtrlE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - A. Keyboard'), 0)

Mobile.scrollToText('Scanner')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Networking'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.TextView - Q1. Computer Network is'), 0)

Mobile.closeApplication()

