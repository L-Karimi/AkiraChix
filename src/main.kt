fun main(){
    studentsList()
    mystudents()
    mylanguages()
}
data class students(var name:String,var age :Int,var Class:String){
}

fun studentsList(){
    var students = listOf(students("Ann",22,"Anitab"),students("Janet",34,"LisaLab"),students("Ivana",23,"Lovelace"))
var totalAge = 0
    for (student in students){
        totalAge =+student.age
    }
    var averageMarks = totalAge/students.size
    println(averageMarks)
}
fun mystudents(){
   var mylistofstudents = listOf(students("Alex",34,"KU"),students("Peter",45,"Moringa"),students("Marin",21,"Egerton"))
    var averageMarks = mylistofstudents.map { s->s.age }.average().toInt()
    println(averageMarks)
}
fun mylanguages(){
    var languages = listOf("Java","Javascript","Kotlin","C++","c","Ruby","Swift")
    println(languages.sorted())
    var studentsAge = listOf(33,55,33,22,44,55,33,55,33,55,22,45,34,23,45,13,68,78,90)
    println(studentsAge.size)
  println(studentsAge[4])
  println(studentsAge.lastIndexOf(4))
  println( studentsAge.asReversed())
    println(studentsAge.sortedDescending())
}
