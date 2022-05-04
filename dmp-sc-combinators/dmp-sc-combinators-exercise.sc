// CHAPTER:   COMBINATORS
// OBJECTIVE: Answer the following questions.
// PROBLEM:   Use combinators to transform data. 
// TIME:      30 m

val names: List[String] = List(
	"Michael Burgess", "Sherlock Holmes", 
	"John Watson", 	   " 	 "
)

//Q. with names and .map :

//... print a list of the length of each name
//... print a list of bools, whether the name .isEmpty
//... print a list of the last names


val city: Option[String] = Some("London")
val day: Option[String] = None

// Q. With city and day, map  _.toUpperCase
// .. What results do you expect? Why?

//Q. Using map, 
// split all the names into arrays containing each part of their name
// defining a val parts: List[Array[String]]

//Q. print out the first word of the first name 

//Q. println out the last word of the last name 

//Q. Split names again, this time producing a List[String]
//.. print them all using foreach println

val capitals: Map[String, String] = Map(
	"London" -> "UK", 
	"Paris"  -> "FR"
)

// Q. Using lookup, get the country for the capital city 
// HINT: what happens if you map lookup over city?

val lookup: String => Option[String] = capitals.get(_)


// Q. modify the following to join together only the first names 
// HINT: the first argument is the total; the second argument is the element 

println(  names reduce { _ + _}  )


//Q. if all the names contain a space, print "every name has a space!"
// HINT: forall contains 

val dates: List[(Int, Int, Int)] = List(
	(3, 12, 1900), 
	(4, 11, 1901), 
	(7, 12, 1902)
)

//Q. does every date occur after october?
// HINT: forall  ._2

// Q. do any dates start on the first of the month?
// HINT: exists ._1

// Q. print out all the names using foreach

// Q. print out all the date years using foreach
// HINT: you may need to spell out the function in full
// ....  (date: (Int, Int, Int)) =>

// EXTRA:
// Q. rephrase the following as a for-comprehension
names flatMap {  _.split(" ") } foreach println
 
