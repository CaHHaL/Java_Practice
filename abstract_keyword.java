// run time binding
// using abstract
//  You are using Java
abstract class payment
{
    double amount;
    payment(double amount)
    {
        this.amount = amount;
    }
    abstract void processpayment();
} class creditcard extends payment
{
    String cardnumber;
    creditcard(double amount, String cardnumber)
    {
        super(amount);
        this.cardnumber = cardnumber;
    }
    void processpayment()
    {
        System.out.println("Credit card payment " + amount + "using card " + cardnumber);
    }
} class paypal extends payment
{
    String email;
    paypal(double amount, String email)
    {
        super(amount);
        this.email = email;
    }
    void processpayment()
    {
        System.out.println("paypal payment " + amount + "using email " + email);
    }
} class Main
{
public
    static void main(String args[])
    {
        payment m = new creditcard(100, "qwertyuio");
        m.processpayment();
        payment n = new paypal(500, "email@email.com");
        n.processpayment();
    }
}