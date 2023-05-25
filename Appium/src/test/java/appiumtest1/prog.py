from selenium.webdriver.common.by import By
from selenium.webdriver import Chrome
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

from devtools_ai.selenium import SmartDriver

def _main() -> None:
    """Main driver"""
    driver = webdriver.ChromeDriver()

    chrome_driver = Chrome(service=Service(ChromeDriverManager().install()))
    # Convert chrome_driver to smartDriver
    driver = SmartDriver(chrome_driver, "547331aa0f503c19d99cc591")
    
#driver = webdriver.Chrome(executable_path=chromedriver_path)

# Open a website
driver.get('https://www.google.com')

element=driver.find_element(BY_Name,"q")
element.send_keys("facebook")
# Close the browser
driver.quit()
