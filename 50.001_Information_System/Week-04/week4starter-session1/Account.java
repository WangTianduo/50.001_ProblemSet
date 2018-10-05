public class  Account {
    private double balance;
    private int ACnumber;

    public  Account(int number) {
        this.ACnumber = number;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double requested) throws ExceedLimitException {
        if(requested <= balance) {
            balance -= requested;
        } else {
            double needs = requested - balance;
            throw new ExceedLimitException(requested);
        }
    }   //  other methods

    public class ExceedLimitException extends Exception {
        private double amount;
        public ExceedLimitException(double amount) {
            this.amount = amount;
        }
        public double getAmount() {
            return amount;
        }
     }
    }