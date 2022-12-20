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

    it('should solve example input for part 2', () => {
        assert.equal(new Day04().solvePart2(readLines(exampleInputPath)), 4)
    })

    it('should solve puzzle input for part 2', () => {
        console.log(new Day04().solvePart2(readLines(puzzleInputPath)))
    })
})