/*
KOTLIN ANNOTATIONS:
    ~ are means of attaching metadata to code.
    To declare an annotation, put the annotation modifier in front of a class

Types of Annotations in Kotlin:
    > Target:
        specifies possible kinds of elements that can be annotated with classes, function, their properties,
            their expression, way of behaviour etc.
    > Retention:
        specifies whether annotation is stored in compiled class files and whether its visible to the reflection.
            of the run time
    > Repeatable:
        allows using the same annotation on single element or variable multiple times.
    > MustBeDocumented:
        specifies that the annotation is a part of the public API and it should be included in a class or method
            signature which is in the generated API document.
            Significance: It has to include method or class in the generated API document



 */

/*
@MyClass class Language{
    @MyClass fun python(@MyClass Language: Int): Int{
        return (@MyClass 1)
    }
}

/* All's Automatic 😉 */
// Annotation target methods
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.EXPRESSION,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.SOURCE)
// Annotation to MyClass generated
annotation class MyClass

fun main(args: Array<String>) {

}

 */