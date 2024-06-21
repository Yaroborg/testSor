import entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import entity.Employee;



public class Test6 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
/*            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Ivan", "Ivanov", "HR", 500);
            Detail detail = new Detail("Moscow", "Russia", "1234567890");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();*/

/*            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Kuzmin", "IT", 7500);
            Detail detail = new Detail("Polock", "RB", "9904747");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();*/


/*            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();*/

            session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 4);
            session.delete(detail);



            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
