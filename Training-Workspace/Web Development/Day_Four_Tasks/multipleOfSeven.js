const prompt = require("prompt-sync");

const divideBy2 = () => {
  let count = 0;
  process.stdout.write("Divide By 2 : ");
  for (let i = 1; i < 1000; i++) {
    if (i % 7 == 0 && i % 2 == 1) {
      count++;
      if (count == 3) continue;
      process.stdout.write(i + " ");
      if (count == 4) break;
    }
  }
  console.log();
};

const divideBy3 = () => {
  let count = 0;
  process.stdout.write("Divide By 3 : ");
  for (let i = 1; i < 1000; i++) {
    if (i % 7 == 0 && i % 3 == 1) {
      count++;
      if (count == 3) continue;
      process.stdout.write(i + " ");
      if (count == 4) break;
    }
  }
  console.log();
};

const divideBy4 = () => {
  let count = 0;
  process.stdout.write("Divide By 4 : ");
  for (let i = 1; i < 1000; i++) {
    if (i % 7 == 0 && i % 4 == 1) {
      count++;
      if (count == 3) continue;
      process.stdout.write(i + " ");
      if (count == 4) break;
    }
  }
  console.log();
};

const divideBy5 = () => {
  let count = 0;
  process.stdout.write("Divide By 5 : ");
  for (let i = 1; i < 1000; i++) {
    if (i % 7 == 0 && i % 5 == 1) {
      count++;
      if (count == 3) continue;
      process.stdout.write(i + " ");
      if (count == 4) break;
    }
  }
  console.log();
};

const divideBy6 = () => {
  let count = 0;
  process.stdout.write("Divide By 6 : ");
  for (let i = 1; i < 1000; i++) {
    if (i % 7 == 0 && i % 6 == 1) {
      count++;
      if (count == 3) continue;
      process.stdout.write(i + " ");
      if (count == 4) break;
    }
  }
  console.log();
};

divideBy2();
divideBy3();
divideBy4();
divideBy5();
divideBy6();
