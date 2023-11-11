/** Balanced Brackets
 * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
 * Two brackets are considered to be a matched pair if an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket
 * There are three types of matched pairs of brackets: [], {}, and ().
 * A matching pair of brackets is not balanced if the set of brackets it encloses are not matched.
 * For example, {[(])} is not balanced because the contents in between { and } are not balanced
 *
 * Solution: Use stack to get the most efficient solution
 */


import java.util.Stack

fun isValidBrackets(s: String): Boolean{
    var stack = Stack<Char>()
    for(char in s)
    {
        when(char){
            '(', '{' , '[' -> stack.push(char)
            ')', '}' , ']' ->{
                if(stack.isEmpty()) return false
                val top = stack.pop()
                if ((char == ')' && top != '(') ||
                    (char == '}' && top != '{') ||
                    (char == ']' && top != '[')
                ) {
                    return false
                }
            }
        }
    }
    return stack.isEmpty()
}



fun main() {
    val s1 = "(rt(s{{[ji}}s)))"
    val s2 = "(sa(wd)dsa)"

    println("$s1 has balanced parenthesis: ${isValidBrackets(s1)}") // Output: (rt(s{{[ji}}s))) has balanced parenthesis: false
    print("$s2 has balanced parenthesis: ${isValidBrackets(s2)}") // Output: (sa(wd)dsa) has balanced parenthesis: true
}