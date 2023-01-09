import { DECREMENT, INCREMENT } from "../actions/Action";

const initialState = {
  count: 0,
  title: "My Counter",
};

function reducer(state = initialState, action) {
  switch (action.type) {
    case INCREMENT:
      return {
        ...state,
        count: state.count + action.payload,
      };
    case DECREMENT:
      return {
        ...state,
        count: state.count - action.payload,
      };
    default:
      return state;
  }
}

export default reducer;
