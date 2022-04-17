public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] employees = createEmployeeList();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age >= 40) {
                employees[i].info();
            }
        }
    }

    public static Employee[] createEmployeeList() {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Josh", "Trevish", "Back-end developer", "Josh@gmail.com", "+128383883", 4500, 41);
        empArray[1] = new Employee("Mark", "Mack", "QA engineer", "Mack@gmail.com", "+12583883", 2000, 33);
        empArray[2] = new Employee("Andry", "Lash", "AQA engineer", "Lash@gmail.com", "+128383666", 3000, 40);
        empArray[3] = new Employee("Margaret", "Gibson", "Project Manager", "Gibson@fmail.com", "+155553883", 2500, 21);
        empArray[4] = new Employee("Spenser", "Evans", "Business Analyst", "Spenser@gmaol.com", "+124483883", 3000, 55);
        return empArray;
    }
}
