
package asm;

import java.io.Serializable;

/**
 *
 * @author Nguyen Truc
 */
public class Employee implements Serializable{
    private String id;
    private String fullName;
    private int age;
    private String email;
    private float salary;

    public Employee() {
    }

    public Employee(String id, String fullName, int age, String email, float salary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fullName=" + fullName + ", age=" + age + ", email=" + email + ", salary=" + salary + '}';
    }
    
    
}
