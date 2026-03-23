import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import org.openqa.selenium.Keys

// ===== Khai báo TestObject =====
TestObject firstNameObj  = findTestObject('Profile/Profile/input_First name_first_name')
TestObject lastNameObj   = findTestObject('Profile/Profile/input_Last name_last_name')
TestObject bioObj        = findTestObject('Profile/Profile/input_Bio')
TestObject websiteObj    = findTestObject('Profile/Profile/input_Website_website_url')
TestObject usernameObj   = findTestObject('Profile/Profile/input_Username_username')
TestObject saveBtn       = findTestObject('Profile/Profile/button_Save')

// ===== Hàm clear + set text =====
def clearAndSet(TestObject obj, String value) {
    WebUI.click(obj)
    WebUI.sendKeys(obj, Keys.chord(Keys.CONTROL, 'a'))
    WebUI.sendKeys(obj, Keys.chord(Keys.DELETE))

    if (value != null && value.trim() != '') {
        WebUI.setText(obj, value)
    }
}

// ===== Nhập dữ liệu từ Data Binding =====
clearAndSet(firstNameObj, FirstName)
clearAndSet(lastNameObj, LastName)
clearAndSet(bioObj, Bio)
clearAndSet(websiteObj, WebsiteURL)
clearAndSet(usernameObj, Username)

// ===== Click nút Save (áp dụng cho tất cả test data đã nêu) =====
WebUI.click(saveBtn)

// ===== Verify kết quả =====
WebUI.verifyTextPresent(Expected_msg, false)
