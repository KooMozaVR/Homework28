public class Main {
    public static void main(String[] args) {
        //1st task
        int age=18;
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age<0){
            System.out.println("Wrong age");
        }
        else if(age<18) {
            System.out.println("Underage");
        }


        //2nd task
        int years, salary;
        years=10;
        salary=1000;
        double rate=1;

        if (years<1) {
            rate = 1;
        }
        else if (years<=3) {
            rate = 0.1;
        }
        else {
            rate = 0.2;
        }
        double new_salary = (salary+(salary*rate));
        if (new_salary<4000) {
            new_salary = new_salary + 1000;
        }
        else  {
            new_salary = new_salary + 500;
        }
        System.out.println("New_Salary="+new_salary);

        //3rd task

        int digits = 0;
        for (int i = 1; i <=50; i++) {
            digits = digits + i;
        }
        System.out.println("sum_of_1_to_50_digits="+digits);

    }
}