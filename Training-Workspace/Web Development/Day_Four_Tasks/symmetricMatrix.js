const symmetricMatrix = (matrix) => {
  let flag = true;
  for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
      if (matrix[i][j] != matrix[j][i]) flag = false;
    }
  }
  if (flag) console.log("It Is A Symmetric Matrix");
  else console.log("It Is Not A Symmetric Matrix");
};

let matrixOne = [
  [1, 2, 3],
  [2, 4, 5],
  [3, 5, 8],
];
let matrixTwo = [
  [1, 2, 4],
  [2, 4, 5],
  [3, 5, 8],
];
symmetricMatrix(matrixOne);
symmetricMatrix(matrixTwo);
