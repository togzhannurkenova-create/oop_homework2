public class ntn4 {
    public static void main(String[] args) {

       
                Customer c1 = new Customer(1, "John Doe", 'm');
                Account acc1 = new Account("A001", c1, 100.0);
                System.out.println(acc1);

                acc1.credit(50.0);
                System.out.println(acc1);

                acc1.debit(30.0);
                System.out.println(acc1);

                acc1.debit(150.0);
                System.out.println(acc1);

                Account acc2 = new Account("A002", new Customer(2, "Jane Smith", 'f'));
                acc1.transferTo(acc2, 20.0);
                System.out.println(acc1);
                System.out.println(acc2);
            }
        }

        class Customer {
            private int id;
            private String name;
            private char gender;

            public Customer(int id, String name, char gender) {
                this.id = id;
                this.name = name;
                this.gender = gender;
            }

            public int getID() {
                return id;
            }

            public String getName() {
                return name;
            }

            public char getGender() {
                return gender;
            }

            @Override
            public String toString() {
                return name + "(" + id + ")";
            }
        }


        class Account {
            private String id;
            private Customer customer;
            private double balance;

            public Account(String id, Customer customer, double balance) {
                this.id = id;
                this.customer = customer;
                this.balance = balance;
            }

            public Account(String id, Customer customer) {
                this(id, customer, 0.0);
            }

            public String getID() {
                return id;
            }

            public Customer getCustomer() {
                return customer;
            }

            public double getBalance() {
                return balance;
            }

            public Account credit(double amount) {
                balance += amount;
                return this;
            }

            public Account debit(double amount) {
                if (balance >= amount) {
                    balance -= amount;
                } else {
                    System.out.println("Amount exceeded balance");
                }
                return this;
            }

            public Account transferTo(Account another, double amount) {
                if (this.balance >= amount) {
                    this.debit(amount);
                    another.credit(amount);
                } else {
                    System.out.println("Amount exceeded balance");
                }
                return this;
            }

            @Override
            public String toString() {
                return customer.toString() + " balance=$" + String.format("%.2f", balance);
            }
        }