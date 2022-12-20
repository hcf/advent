import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

class Day04Test {

    @Test
    fun `should solve example input for part 1`() {
        assertEquals(Day04.solvePart1(File("src/test/resources/example_input_04.txt").readLines()), 2)
    }

    @Test
    fun `should solve puzzle input for part 1`() {
        // Assuming everything is correct, the output should be correct, but running it as a test for a good workflow
        println(Day04.solvePart1(File("src/test/resources/puzzle_input_04.txt").readLines()))
    }

    @Test
    fun `should solve example input for part 2`() {
        assertEquals(Day04.solvePart2(File("src/test/resources/example_input_04.txt").readLines()), 4)
    }

    @Test
    fun `should solve puzzle input for part 2`() {
        // Assuming everything is correct, the output should be correct, but running it as a test for a good workflow
        println(Day04.solvePart2(File("src/test/resources/puzzle_input_04.txt").readLines()))
    }
}