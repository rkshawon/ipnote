Its better to use integer values to store the items price and perform arithmetic operations. Developers should never use floating-point numbers to represent monetary values. Floating-point numbers cannot precisely represent all real numbers. As such, floating-point operations cannot precisely represent true arithmetic operations, leading to many surprising situations.
For example, lets say you plan to sell a cup of tea for 1 dollar and 10 cents, $1.10. You have a customer who orders 162 cups. For what amount should you invoice the customer?
1.10 * 162 = 178.20000000000002
You need to apply a rounding function to 178.20000000000002 to get an appropriate invoice amount.
Now, what if you represent the price of a cup of tea in cents? It would be 110 cents, which makes finding the invoice amount much more accurate:
110 * 162 = 17820
All that you have to do now is to divide that number by 100 to display or print the dollar amount:
17820 / 100 = 178.2
Invoice amount: $178.20.
Remember: Store in cents. Display in dollars.

From <https://auth0.com/blog/node-js-and-typescript-tutorial-build-a-crud-api/> 