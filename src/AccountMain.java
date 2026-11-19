public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account("Peter", 500, "PL12345678");

        try {
            account.transfer(800);
            System.out.println("Transfer completed");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        } finally {
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}
