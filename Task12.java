import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Student {
    int ID;
    String name;
    Student(int ID, String name){
        this.ID = ID;
        this.name = name;

    }
    void print(){
        System.out.println(ID +" "+name);
    }
}
public class Task12 {
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(1,4,5,10,0,-90);
        List<Student> lists = Arrays.asList(
            new Student(19, "Inthera"), 
            new Student(43, "Vatey"),
            new Student(13, "Mony")
        );
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println();
        ////
        /// 
        /// 
        lists.stream().sorted(Comparator.comparing(n ->n.name)).forEach(Student::print);
        System.out.println();
        /////
        lists.stream().sorted(Comparator.comparingInt(n ->n.ID));
        System.out.println();
        ////
        lists.stream().sorted(Comparator.comparing((Student s) -> s.name).reversed()).forEach(Student::print);
        System.out.println();
        ////
        lists.stream().sorted(Comparator.comparingInt((Student s) ->s.ID).thenComparing(s -> s.name)).forEach(Student::print);

    }
}
