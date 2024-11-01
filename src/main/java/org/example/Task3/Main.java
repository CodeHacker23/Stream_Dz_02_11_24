

import org.example.Task3.Employee;

import java.util.ArrayList;
import java.util.List;


public  static void main() {
    Employee employee1 = new Employee("Алексей", 25000.0, 23);
    Employee employee2 = new Employee("Мария", 30000.0, 30);
    Employee employee3 = new Employee("Дмитрий", 28000.0, 35);
    Employee employee4 = new Employee("Елена", 58000.0, 28);
    Employee employee5 = new Employee("Сергей", 27000.0, 40);
    Employee employee6 = new Employee("Анна", 34000.0, 25);
    Employee employee7 = new Employee("Иван", 26000.0, 32);
    Employee employee8 = new Employee("Ольга", 30000.0, 29);
    Employee employee9 = new Employee("Николай", 31000.0, 45);
    Employee employee10 = new Employee("Татьяна", 35000.0, 27);
    Employee employee11 = new Employee("Павел", 29000.0, 33);
    Employee employee12 = new Employee("Светлана", 33000.0, 38);
    Employee employee13 = new Employee("Роман", 79000.0, 22);
    Employee employee14 = new Employee("Ксения", 32000.0, 31);
    Employee employee15 = new Employee("Анастасия", 33000.0, 26);
    Employee employee16 = new Employee("Максим", 31000.0, 34);
    Employee employee17 = new Employee("Юлия", 30000.0, 39);
    Employee employee18 = new Employee("Григорий", 28000.0, 36);
    Employee employee19 = new Employee("Евгения", 35000.0, 24);
    Employee employee20 = new Employee("Виктор", 84000.0, 41);
    Employee employee21 = new Employee("Анатолий", 29000.0, 37);


    List<Employee> employees = new ArrayList<>();
    employees.add(employee1);
    employees.add(employee2 );
    employees.add(employee3);
    employees.add(employee4);
    employees.add(employee5);
    employees.add(employee6);
    employees.add(employee7);
    employees.add(employee8);
    employees.add(employee9);
    employees.add(employee10);
    employees.add(employee11);
    employees.add(employee12);
    employees.add(employee13);
    employees.add(employee14);
    employees.add(employee15);
    employees.add(employee16);
    employees.add(employee17);
    employees.add(employee18);
    employees.add(employee19);
    employees.add(employee20);
    employees.add(employee21);

    employees.stream().filter(n -> n.getMani() < 40000.0) // используем фильтр на проверку зп меньше 40ка
            .forEach(n -> n.setMani(n.getMani() + 5000)); //используем ForEach что бы изменить напрямую зп сотрудников, мы уже отфильтровали тех у кого меньше 40 ка зп
    employees.forEach(System.out::println); //вывод
}
