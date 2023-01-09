const identityMatrix = (matrix) => {
  let flag = true;
  for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
      if (i == j && matrix[i][j] != 1) flag = false;
      else if (i != j && matrix[i][j] != 0) flag = false;
      else flag = true;
    }
  }
  if (flag) console.log("It Is A Identity Matrix");
  else console.log("It Is Not A Identity Matrix");
};

let matrixOne = [
  [1, 0, 0],
  [0, 1, 0],
  [0, 0, 1],
];
let matrixTwo = [
  [1, 2, 4],
  [2, 4, 5],
  [3, 5, 8],
];
identityMatrix(matrixOne);
identityMatrix(matrixTwo);
