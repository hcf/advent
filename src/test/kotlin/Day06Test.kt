import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

class Day06Test {

    @Test
    fun `should solve example input for part 1`() {
        assertEquals(Day06.solvePart1("mjqjpqmgbljsphdztnvjfqwrcgsmlb"), 7)
        assertEquals(Day06.solvePart1("bvwbjplbgvbhsrlpgdmjqwftvncz"), 5)
        assertEquals(Day06.solvePart1("nppdvjthqldpwncqszvftbrmjlhg"), 6)
        assertEquals(Day06.solvePart1("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"), 10)
        assertEquals(Day06.solvePart1("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"), 11)
    }

    @Test
    fun `should solve puzzle input for part 1`() {
        // Assuming everything is correct, the output should be correct, but running it as a test for a good workflow
        println(Day06.solvePart1(File("src/test/resources/puzzle_input_06.txt").readLines()[0]))
    }

    @Test
    fun `should solve example input for part 2`() {
        assertEquals(Day06.solvePart2("mjqjpqmgbljsphdztnvjfqwrcgsmlb"), 19)
        assertEquals(Day06.solvePart2("bvwbjplbgvbhsrlpgdmjqwftvncz"), 23)
        assertEquals(Day06.solvePart2("nppdvjthqldpwncqszvftbrmjlhg"), 23)
        assertEquals(Day06.solvePart2("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"), 29)
        assertEquals(Day06.solvePart2("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"), 26)
    }


    @Test
    fun `should solve puzzle input for part 2`() {
        // Assuming everything is correct, the output should be correct, but running it as a test for a good workflow
        println(Day06.solvePart2(File("src/test/resources/puzzle_input_06.txt").readLines()[0]))
    }
}