import { myFunc } from "../src/index";
import {describe, it, expect } from "vitest";

describe('Test Suite', () => {
    it('Should be first test', () => {
        expect(myFunc()).toBeTruthy();
    })
});

