export const INCREMENT = "INCREMENT";
export const DECREMENT = "DECREMENT";

const increment = () => {
  return {
    type: INCREMENT,
    payload: 1,
  };
};

const decrement = () => {
  return {
    type: DECREMENT,
    payload: 1,
  };
};

export { increment, decrement };
