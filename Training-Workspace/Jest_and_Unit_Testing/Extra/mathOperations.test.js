const mathOperations = require("./mathOperations");
describe("Calculator tests", () => {
  test("adding 2 + 3 makes 5", () => {
    expect(mathOperations.sum(2, 3)).toBe(5);
  });
  test("subtracting 2 - 3 makes -1", () => {
    expect(mathOperations.subtraction(2, 3)).toBe(-1);
  });
  test("multiplication of 2 and 3 makes 6", () => {
    expect(mathOperations.sum(2, 3)).toBe(6);
  });
  test("4 / 2 makes 2", () => {
    expect(mathOperations.sum(4, 2)).toBe(2);
  });
  test("5 % 2 makes 1", () => {
    expect(mathOperations.sum(5, 2)).toBe(1);
  });
  test("equality matchers", () => {
    expect(2 * 4).toBe(8);
    expect(4 - 1).not.toBe(4);
  });
  test("truth test", () => {
    let name = "Mayur Pai";
    let n = null;
    expect(n).toBeNull();
    expect(name).not.toBeNull();
    expect(name).toBeTruthy();
    expect(n).toBeTruthy();
    expect(n).toBeFalsy();
    expect(0).toBeFalsy();
  });
  test("number matching", () => {
    let num1 = 100;
    let num2 = -20;
    let num3 = 0;
    expect(num1).toBeGreaterThan(150);
    expect(num1).toBeGreaterThan(50);
    expect(num2).toBeLessThan(1);
    expect(num3).toBeGreaterThanOrEqual(0);
  });
  test("String testing", () => {
    let name = "Mayur Pai";
    expect(name).toMatch("Mayur");
    expect(name).not.toMatch("B H");
  });
});
