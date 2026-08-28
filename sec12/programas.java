package sec12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import sec12.entities.Departments;
import sec12.entities.HourContracts;
import sec12.entities.Worker;
import sec12.enums.WorkLevels;

public class programas {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");

      System.out.print("Enter department's name:");
      String departmentName = sc.nextLine();

      System.out.print("Enter work date:");
      System.out.println();
      System.out.print("Name: ");
      String name = sc.nextLine();  

      System.out.print("Level:");
      String workerLevels = sc.nextLine();


      System.out.print("Base salary:");
      double baseSalary = sc.nextDouble();

      Worker worker = new Worker(name, WorkLevels.valueOf(workerLevels), baseSalary, new Departments(departmentName));

      

      System.out.println("How many contracts to this worker?");
      Integer qtd = sc.nextInt();

      while(qtd < 0){
        System.out.println("the Numbers is positive!");
      System.out.println("How many contracts to this worker?");
      qtd = sc.nextInt();
      }
      for(int i=0;i<qtd; i++){
        System.out.println("Enter contract #" + (1+i) + " data:");
        
        System.out.print("Data:");
        Date contractDate = fmt1.parse(sc.next());
       
        System.out.print("Value per hour: ");
        double valuePerHour = sc.nextDouble();

        System.out.print("Duration (hours):");
        int hours = sc.nextInt();

        HourContracts contract = new HourContracts(contractDate, valuePerHour, hours);
        worker.addContract(contract);
      }
      System.out.println();
      System.out.print("Enter month and year to calculate income (MM/yyyy):");
      String monthAndYear = sc.next();

      int month = Integer.parseInt(monthAndYear.substring(0,2));
      int year = Integer.parseInt(monthAndYear.substring(3));
      System.out.println("Nome:" + worker.getName());
      System.out.println("Department:" + worker.getDepartments().getName());
      System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));





        
        
        
        sc.close();

    }
}
