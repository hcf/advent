import {assert, describe, it} from 'vitest'
import {Day04} from "./day04";

import * as fs from 'fs';
import * as path from 'path';

const exampleInputPath = path.resolve(__dirname, '../../test/resources/example_input_04.txt')
const puzzleInputPath = path.resolve(__dirname, '../../test/resources/puzzle_input_04.txt')

function readLines(path: string): string[] {
    return fs.readFileSync(path).toString().split("\n");
}

describe('day 04', () => {
    it('should solve example input for part 1', () => {
        assert.equal(new Day04().solvePart1(readLines(exampleInputPath)), 2)
    })

    it('should solve puzzle input for part 1', () => {
        console.log(new Day04().solvePart1(readLines(puzzleInputPath)))
    })

    /*
    --- Part Two ---

It seems like there is still quite a bit of duplicate work planned. Instead, the Elves would like to know the number of pairs that overlap at all.

In the above example, the first two pairs (2-4,6-8 and 2-3,4-5) don't overlap, while the remaining four pairs (5-7,7-9, 2-8,3-7, 6-6,4-6, and 2-6,4-8) do overlap:

5-7,7-9 overlaps in a single section, 7.
2-8,3-7 overlaps all of the sections 3 through 7.
6-6,4-6 overlaps in a single section, 6.
2-6,4-8 overlaps in sections 4, 5, and 6.
So, in this example, the number of overlapping assignment pairs is 4.

In how many assignment pairs do the ranges overlap?
     */

    it('should solve example input for part 2', () => {
        assert.equal(new Day04().solvePart2(readLines(exampleInputPath)), 4)
    })

    it('should solve puzzle input for part 2', () => {
        console.log(new Day04().solvePart2(readLines(puzzleInputPath)))
    })
})