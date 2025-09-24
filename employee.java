public class ntn4 {
    public static void main(String[] args) {


                Employee e1 = new Employee(1, "John", "Doe", 3000);
                System.out.println(e1);
                System.out.println("Annual Salary = " + e1.getAnnualSalary());
                e1.raiseSalary(10);
                System.out.println("After raise: " + e1);
            }
        }


        class Employee {
            private int id;
            private String firstName;
            private String lastName;
            private int salary;

            public Employee(int id, String firstName, String lastName, int salary) {
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.salary = salary;
            }

            public int getID() {
                return id;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public String getName() {
                return firstName + " " + lastName;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            public int getAnnualSalary() {
                return salary * 12;
            }

            public int raiseSalary(int percent) {
                salary += salary * percent / 100;
                return salary;
            }

            @Override
            public String toString() {
                return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
            }
        }
