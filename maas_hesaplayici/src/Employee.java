public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double bonus;
    double tax;
    double raiseSalary;

    Employee(String name,double salary,double workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    void  tax(){
        if (this.salary <= 1000){
            System.out.println("Vergi          :  " +"Vergi Muafiyetiniz Bulunmaktadır");
        }else {
            tax = this.salary * 0.03;
            System.out.println("Vergi          :  "+tax);
        }


    }
    void bonus(){
        double temp;
        if (this.workHours > 40){
            temp = this.workHours - 40;
            this.bonus = temp * 30;
            System.out.println("Bonus          :  " +this.bonus);

        }
        else {
            System.out.println(this.salary);
        }
    }
    void raiseSalary(){

        int years =2021 - this.hireYear ;
       if ((years < 10 )){
           this.raiseSalary = (this.salary * 0.05);
           System.out.println("Maaş Artışı    :  "+( this.raiseSalary));
           System.out.println("Vergi Ve Bonuslarla Birlikte Maaşı: " +((this.salary + this.raiseSalary + this.bonus) - tax));
       }

       else if (years > 9 && years < 20){
          this.raiseSalary   = (this.salary * 0.10);
          System.out.println("Maaş Artışı    :  "+( this.raiseSalary));
           System.out.println("Vergi Ve Bonuslarla Birlikte Maaşı: " +((this.salary + this.raiseSalary + this.bonus) - tax));
       }


       else if (years > 19){
           this.raiseSalary = (this.salary * 0.15);
           System.out.println("Maaş Artışı    :  "+this.raiseSalary);
           System.out.println("Vergi Ve Bonuslarla Birlikte Maaşı: " +((this.salary +  this.bonus) - tax));
       }


    }
    void tostring(){
        System.out.println("Adı            :  " + this.name);
        System.out.println("Maaşı          :  " + this.salary);
        System.out.println("Başlangıç Yılı :  " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Toplam Maaş    :  "  + ((this.salary + this.bonus + this.raiseSalary) - tax));






    }

}
