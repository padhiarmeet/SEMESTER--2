public class Bank_Account {
    private String accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;

    public Bank_Account(String accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountDetails() {
        return "Account Number: " + accountNo +
                "\nUser Name: " + userName +
                "\nEmail: " + email +
                "\nAccount Type: " + accountType +
                "\nAccount Balance: $" + String.format("%.2f", accountBalance);
    }

    public void displayAccountDetails() {
        System.out.println(getAccountDetails());
    }

    public static void main(String[] args) {
        // Example usage:
        Bank_Account myAccount = new Bank_Account("123456789", "John Doe", "john@example.com", "Savings", 1000.50);
        myAccount.displayAccountDetails();
    }
}
