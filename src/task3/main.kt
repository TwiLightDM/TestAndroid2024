package task3

import task3.SquareBased.FourSidesPrism
import task3.SquareBased.FourSidesPyramid
import task3.other.Sphere
import task3.triangleBased.ThreeSidesPrism
import task3.other.Utils
import task3.triangleBased.ThreeSidesPyramid

fun main(){
    val fourSidesPyramid = FourSidesPyramid(4,5,6)
    val fourSidesPrism = FourSidesPrism(4,5,6)
    val threeSidesPrism = ThreeSidesPrism(3,4,5,8)
    val threeSidesPyramid = ThreeSidesPyramid(6,8,10,4)
    val sphere = Sphere(5)
    Utils.calculateArea(fourSidesPyramid,fourSidesPrism, threeSidesPrism, threeSidesPyramid, sphere)
    println()
    Utils.calculateVolume(fourSidesPyramid,fourSidesPrism, threeSidesPrism, threeSidesPyramid, sphere)
    println()
    Utils.calculateTriangleVolume(threeSidesPrism, threeSidesPyramid)
}
