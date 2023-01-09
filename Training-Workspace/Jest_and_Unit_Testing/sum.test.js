const sum = require("./sum");
test("adds 1 + 2 to equal 3", () => {
  expect(sum(1, 2)).toBe(3);
});

describe("Testing Sum", () => {
  function sum(a, b) {
    return a + b;
  }
  it("should equal 4", () => {
    expect(sum(2, 2)).toBe(4);
  });
  test("lso should equal 4", () => {
    expect(sum(2, 2)).toBe(4);
  });
});

describe("Testing Sum", () => {
  function sum(a, b) {
    return a + b;
  }
  it("should equal 4", () => {
    expect(sum(2, 2)).toBe(4);
  });
  test("also should equal 4", () => {
    expect(sum(2, 2)).toBe(4);
  });
  it("should equal 4", () => {
    expect(sum(2, 2)).toBe(4);
  });
});

test("adds 1 + 2 to equal 3", () => {
  expect(sum(1, 2)).toBe(3);
});
test("adds 2 + 2 to equal 5", () => {
  expect(sum(2, 2)).toBe(5);
});
