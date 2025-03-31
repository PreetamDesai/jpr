package inheritanceExample;

public class StudentEmployeee extends Student {
    private double rateOfPayPerHour;
    private String employeeId;

    public StudentEmployeee(String Name, String Address, String studentId, double rateOfPayPerHour, String employeeId){
        super(Name, Address, studentId);
        this.rateOfPayPerHour = rateOfPayPerHour;
        this.employeeId = employeeId;
    }
    public double getRateOfPayPerHour(){
        return rateOfPayPerHour;
    }
    public void setRateOfPayPerHour(double rateOfPayPerHour){
        this.rateOfPayPerHour = rateOfPayPerHour;
    }
    public String getEmployeeid(){
        return employeeId;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    @Override
    public String toString(){
        return super.toString() + "Rate of pay per hour " + rateOfPayPerHour + "Employee id " + employeeId;
    }
}
