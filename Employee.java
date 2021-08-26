interface EmpBehaviour {
    public double promoteEmp(String currentDes, double currentBasic);

    public void ApplyForLWP(String currentStatus);

}

public class Employee implements EmpBehaviour {
    String name, designation, status;
    char gender;
    double yearsOfExp, basicSalary;

    Employee(String name, char gender) {
        this.name = name;
        this.gender = gender;
        designation = "ASE";
        basicSalary = 10000;
        status = "Active";

    }

    Employee(String name, char gender, double yearsOfExp) {
        this.name = name;
        this.gender = gender;
        this.yearsOfExp = yearsOfExp;
        if (this.yearsOfExp > 3) {
            designation = "ITA";
            basicSalary = 15000;
        } else {
            basicSalary = 10000;
            designation = "ASE";
        }
        status = "Active";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setYearsOfExp(double yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double promoteEmp(String currentDes, double currentBasic) {
        double newSalary = 0.0;
        switch (this.designation) {
            case "ASE":
                newSalary = this.basicSalary + this.basicSalary * 0.05;
                setBasicSalary(newSalary);
                setDesignation("ITA");
                break;

            case "ITA":
                newSalary = this.basicSalary + this.basicSalary * 0.08;
                setBasicSalary(newSalary);
                setDesignation("AST");
                break;

            case "AST":
                newSalary = this.basicSalary + this.basicSalary * 0.10;
                setBasicSalary(newSalary);
                setDesignation("ASC");
                break;

            case "ASC":
                break;
        }
        return newSalary;
    }

    public void ApplyForLWP(String currentStatus) {
        setStatus("inAvtive");
        setBasicSalary(0.0);
    }

}
