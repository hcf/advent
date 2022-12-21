fun String.allCharactersAreUnique(): Boolean = all(hashSetOf<Char>()::add)

fun String.findIndexForCharacterMakingTheFirstSetOfUniqueCharacters(length: Int): Int {
    val firstUniqueString = windowedSequence(length, 1).first {window ->
        window.allCharactersAreUnique()
    }
    return indexOf(firstUniqueString) + length
}

object Day06 {
    fun solvePart1(line: String): Int {
        return line.findIndexForCharacterMakingTheFirstSetOfUniqueCharacters(length = 4)
    }

    fun solvePart2(line: String): Int =
        line.findIndexForCharacterMakingTheFirstSetOfUniqueCharacters(length = 14)

}
