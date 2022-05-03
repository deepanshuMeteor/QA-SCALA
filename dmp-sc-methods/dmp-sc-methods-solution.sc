// CHAPTER:   4. METHODS
// OBJECTIVE: Answer the following questions.
// PROBLEM:   Define functions to handle login and profile information.
// TIME:      20 m


//CODE BLOCKS
//Q. modify the defintion of name so it refers
//... to the last name of Sherlock Holmes

val name = {
  val parts = "Sherlock Holmes".split(" ")
  parts(1)
}

println(name)


// METHOD DEFINTION
// Q. define a method called parts
// which takes a csv-formatted string and returns its parts
// ie., it accepts a string argument and returns an array
val exampleCSV = "jefferson, pa$$, virginia, president"

def parts(csv: String) = csv.split(", ")

//Q. call parts with exampleCSV and print out each part
println(parts(exampleCSV).mkString("\n"))

//or,
for(part <- parts(exampleCSV)) println(part)


//NAMED ARGUMENTS
//Q. define a method getUser with arguments username and password
// the method should return 
// Map("username" -> username, "password" -> password)
// password should have a default value of "pa$$"

def getUser(username: String, password: String = "pa$$"): Map[String, String] = Map(
  "username" -> username,
  "password" -> password
)

//Q.  call getUser supplying the password argument first ("test")
//... then the username ("guest")
//... and print out the user's details
println(getUser(password="test", username="guest"))

//Q. now just print getUser with the username "guest"
println(getUser("guest"))



//VARIADICS
//Q. define printProfile,
// a method of an abitary number of string arguments
// which prints the last of them 
// HINT: .last

def printProfile(info: String*) = info.last 
printProfile("Irene", "Paris", "45")


//EXTRA
//Q. can you add a return type to the getUser method?
//def getUser(u: String, p: String): Map[String, String]

//Q. dbl the ages list & print
def dbl(nums: Int*) = {
  for(n <- nums) yield n * 2
}

val ages = List(18, 20, 22)

// dbl(ages(0), ages(1), ages(2))

println(dbl(ages : _*))
