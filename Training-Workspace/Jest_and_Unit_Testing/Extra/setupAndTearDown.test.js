describe("My Test Calculator", () => {
  let num1 = 0;
  let num2 = 0;
  beforeAll(() => {
    console.log("This will execute before execution starts");
  });
  afterAll(() => {
    console.log("This will execute after executing all test case");
  });
  beforeEach(() => {
    console.log("This will execute before executing any test case");
    num1 = 2;
    num2 = 2;
  });
  afterEach(() => {
    console.log("This will execute after executing any test case");
    num1 = 0;
    num2 = 0;
  });
  test("calling addition function test", () => {
    let result = 4;
    expect(result).toBe(4);
  });
});
