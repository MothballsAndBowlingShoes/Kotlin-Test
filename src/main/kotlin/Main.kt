import java.util.Scanner

val reader = Scanner(System.`in`)
public var partyLevel: Int = 0
fun main() {
    print("What is your party level?")
    partyLevel = reader.nextInt()

    print("Do you want 1) Higher enemy density with Lower Combat Rating? 2) Lower Enemy Density with Higher Combat Rating?")
    val choice = reader.nextInt()

    if (choice == 1) {

    } else if (choice == 2) {
        sortingByCombatRating()
    } else (
        print("Sorry, that's not a valid action!")
    )
}