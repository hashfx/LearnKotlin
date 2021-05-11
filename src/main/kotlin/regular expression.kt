import kotlin.test.assertTrue

/*
Regular Expression (RegEx) in Kotlin
    A pattern is a regular expression that defines the text we are searching for or
    manipulating. It consists of text literals and metacharacters.
    RegEx is aka 'character that constructs a search pattern'
Note
    ^ denotes the beginning of expression
    $ denotes the end of expression


 */

fun main(args: Array<String>) {
    val regex: Regex = """a([bc]+)d?""".toRegex()
    assertTrue(regex.containsMatchIn("xabcy"))
    assertTrue(regex.matches("abcd"))
    assertTrue(regex matches("abcd"))

}