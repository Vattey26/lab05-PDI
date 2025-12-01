
public class Task4 {
    private String name;
    private int age;
    private String position;
    private double salary;
    private String department;

    // Constructor
    public Task4(String name, int age, String position, double salary, String department) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

   
    public String getName() {  
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public int getAge() { 
        return age; 
    }
    public void setAge(int age) {
         this.age = age;
         }

    public String getPosition() { 
        return position; 
    }
    public void setPosition(String position) {
         this.position = position;
        }

    public double getSalary() { 
        return salary; 
    }
    public void setSalary(double salary) { 
        this.salary = salary; 
    }

    public String getDepartment() { 
        return department; 
    }
    public void setDepartment(String department) {
         this.department = department; 
        }
}

class TestEmployee {
    public static void main(String[] args) {
        Task4 e = new Task4("Mony", 22, "Developer", 1500, "SE");

        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Department: " + e.getDepartment());
    }
}
