class Range {
    private readonly start: number;
    private readonly end: number;

    constructor(str: string) {
        const [start, end] = str.split("-").map(Number)

        this.start = start;
        this.end = end;
    }

    contains(range: Range) {
        return this.contains_number(range.start) && this.contains_number(range.end)
    }

    contains_number(number: number) {
        return this.start <= number && this.end >= number;
    }
}

export class Day04 {
    solvePart1(lines: string[]): number {
        const overlapping = lines
            .map(line => {
                const [pair1, pair2] = line.split(',')

                return {x: new Range(pair1), y: new Range(pair2)}
            })
            .filter(({x,y}) => x.contains(y) || y.contains(x)
            ).length

        return overlapping
    }

    solvePart2(lines: string[]): number {
        const overlapping = lines.filter(line => {
            const pair = line.split(',')

            const [first, second] = pair[0].split('-').map(s => Number(s))
            const [third, fourth] = pair[1].split('-').map(s => Number(s))

            if (second < third) {
                return false
            }
            if (third > second) {
                return false
            }
            if (first > third && first > fourth) {
                return false
            } else {
                return true
            }

        }).length

        return overlapping
    }
}