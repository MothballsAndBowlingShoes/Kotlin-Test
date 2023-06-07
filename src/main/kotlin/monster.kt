/*
val name: String? = null
val combatRating: Double? = null
val armorClass: Int? = null
val hitPoints: Int? = null
val speed: Int? = null
*/

class Monster (private val name: String, public val combatRating: Double, private val armorClass: Int, private val hitPoints: Int, private val speed: Int) {


    override fun toString(): String {
        return this.name + " has a combat rating of " + this.combatRating + " with a armor class of " + this.armorClass + " with a max hit points of " + this.hitPoints + " and a speed of " + this.speed
    }

}