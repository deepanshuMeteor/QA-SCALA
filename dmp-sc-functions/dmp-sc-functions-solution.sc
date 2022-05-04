// CHAPTER:   FUNCTIONS
// TIME:      20 m


/*  OBJECTIVES:
	- create a function with =>
	- type annotation to a varaible that contains a function
	- call a function 
	- runtime-select which function to call
*/


// Q. define paint, a function which accepts a string
//... and makes it, say, .toUpperCase or .toLowerCase, 
//... or otherwise formats it 
// HINT: (s: String) =>

val paint =
  (s: String) => s.toLowerCase
  
  

// Q. define format,  which is
//...  		(s: String) => "!" + s + "!"
//... add a type annotation to format 

val format : String => String =
  (s: String) => "!" + s + "!"

// or,  s"! $s !"

  
// Q. paint & format the string
//... "Lets Make A Lego Model"

println(
  paint(format("Lets Make A Lego Model"))
)


// Q. define var fn = paint

var fn = paint

// Q. define val timeOfDay, eg. AM
//.. if its AM, change fn to be format 
val timeOfDay = "AM"
if(timeOfDay == "AM") {
  fn = format;
}

//Q. use fn to print and format "Try Again"
println(fn("Try Again"))



// EXTRA:
// Q. simplify the definition of format
// .... define it with an underscore only 
// HINT:  "!" +

val fShort : String => String = "!" + _ + "!"

println(fShort("Hello"))



// Q. define a series of String => String 
//... and hold them in a List()

val format1 : String => String =
(s: String) => s"? $s !"

val format2 : String => String =
  (s: String) => s"! $s !"

val format3 : String => String =
  (s: String) => s"? $s ?"


val fms = List(format1, format2, format3)

//Q. randomly select a function and run with "Great Building Skills"
// HINT: val fn = Random.shuffle(functions).head

import scala.util.Random

val rfn = Random.shuffle(fms).head

rfn("Great Building Skills")


