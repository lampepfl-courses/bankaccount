import bankaccount._
val acct = new BankAccount
acct.deposit(50)
acct.withdraw(20)
acct.withdraw(20)
// The next line will throw an exception because of insufficient funds
acct.withdraw(15)
