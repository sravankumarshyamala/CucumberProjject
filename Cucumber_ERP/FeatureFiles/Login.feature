Feature: 
Adding suppiler in stock accounting application
@tag1
@supplier
Scenario Outline: 
Adding multiple supplier in stock accounting application
Given launch browser as
When launch url
When wait for username with "name" and "username" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@name='password']" and "master"
When Click on login with "xpath" and "//button[text()='Login']"
When Wait for supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]" and "10"
When Click supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]" 
When Wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When Click on AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for supplier number with "name" and "x_Supplier_Number" and "10"
When Capature Supplier number with "name" and "x_Supplier_Number"
When Enter in "<suppliername>" with "name" and "x_Supplier_Name"
When Enter in "<address>" with "xpath" and "//textarea[@id='x_Address']"
When Enter in "<city>" with "xpath" and "//input[@id='x_City']"
When Enter in "<country>" with "xpath" and "//input[@id='x_Country']"
When Enter in "<cperson>" with "xpath" and "//input[@id='x_Contact_Person']"
When Enter in "<pnumber>" with "xpath" and "//input[@id='x_Phone_Number']"
When Enter in "<mail>" with "xpath" and "//input[@id='x__Email']"
When Enter in "<mnumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
When Enter in "<note>" with "xpath" and "//textarea[@id='x_Notes']"
When Click Add button with "id" and "btnAction"
When Wait for confirmOk button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When Click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for Alert ok button with "xpath" and "(//button[contains(text(),'OK')])[6]" and "10"
When Click on Alert ok button with "xpath" and "(//button[contains(text(),'OK')])[6]"
When Verify Suppliernumber
When Click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples:
|suppliername|address|city|country|cperson|pnumber|mail|mnumber|note|
|Testing1|LBNagar|Hyderabad|India|sravan|9948295941|sravan@gmail.com|9985422994|i am sravan|

@tag2
@customer
Scenario Outline:
Validate Customer with multiple data
Given launch browser as
When launch url
When wait for username with "name" and "username" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@name='password']" and "master"
When Click on login with "xpath" and "//button[text()='Login']"
When Wait for Customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]" and "10"
When Click Customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]" 
When Wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When Click on AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for Customer number with "name" and "x_Customer_Number" and "10"
When Capature Customer number with "name" and "x_Customer_Number"
When Enter in "<Customername>" with "name" and "x_Customer_Name"
When Enter in "<address>" with "xpath" and "//textarea[@id='x_Address']"
When Enter in "<city>" with "xpath" and "//input[@id='x_City']"
When Enter in "<country>" with "xpath" and "//input[@id='x_Country']"
When Enter in "<cperson>" with "xpath" and "//input[@id='x_Contact_Person']"
When Enter in "<pnumber>" with "xpath" and "//input[@id='x_Phone_Number']"
When Enter in "<mail>" with "xpath" and "//input[@id='x__Email']"
When Enter in "<mnumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
When Enter in "<note>" with "xpath" and "//input[@id='x_Notes']"
When Click Add button with "id" and "btnAction"
When Wait for confirmOk button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When Click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for Alert ok button with "xpath" and "(//button[contains(text(),'OK')])[6]" and "10"
When Click on Alert ok button with "xpath" and "(//button[contains(text(),'OK')])[6]"
When Verify Customernumber
When Click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples:
|Customername|address|city|country|cperson|pnumber|mail|mnumber|note|
|sravan|H-NO:1-6-119/A|Hyderabad|india|kumar|9948295941|sravan@gmail.com|9985422994|i am sravan|

