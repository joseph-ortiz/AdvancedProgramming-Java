package InClassRunnable;

import java.util.Random;

/**
A withdraw runnable makes periodic withdrawals from a bank account.
*/
public class DepositRunnable implements Runnable
{
private static final int DELAY = 3000; 
private BankAccount account;
private double amount;
private final int COUNT = 50;;
private Random rand = new Random();

/**
Constructs a  runnable.
@param anAccount the account 
@param anAmount the amount to deposit in each repetition
@param aCount the number of repetitions
*/
public DepositRunnable(BankAccount anAccount)
{
account = anAccount;

}

public void run()
{
try
{
for (int i = 1; i <= COUNT; i++)
{
amount = rand.nextInt(499);
account.deposit(amount);
Thread.sleep(DELAY);
}
}
catch (InterruptedException exception) {}
}
}