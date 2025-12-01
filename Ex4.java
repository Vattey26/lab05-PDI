class Employee
{
    private String id;
    private String name;
    private int age;
    private double salary;
    private String position;

    public Employee (String id, String name, int age, double salary, String position)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Double getSalary()
    {
        return salary;
    }

    public void setSalary()
    {
        this.salary = salary;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void display() 
    {
        System.out.printf("ID: %s\nName: %s\nAge: %d\nSalary: %.2f\nPosition: %s\n",
                id, name, age, salary, position);
    }
}

public class Ex4 
{
    public static void main(String[] args) 
    {
        Employee e = new Employee("P0921", "Sam", 20, 500, "Web Developper");
        Employee e1 = new Employee("E3920", "Shane", 34, 800, "Office Chief");

        e.display();
        System.out.println();
        e1.display();
    }    
}
