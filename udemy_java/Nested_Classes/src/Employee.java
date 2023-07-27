import java.util.Comparator;

public class Employee {
    public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {
        private String type;

        public EmployeeComparator(String type) {
            this.type = type;
        }
        public EmployeeComparator(){
            this.type="name";
        }

        @Override
        public int compare(Employee o1,Employee o2){
           if(type=="yearStarted"){
                return o1.yearStarted-o2.yearStarted;
            }
            return o1.name.compareTo(o2.name);
        }
    }
    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee(){

    }

    public Employee(int emloyeeId, String name, int yearStarted) {
        this.employeeId = emloyeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

public String getName(){
        return this.name;
}
    @Override
    public String toString(){
        return "%d %-8s %d".formatted(this.employeeId,name,yearStarted);
    }
}

