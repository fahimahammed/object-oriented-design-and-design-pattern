# object-oriented-design-and-design-pattern

## Lab Experiment List on Object Oriented Analysis and Design
1. Write a Java Program that demonstrate multiple interface/inheritance. You are free to
choose application for demonstrating multiple interface/inheritance.


### 1. Implementation steps of Facade Pattern (with Example)
Lab Assignment-3: Write a Java Program that demonstrate the implementation fo a facade design pattern for a Banking Service with Cheaquing, Saving, and Investment modules. 

##### Description
This is a simple Banking Service implemented using the Façade Design Pattern. BankAccount is an interface & ChequingAccount, SavingAccount & ImvestmentAccount implemented this interface. The BankService class is the Façade Class which provides functionality such as creating accounts, depositing, withdrawing and transferring money. The Customer is the main class which uses the functionality of the banking service & access different types of accounts using the Façade class BankingService.

Expressing thsi in Java can be broken down into steps-
1. Design the interface
2. Implement the interface with one or more classes
3. Create the facade class and wrap the classes that implement the interface
4. Use the facade class to access the subsystem.
