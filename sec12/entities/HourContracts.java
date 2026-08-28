package sec12.entities;

import java.util.Date;

public class HourContracts {
    
    private Date data;
    private Double valueHour;
    private Integer hours;

    public HourContracts(){

    }

    public HourContracts(Date data, Double valueHour, Integer hours) {
        this.data = data;
        this.valueHour = valueHour;
        this.hours = hours;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date date) {
        this.data = data;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return  valueHour * hours;
    }
    
    
}
