package constructorPractise;

import lombok.Getter;
import lombok.Setter;

//import jdk.internal.org.objectweb.asm.tree.ClassNode;
@Getter
@Setter
public class Patient {

    String name;
    int age;
    int roomNumber;
    String doctorName;
//Create a constructor and initailze the variable
    public Patient()
    {
        name = "Durgesh";
        age = 25;
        roomNumber = 308;
        doctorName = "Dr Ables";
    }
    //Create a constructor and initialize the value with passing parameter
    public Patient(String name,int age,int roomNumber,String doctorName)
    {
        this.name = name;
        this.age = age;
        this.roomNumber = roomNumber;
        this.doctorName = doctorName;

    }
    //Create a getter and setter to assign and read the value of a variable

   // for age
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    //For name
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
        }
// for Doctor Name
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return doctorName;
    }
//for room no

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    static void display(Patient p)
     {
        // Patient p = new Patient();
         System.out.println(p.name);
         System.out.println(p.age);
         System.out.println(p.roomNumber);
         System.out.println(p.doctorName);

    }

    public static void main(String[] args) {
        Patient p1 = new Patient();
        display(p1);
        reAssignRoom(p1);
        Patient p2 = new Patient("Rakesh",37,809,"Mr Gupta");
        display(p2);
        reAssignRoom(p2);
    }
    static void reAssignRoom(Patient p) {
        if (p.name.equals("Rakesh")) {
            p.roomNumber = 500;
            System.out.println("New Assign room is " + p.roomNumber);
        } else {
            p.roomNumber = 1000;
            System.out.println("New Assign room is " + p.roomNumber);
        }
    }
}

