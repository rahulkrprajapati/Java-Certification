package OTTService;

public class Ott {
    String name;
    int pricePerUnit;
    int unitInHours;

    Ott(){
        name="";
        pricePerUnit = 0;
        unitInHours = 0;
    }
    Ott(String name, int pricePerUnit, int unitInHours){
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.unitInHours = unitInHours;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    public void setUnitInHours(int unitInHours) {
        this.unitInHours = unitInHours;
    }
    public String getName() {
        return name;
    }
    public int getPricePerUnit() {
        return pricePerUnit;
    }
    public int getUnitInHours() {
        return unitInHours;
    }
//no i'll be creating another main class. This is in a seperate package. 
}
