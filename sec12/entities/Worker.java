package sec12.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import sec12.enums.WorkLevels;

public class Worker {
    
    private String name;
    private WorkLevels level;
    private Double baseSalary;

    private Departments departments;
    private  List<HourContracts> contracts = new ArrayList();

    public Worker(){
     }

    public Worker(String name, WorkLevels level, Double baseSalary, Departments departments) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevels getLevel() {
        return level;
    }

    public void setLevel(WorkLevels level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public List<HourContracts> getContracts() {
        return contracts;
    }
    public void addContract(HourContracts contract){
        contracts.add(contract);
    }
    public void removeContract(HourContracts contract){
        contracts.remove(contract);
    }
    public double income(int year, int month){
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContracts c: contracts){
            cal.setTime(c.getData());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
             if(year == c_year && month == c_month){
                soma = soma + c.totalValue();
             }
        }
        return soma;
    }

    
    

    
    

    
    

}
