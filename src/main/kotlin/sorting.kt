var monsterList = mutableListOf (
    Monster("Maui",2.0, 10, 20, 15),
    Monster("Thomas",1.0, 10, 20, 15)

)


fun sortingByCombatRating() {
    val copyOfPartyLevel = partyLevel
    monsterList.sortByDescending{it.combatRating}
    val currentEnemyParty = mutableListOf<Monster>()
    while(copyOfPartyLevel > 0) {
        for(i in monsterList.indices) {
            if(copyOfPartyLevel > monsterList[i].combatRating)
            {
                copyOfPartyLevel - monsterList[i].combatRating
                currentEnemyParty.add(monsterList[i])
            }

        }
    }
    print(currentEnemyParty)
}