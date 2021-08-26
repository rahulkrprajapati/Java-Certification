package PandaItemType;

public class ItemType {
    String name;
    double deposit;
    double costPerDay;

    public ItemType(String name, double deposit, double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString(){
        String s = String.format("%-20s%-20s%-20s", name, deposit, costPerDay);
        return s;
    }
}
