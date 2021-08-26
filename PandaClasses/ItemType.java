package PandaClasses;

public class ItemType {
    private String name;
    private double deposit;
    private double costPerDay;
    ItemType(){
        name = "";
        deposit = 0.0d;
        costPerDay = 0.0d;
    }
    ItemType(String name, double deposit, double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
    String getName(){
        return name;
    }
    double getDeposit(){
        return deposit;
    }
    double getCost(){
        return costPerDay;
    }
    void setName(String name){
        this.name = name;
    }
    void setDeposit(double deposit){
        this.deposit = deposit;
    }
    void setCost(double cost){
        costPerDay = cost;
    }
}
