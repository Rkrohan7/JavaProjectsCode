package collectionDemopkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class StudentOpretion {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String contactNumber;
    public StudentOpretion(Integer id, String firstName, String middleName, String lastName, String contactNumber) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Student Details\n");
        builder.append("Id :"+id+"\n");
        builder.append("Full Name : "+firstName+" "+middleName+" "+lastName+"\n");
        builder.append("Contact No. "+contactNumber+"\n");
        return builder.toString();
        StringBuilder stringBuilder =new StringBuilder();
        
        stringBuilder.append("Roll No:"+id+"\n");
        stringBuilder.append("StudentName:"+firstName+" "+middleName+" "+lastName+"\n");
        stringBuilder.append("Contact::"+contactNumber+"\n");
        return stringBuilder.toString();
    }
}
class StudentImpl{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        char ch;
        StudentImpl studentImpl = new StudentImpl();
        int ch;
        System.out.println("Student Management\n1.Insert\n2.Update\n3.Display\n4.Delete");
        System.out.println("Enter Your Choice");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        do{
            System.out.println("1.Insert");
            System.out.println("2.Update Record");
            System.out.println("3.Delete Record");
            System.out.println("4.Display");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch){
            switch (choice){
                case 1:
                    Student s = studentImpl.insertStudentData(sc);
                    students.add(s);
                    System.out.println("Student inserted Successfully..");
                    break;
                case 2:
                    if (students.isEmpty())
                        System.out.println("List is empty");
                    else {
                        studentImpl.updateRecord(sc,students);
                    }
                    System.out.println("Student updated Successfully..");
                    break;
                case 3:
                    if (students.isEmpty())
                        System.out.println("List is empty");
                    else {
                        studentImpl.deleteRecord(students,sc);
                    }
                    break;
                case 4:
                    studentImpl.display(students);
                    break;
                case 4:
                if (students.isEmpty())
                    System.out.println("List is empty");
                else {
                    studentImpl.deleteRecord(students,sc);
                }
                    System.out.println("Student deleted Successfully..");
                break;
            }
        }while (ch<5);
            System.out.println("do you want to continue:");
            ch=sc.next().charAt(0);
            System.out.println("Student Management\n1.Insert\n2.Update\n3.Display\n4.Delete");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();
        }while  (ch=='y' || ch=='Y');
    }

    private void display(List<Student> students){
        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
    private void deleteRecord(List<Student> students,Scanner sc){
        System.out.println("Enter student id to delete record");
        Integer id = sc.nextInt();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId() == id){
                //students.remove(iterator.next());
                iterator.remove();
            }
        }
    }
    private void updateRecord(Scanner sc,List<Student> students){
        System.out.println("Enter student id to update record");
        Integer id = sc.nextInt();
        System.out.println("Enter contact number to update record for id "+id);
        String mbl = sc.next();
        for(Student s:students){
        students.forEach(s->{
            if (s.getId() == id){
                s.setContactNumber(mbl);
            }
        }
        });


    }
    private Student insertStudentData(Scanner sc) {
        System.out.println("Enter student id");
        Integer id = sc.nextInt();
        System.out.println("Enter first name");
        String fName = sc.next();
        System.out.println("Enter middle name");
        String mName = sc.next();
        System.out.println("Enter last name");
        String lName = sc.next();
        System.out.println("Enter Contact Number");
        String mbl = sc.next();
        Student student = new Student(id,fName,mName,lName,mbl);
        return student;
    }
}