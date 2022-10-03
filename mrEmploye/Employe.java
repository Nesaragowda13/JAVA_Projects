package mrEmploye;

public class Employe implements Comparable<Employe>
{
private int id;
private String name;
private double salary;
public Employe(int id, String name, double salary) {
	this.id=id;
	this.name =name;
	this.salary =  salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public int compareTo(Employe o) {
	// TODO Auto-generated method stub
	//return this.id-o.id;
	return (int) (this.salary-o.salary);
	//return this.name.compareTo(o.name);
}
	

}
