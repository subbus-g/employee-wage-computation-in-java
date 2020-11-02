class CompanyEmpWage
{
    // instance constants
    final String COMPANY_NAME;
    final int WAGE_PER_HR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HRS;
    // instance variable
    int totalEmpWage;

    CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalEmpWage = 0;
    }

    void setTotalEmployeeWage(int totalEmpWage)
    {
        this.totalEmpWage = totalEmpWage;
    }

    public String toString()
    {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.err.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalEmpWage + "\n";
    }
}

public class EmployeeWageComputation
{
    // class constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    // instance variables
    int noOfCompanies, index;
    CompanyEmpWage[] companies;

    public EmployeeWageComputation(int noOfCompanies)
    {
        this.noOfCompanies = noOfCompanies;
        companies = new CompanyEmpWage[noOfCompanies];
        index = 0;
    }

    void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        companies[index++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
    }

    public String toString()
    {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.err.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
    }
}
public class EmployeeWageComputation
{
    // class constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    //instance variables
    int noOfCompanies;
    CompanyEmpWage[] companies;
    int index = 0;

    public EmployeeWageComputation()
    {

        companies = new CompanyEmpWage[3];
    }
    void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        companies[index++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);

    }
    int generateEmployeeType()
    {
        return (int) (Math.random() * 100) % 3;
    }
    int getWorkingHrs(int empType)
    {
        switch (empType)
        {
        case FULL_TIME:
            return 8;
        case PART_TIME:
            return 4;
        default:
            return 0;
        }
    }
    void calculateTotalWage()
    {
        for (CompanyEmpWage company : companies)
        {
<<<<<<< HEAD
            int totalWage = calculateTotalWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }

    int calculateTotalWage(CompanyEmpWage companyEmpWage)
=======
            calculateTotalWage(company);
            System.out.println(company);
        }
    }
    void calculateTotalWage(CompanyEmpWage companyEmpWage)
>>>>>>> 3a8398f526740f57566c6a0463c2c985ff7f4fa1
    {
        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
<<<<<<< HEAD

        int workingHrs, totalWage = 0;
=======
        int workingHrs;
>>>>>>> 3a8398f526740f57566c6a0463c2c985ff7f4fa1
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
<<<<<<< HEAD
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        return totalWage;
=======
            companyEmpWage.totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
>>>>>>> 3a8398f526740f57566c6a0463c2c985ff7f4fa1
    }
    public static void main(String args[])
    {
<<<<<<< HEAD
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation(3);
=======
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
>>>>>>> 3a8398f526740f57566c6a0463c2c985ff7f4fa1
        employeeWageComputation.addCompany("Microsoft", 4, 30, 100);
        employeeWageComputation.addCompany("Google", 5, 40, 170);
        employeeWageComputation.addCompany("Apple", 9, 10, 70);
        employeeWageComputation.calculateTotalWage();
<<<<<<< HEAD
    }
=======
     }
>>>>>>> 3a8398f526740f57566c6a0463c2c985ff7f4fa1
}
