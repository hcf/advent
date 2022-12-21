@JvmInline
value class SectionAssignment(private val range: IntRange) {
    fun fullyOverlaps(value: SectionAssignment): Boolean =
        range.contains(value.range.first) && range.contains(value.range.last)

    fun overlaps(value: SectionAssignment): Boolean =
        range.contains(value.range.first) || range.contains(value.range.last)
}


object Day04 {

    fun solvePart1(lines: List<String>): Int =
        lines.mapToSectionAssignments().count { it.hasFullyOverlappingAssignments() }

    fun solvePart2(lines: List<String>): Int =
        lines.mapToSectionAssignments().count { it.hasOverlappingAssignments() }

    private fun List<String>.mapToSectionAssignments() =
        this.map { line ->

            val (first, second) = line.split(",")
                .map { stringAssignment ->
                    val (start, end) = stringAssignment.split("-")
                    SectionAssignment(
                        range = (start.toInt()..end.toInt())
                    )
                }

            Pair(first, second)
        }


    private fun Pair<SectionAssignment, SectionAssignment>.hasFullyOverlappingAssignments(): Boolean =
        first.fullyOverlaps(second) || second.fullyOverlaps(first)

    private fun Pair<SectionAssignment, SectionAssignment>.hasOverlappingAssignments(): Boolean =
        first.overlaps(second) || second.overlaps(first)
}
