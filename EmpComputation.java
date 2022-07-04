package EmployeeWageProgram;

public class EmpComputation {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    public static final int SALARY_PER_HR = 20;

    public static void employeeAttendance() {

        double empCheck = Math.floor((Math.random() * 10) % 2);
        int Working_Hr = 0;

        if (empCheck == IS_PRESENT) {
            Working_Hr = 8;
        } else if (empCheck == IS_PART_TIME) {
            Working_Hr = 4;
        } else {
            Working_Hr = 0;
        }
        double Salary = Working_Hr * SALARY_PER_HR;
        System.out.println("Emplyee Salary is = " + Salary + "$");
    }

    public static void main(String[] args) {
        EmpComputation.employeeAttendance();
    }

}
