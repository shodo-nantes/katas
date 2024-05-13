import { myFunc } from "../src/index";

describe('Test Suite', () => {
    test('First Test', () => {
        expect(myFunc()).toBeTruthy();
    })
});

