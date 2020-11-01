public class EmployeeWageComputation
{
    // class constants
    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;
    // instance constants
    final String COMPANY_NAME;
    final int WAGE_PER_HR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HRS;
    // instance variable
    int totalWage;

    EmployeeWageComputation(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalWage = 0;
    }
    void calculateTotalWage()
    {
        int workingHrs = 0;
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.err.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = (int) (Math.random() * 100) % 3;
            switch (empType)
            {
                case FULL_TIME:
                    workingHrs = 8;
                    break;
                case PART_TIME:
                    workingHrs = 4;
                    break;
                default:
                    workingHrs = 0;
                    break;
            }
            int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }

    }
    public String toString()
    {
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
    }
    public static void main(String args[])
    {
        EmployeeWageComputation google = new EmployeeWageComputation("Google", 8, 20, 100);
        EmployeeWageComputation microsoft = new EmployeeWageComputation("Microsoft", 4, 30, 150);

        google.calculateTotalWage();
        System.out.println(google);

        microsoft.calculateTotalWage();
        System.out.println(microsoft);
    }
}
