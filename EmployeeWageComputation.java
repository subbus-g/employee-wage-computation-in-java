public class EmployeeWageComputation
{
    public static void main(String args[])
    {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20;
    
        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++)
        {
            int empType = (int) (Math.random() * 100) % 3;
            int workingHours =0;
            switch (empType)
            {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
            }
            int wage = workingHours * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for a month is " + totalWage);        
    }
}
