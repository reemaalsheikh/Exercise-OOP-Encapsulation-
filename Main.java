//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Q1 Create Account class
        Account account1 = new Account("24567890" ,"Reema");
        System.out.println("Acoount 1 Informations: ");
        System.out.println("Account id: "+account1.getId());
        System.out.println("Account name: "+account1.getName());
        account1.setBalance(3000);
        System.out.println("Acoount Balance: "+ account1.getBalance());
        System.out.println();


        Account account2 = new Account("30050088" ,"Reema" , 100);
        System.out.println("Acoount 2 Informations: ");
        System.out.println("Account id: "+account2.getId());
        account2.setName("Saud");
        System.out.println("Account name: "+account2.getName());
        account2.setBalance(2000);
        System.out.println("Acoount Balance: "+ account2.getBalance());
        System.out.println();



        Account account3 = new Account("24567890" ,"Khalid", 6000);
        System.out.println("Acoount 3 Informations: ");
        account3.setId("0987612345");
        System.out.println("Account id: "+account3.getId());
        System.out.println("Account name: "+account3.getName());
        System.out.println("Acoount Balance: "+ account3.getBalance());
        System.out.println();

        Account account4 = new Account("1234512345" ,"Rawan");
        System.out.println("Acoount 4 Informations: ");
        System.out.println("Account id: "+account4.getId());
        System.out.println("Account name: "+account4.getName());
        account4.setBalance(2000);
        account4.setBalance(0);
        System.out.println("Acoount Balance: "+ account4.getBalance());
        System.out.println();


        //Account 1 Transactions:
        account1.debit(600);
        account1.credit(300);
        account1.transferTo(account2,100);
        account1.credit(50);


        //Account 2 Transactions:
        account2.debit(50);
        account2.credit(100);
        account2.transferTo(account3,100);
        account2.credit(100);


        //Account 3 Transactions:
        account3.debit(50);
        account3.credit(100);
        account3.transferTo(account2,300);


        //Account 4 Transactions:
        account4.transferTo(account3,200);
        account4.credit(500);
        account4.debit(100);
        account4.transferTo(account1,10);
        account4.credit(50);


        System.out.println();
        System.out.println("Acoounts after transactions: ");
        System.out.println("Account 1  " + account1);
        System.out.println("Account 2  " + account2);
        System.out.println("Account 3  " + account3);
        System.out.println("Account 4  " + account4);


        System.out.println();
        System.out.println("_______________________________");
        System.out.println();











// Q2 Create employee class

Employee  employee1 = new Employee("80066543898","Reema",9000);
 System.out.println("Employee 1 Information: ");
 System.out.println( "Id: "+employee1.getId());
 System.out.println("Name: "+employee1.getName());
 System.out.println("Salary: "+employee1.getSalary());
 System.out.println("Annual Salary: "+employee1.getAnnualSalary());
 employee1.raiseSalary(15);
 employee1.raiseSalary(10);
        System.out.println();
        System.out.println("___");

Employee  employee2 = new Employee("80012566213","Manal",5000);
        System.out.println("Employee 2 Information: ");
        System.out.println("Id: "+employee2.getId());
        System.out.println("Name: "+employee2.getName());
        System.out.println("Salary: "+employee2.getSalary());
        employee2.setName("Mona");
        System.out.println("Annual Salary: "+employee2.getAnnualSalary());
        employee2.setSalary(8000);
        employee2.raiseSalary(20);
        System.out.println();
        System.out.println("___");


Employee  employee3 = new Employee("80065432114","Nawaf",10000);
        System.out.println("Employee 3 Information: ");
        System.out.println("Id: "+employee3.getId());
        System.out.println("Name: "+employee3.getName());
        System.out.println("Salary: "+employee3.getSalary());
        System.out.println("Annual Salary: "+employee3.getAnnualSalary());
        employee3.raiseSalary(10);
        System.out.println();
        System.out.println("___");



        System.out.println("Employee 1:" +employee1);
        System.out.println("Employee 2:" +employee2);
        System.out.println("Employee 3:" +employee3);


    }
}