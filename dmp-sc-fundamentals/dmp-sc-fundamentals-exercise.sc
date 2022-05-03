// CHAPTER:   2. FUNDAMENTALS
// OBJECTIVE: Complete the following questions.
// PROBLEM:   Using var and val, describe yourself.
// PROBLEM:   Using boolean operators, describe a bar.
// PROBLEM:   Parse complex data types to describe your hobbies.
// TIME:      30 m


//PART 1 -- VARIABLES & OBJECTS
//Q. define a val, name, which is your name

//Q. define a var, age, which is your age

//Q. define a val, isBirthday,
//... a bool which is whether its your bithday or not
//HINT: just true false 

//Q.  if today's your birthday increase your age by 1,
//... otherwise increase it by 1.0/365
// HINT: you may need to revise the definition of age

//Q. print your age



// PART 2 -- SIMPLE TYPES
val barDistance = 100
val barCrowd = 50
val barBeer = 5

val isFree = barBeer == 0

//Q. define isBusy, isClose, isCheap 
//  the bar is busy when there's more than 25 people
//  the bar is close when it is less than 500m away
//  the bar is cheap when beer is less than 3.50


//Q. if the bar is far and not busy and cheap print "GOING TO BAR"
//Q. otherwise print "NOT GOING TO BAR"

//Q. if the bar is busy and near OR cheap, print "It'll do"
//Q. otherwise print "Nope, won't do!"


// PART 3 -- COMPLEX TYPES: TUPLES, STRINGS & ARRAYS
val person = ("Sherlock Holmes", 27)

//Q. define and assign val pName, pAge from person
// HINT: ._1

//Q. using data, define the val categories
// it should be a comma-separated string which contains each category of hobby 
// ie., 'photography-portraiture, programming-functional, drinking-beer'
// HINT: split :  split ;   mkString(",")

val data = "hobbies:photography-portraiture;programming-functional;drinking-beer"

// Q. print s"My Name is $name" 
// Q. print s"My Age is $age")
// Q. print s"My Hobbies are $categories"


//EXTRA

//Q. if myBirthday is birthday, print "Happy Birthday!"
// HINT: .toInt split ._1 ._2 ._3

val birthday = (12, 1, 1912)
val myBirthday = "12-1-1912"
val parts = myBirthday.split("-")
