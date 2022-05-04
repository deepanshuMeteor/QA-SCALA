// CHAPTER:   OBJECT ORIENTATION
// OBJECTIVE: Answer the following questions.
// PROBLEM:   
// TIME:      45m 

// PART 1 -- CLASSES 

//Q. println "Hello" in uppercase


//Q. println the class name of "Hello"
// HINT: .getClass.getName

//Q. define class Human and class Dog

//Q. define val fred and val fiod, a human and a dog


//Q. print the class names of fido and fred


//Q. define a class Person 
// such that all people have a name 


//Q. create a person and print their name 


//Q. define class User 
// all users have public name: String, and private password: Int 
// all users can login()
//   which returns whether their password is 1234


//Q. create two users with passwords 1234 and 4321
// print .login for each


//Q. define class Staff the same as User
// but add an additional method login(pin: Int)
// which compares their password to pin 



//Q. create two Staff as before with password 1234 and 4321
// try .login and .login(4321) for them both 
 


// PART 2 -- OBJECTS 

// Q. define an object Earth with a val population and def describe
//.. describe should return s"There are ${population} B people on earth" 


// Q. print a description of the earth



// Q. define a companion object for Employee
// with a val SHIFT = 500
// and an apply(p: Int) method
// apply(p) should create create a new Employee 
// with a pin of p + Employee.SHIFT


// Q. Create an employee and login successfully


//Q. define a case class Profile with a name and age

// Q. create a list called people of several profiles
//... and print the list 


// EXTRA:
//Q. for-match over the list instead
//.. printing s"$n is $a years old!"



class Manager(private var password: Int) {
 def pin: Unit = ()
 def pin_= (i: Int): Unit = password = i * 2
 def login() = password == 1000
}

val me = new Manager(0)

// Q. modify me so that .login is true 
println(me.login)
