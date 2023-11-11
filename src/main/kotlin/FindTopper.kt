/**
 * Given the list of student roll numbers and names
 * val students = listOf(Student(101, "Ramesh"), Student(102, "Seema"), Student(103, "Harry")
 *                       Student(104, "Ravi"), Student(104, "Varshini"), Student(105, "Deepa"))
 *  And their marks in Physics, Chemistry and Mathematics corresponding to their roll numbers
 *  Marks(101, 56, 84, 91), Marks(102, 100, 78, 43),
 *  Marks(103, 39, 75, 83), Marks(104, 98, 94, 90),
 *  Marks(105, 51, 75, 83), Marks(106, 79, 96, 85)
 *  Print the name of the topper of this examination
 *  This requires knowledge of kotlin scopes and collection frameworks to make the solution efficient.
 *
 *  Author: Sanjan Hegde
 */


data class Student(val rollNum: Int, val name: String?)

data class Marks(val studentRollNum: Int, val phy: Int, val che: Int, val math: Int)

val students = listOf(
    Student(101, "Ramesh"),
    Student(102, "Seema"),
    Student(103, "Harry"),
    Student(104, "Ravi"),
    Student(105, "Varshini"),
    Student(106, "Deepa")
)

val marks = listOf(
    Marks(101, 56, 84, 91), Marks(102, 100, 78, 43),
    Marks(103, 39, 75, 83), Marks(104, 88, 94, 90),
    Marks(105, 91, 95, 98), Marks(106, 79, 96, 85)
)

//Return Student name who has the highest total
fun getTopperName(mark: List<Marks>, student: List<Student>): String? {
    var topperRollNumber = -1
    var tooperMarks: Int = Int.MIN_VALUE
    for (values in mark) {
        val total = values.let {
            it.che + it.phy + it.che
        }
        if (total > tooperMarks) {
            tooperMarks = total
            topperRollNumber = values.studentRollNum
        }
    }
    return student.find { it.rollNum == topperRollNumber }?.name
}

fun main() {
    print("Topper is ${getTopperName(marks, students)}") // Output : "Topper is Varshini"
}