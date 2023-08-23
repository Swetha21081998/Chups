Feature: Kiosk Portal 
@TC001
Scenario: User enters with valid username & password.
Given User should launch the browser.
When  Enter the valid user name "anwaiter2@qa.com".
And Enter the valid password "welcome".
And User should click on the login button.
Then User should land on the brand listing page.


@TC002
Scenario: User enters with Invalid username & password.
Given User should launch the browser.
When  Enter the Ivalid user name "anwaitr2@qa.com".
And Enter the Ivalid password "elcome".
And User should click on the login button.
Then User should see the error message.


@TC003
Scenario: User should add the items to cart(with size, quantity & spl instruction).
Given User should click on the brands.
And User will be on the menu listing page.
When User should select the food using the add button.
And User should select the size.
And user should enter the special instruction.
And user should increase the quantity.
And User should click on add to cart button.
And User should click on the place order button.
Then User should navigate to the chechout page.


@TC004
Scenario: User should add the items to cart(without size quantity & spl instruction).
Given User should click on the brands.
And User will be on the menu listing page.
When User should select the food using the add button.
And User should click on add to cart button.
And User should click on the place order button.
Then User should navigate to the chechout page.

@TC005
Scenario: User should click on the continueshopping button.
Given User should be on the checkout page.
When User should click on the continueshopping button.
And User should land to the brand menu listing page.
And User should search the food item, "Fresh Milk".
And Add freshmilk to the cart.
And Click place order button.
Then User should navigate to the checkout page.

@TC006
Scenario: User should be able to Place the order.
Given User should be on the checkout page.
When User should click on the pickup button.
And User should the name.
And User should enter the email.
And User enter the mobile num.
And User should click on the make payment.
Then Order palced message has been displayed.











