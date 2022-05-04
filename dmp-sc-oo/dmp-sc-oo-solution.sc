// CHAPTER:   OBJECT ORIENTATION
// OBJECTIVE: Answer the following questions.
// PROBLEM:   
// TIME:      45m 



// PART 1 -- CLASSES 

//Q. println "Hello" in uppercase
println("Hello".toUpperCase)

//Q. println the class name of "Hello"
// HINT: .getClass.getName
println("Hello".getClass.getName)

//Q. define class Human and class Dog
class Human 
class Dog

//Q. define val fred and val fiod, a human and a dog
val fred = new Human 
val fido = new Dog


//Q. print the class names of fido and fred
println(fido.getClass.getName)
println(fred.getClass.getName)


//Q. define a class Person 
// such that all people have a name 

class Person(val name: String)

//Q. create a person and print their name 
val henry = new Person("Henry")
println(henry.name)


//Q. define class User 
// all users have public name: String, and private password: Int 
// all users can login()
//   which returns whether their password is 1234

class User(val name: String, password: Int) {
	def login() = password == 1234
}

//Q. create two users with passwords 1234 and 4321
// print .login for each
println(new User("Michael", 1234).login)
println(new User("Ben", 4321).login)


//Q. define class Staff the same as User
// but add an additional method login(pin: Int)
// which compares their password to pin 

class Staff(val name: String, password: Int) {
	def login() = password == 1234
	def login(pin: Int) = pin == password
}


//Q. create two Staff as before with password 1234 and 4321
// try .login and .login(4321) for them both 
 
println(new Staff("Michael", 1234).login)
println(new Staff("Ben", 4321).login(4321))


// PART 2 -- OBJECTS 

// Q. define an object Earth with a val population and def describe
//.. describe should return s"There are ${population} B people on earth" 
object Earth {
 val population = 7.1
 
 def describe() = s"There are ${population} B people on earth" 
}

// Q. print a description of the earth
println(Earth.describe())



class Employee private (val password: Int) {
 def login() = password == 1000
}


// Q. define a companion object for Employee
// with a val SHIFT = 500
// and an apply(p: Int) method
// apply(p) should create create a new Employee 
// with a pin of p + Employee.SHIFT

object Employee {
 val SHIFT = 500
 def apply(p: Int) = new Employee(p + Employee.SHIFT)
}

// Q. Create an employee and login successfully
val you = Employee(500)
println(you.login)


//Q. define a case class Profile with a name and age
case class Profile(name: String,  age: Int)

// Q. create a list called people of several profiles
//... and print the list 
val people = List( Profile("Michael", 29), Profile("John", 39), Profile("Albert", 79) )

println(people)


// EXTRA:
//Q. for-match over the list instead
//.. printing s"$n is $a years old!"

for(p <- people) p match {
	case Profile(n, a) => println(s"$n is $a years old!")
}


class Manager(private var password: Int) {
 def pin: Unit = ()
 def pin_= (i: Int): Unit = password = i * 2
 def login() = password == 1000
}

val me = new Manager(0)

// Q. modify me so that .login is true 

println(me.login)

me.pin = 500
println(me.login)
 