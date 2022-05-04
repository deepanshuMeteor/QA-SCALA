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

println(  names map { _.length }   )
println(  names map { _.isEmpty }  )
println(  names map { _.split(" ").last }  )


val city: Option[String] = Some("London")
val day: Option[String] = None

// Q. With city and day, map  _.toUpperCase
// .. What results do you expect? Why?
println(   city map { _.toUpperCase }     )
println(    day map { _.toUpperCase }     )


//Q. Using map, 
// split all the names into arrays containing each part of their name
// defining a val parts: List[Array[String]]
val parts = names map { _.split(" ") } 

//Q. print out the first word of the first name 
println(parts(0)(0))

//Q. EXTRA: println out the last word of the last name 
println(parts.last.last)


//Q. Split names again, this time producing a List[String]
//.. print them all using foreach println

names flatMap { _.split(" ") } foreach println

val capitals: Map[String, String] = Map(
	"London" -> "UK", 
	"Paris"  -> "FR"
)


// Q. Using lookup, get the country for the capital city 
// HINT: what happens if you map lookup over city?
val lookup: String => Option[String] = capitals.get(_)

println(   city flatMap lookup  ) 



// Q. modify the following to join together only the first names 
// HINT: the first argument is the total; the second argument is the element 
println(  names reduce { _ + _}  )
println(  names reduce { _ + _.split(" ")(0) }  )



//Q. if all the names contain a space, print "every name has a space!"
// HINT: forall contains 
if( names forall { _ contains " "} ) println("every name has a space!")

val dates: List[(Int, Int, Int)] = List(
	(3, 12, 1900), 
	(4, 11, 1901), 
	(7, 12, 1902)
)

//Q. does every date occur after october?
// HINT: forall  ._2
println( dates forall { _._2 > 10 } )

// Q. do any dates start on the first of the month?
// HINT: exists ._1
println( dates exists { _._1 == 1 } )


// Q. print out all the names using foreach
names foreach println


// Q. print out all the date years using foreach
// HINT: you may need to spell out the function in full
// ....  (date: (Int, Int, Int)) =>
dates foreach { (date: (Int, Int, Int)) => println(date._3 ) }

// EXTRA:

// Q. rephrase the following as a for-comprehension
names flatMap {  _.split(" ") } foreach println

for {
 n <- names
 p <- n.split(" ")
} println( p.toUpperCase )


 
