//this is a reference variable that refers to the current object.
class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){ 
 
//to refer current class instance variable
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  

//to invoke current class method
this.display(); 
}  

Student(int rollno, String name) {  

//to invoke current class constructor
this(rollno, name, 0.0f);  
}

Student getInstance() {

//this keyword can be used to return current class instance
return this;
}

void S_name(Student obj){  
System.out.println(obj.name);  
}  
void showName(){  
//to pass as an argument in the method
S_name(this);  
}  

void createNewStudent(){

// Using "this" to pass as an argument in the constructor call
Student s = new Student(this.rollno + 1, "New Student", this.fee + 1000);  
System.out.println("New Student created:");
s.display();
}

void display(){System.out.println(rollno+" "+name+" "+fee);} 
}  
  
class Q11{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s2.showName();
s1.createNewStudent();
}}  

