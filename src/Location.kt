package kotlinversion

import kotlin.math.absoluteValue

data class Location(
    val x:Int,
    val y:Int
){
    fun calculateDistance(other:Location):Int{
        return (x-other.x).absoluteValue + (y-other.y).absoluteValue
    }
}