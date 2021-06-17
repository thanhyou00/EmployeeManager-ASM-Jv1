
package asm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Truc
 */
public class ServiceEmployee {
    ArrayList<Employee> _lstemployee = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    Employee _employee = new Employee();
    
    public ServiceEmployee() {
       _lstemployee.add(new Employee("PH17923","Nguyễn Văn Trức",21,"truc@gmail.com",9000000));
       _lstemployee.add(new Employee("PH17825","Nguyễn Văn Nam",20,"nam@gmail.com",8000000));
    }
    
}
