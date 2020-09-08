package sapi.com.learningkotlin.object_oriented


fun main() {

    println(Directions.NORTH) // or println(Directions.NORTH.name)
    println(Directions.NORTH.ordinal)

    val shape = Shapes.SQUARE
    val vertices = when(shape) {
        Shapes.CIRCLE -> "NO"
        Shapes.SQUARE, Shapes.RECTANGLE -> "Four"
        Shapes.TRIANGLE -> "Three"
    }

    println(vertices)

    val bike = MotorCycle.TVS
    // if I didn't mention all the values of Enums then
    // I have to use else. Else is like default in switch case but in Kotlin this will automatically be infer if we mention all the enum values
    val bikes = when(bike) {
        MotorCycle.HONDA -> "CD100"
        MotorCycle.HERO -> "Passion"
        MotorCycle.ROYAL -> "Enfield"
        else -> "All Bikes"
    }

    println(bikes)


}

enum class Directions(degree : Double) {
    NORTH(0.0), EAST(90.0), WEST(180.0), SOUTH(270.0)
}

enum class Shapes {
    CIRCLE, TRIANGLE, SQUARE, RECTANGLE
}

enum class MotorCycle {
    HONDA, TVS, ROYAL, HERO
}
