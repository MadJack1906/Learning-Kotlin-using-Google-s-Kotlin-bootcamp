/*
        Use Data Class for regular POJOs
        equals, hashcode are used to compare objects
        While toString is used to print the contents of the obj
 */

data class SampleDataClass(
    var name: String,
    var age: Int,
    var gender: String
)
