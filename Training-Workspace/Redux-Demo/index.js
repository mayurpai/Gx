const redux = require("redux");
const reduxLogger = require("redux-logger");

const createStore = redux.createStore;
const combineReducers = redux.combineReducers;
const logger = reduxLogger.createLogger();
const applyMiddleware = redux.applyMiddleware;

// Action Is An Object Having Type Property
// Action Creator Is A Function That Returns An Action

const BUY_CAKE = "BUY_CAKE";
const BUY_ICECREAM = "BUY_ICECREAM";

function buyCakes() {
  return {
    type: BUY_CAKE,
    info: "First Redux Action",
  };
}

function buyIceCreams() {
  return {
    type: BUY_ICECREAM,
    info: "Second Redux Action",
  };
}

// (previousState, action) => newState

// const initialState = {
//   numOfCakes: 10,
//   numOfIceCreams: 20,
// };

const cakesInitialState = {
  numOfCakes: 10,
};

const iceCreamsInitialState = {
  numOfIceCreams: 20,
};

// Pure Reducer Function

// function reducer(state = initialState, action) {
//   switch (action.type) {
//     case BUY_CAKE:
//       return {
//         ...state,
//         numOfCakes: state.numOfCakes - 1,
//       };
//     case BUY_ICECREAM:
//       return {
//         ...state,
//         numOfIceCreams: state.numOfIceCreams - 1,
//       };

//     default:
//       return state;
//   }
// }

function cakesReducer(state = cakesInitialState, action) {
  switch (action.type) {
    case BUY_CAKE:
      return {
        ...state,
        numOfCakes: state.numOfCakes - 1,
      };

    default:
      return state;
  }
}

function iceCreamsReducer(state = iceCreamsInitialState, action) {
  switch (action.type) {
    case BUY_ICECREAM:
      return {
        ...state,
        numOfIceCreams: state.numOfIceCreams - 1,
      };

    default:
      return state;
  }
}

// Combine Reducer

const rootReducer = combineReducers({
  cake: cakesReducer,
  iceCream: iceCreamsReducer,
});

// createStore(reducer)
// getState()
// subscribe()
// dispatch(actionCreator)
// unsubscribe()

// const store = createStore(rootReducer);
const store = createStore(rootReducer, applyMiddleware(logger));
console.log("Initial State: ", store.getState());
const unsubscribe = store.subscribe(() =>
  console.log("Updated State: ", store.getState())
);
store.dispatch(buyCakes());
store.dispatch(buyCakes());
store.dispatch(buyIceCreams());
store.dispatch(buyIceCreams());
store.dispatch(buyCakes());
unsubscribe();