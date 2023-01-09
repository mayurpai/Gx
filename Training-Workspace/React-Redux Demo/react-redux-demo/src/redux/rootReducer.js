import { combineReducers } from "redux";
import cakeReducer from "../redux/cakes/cakeReducer";
import icecreamReducer from "../redux/icecreams/icecreamReducer";

const rootReducer = combineReducers({
  cakes: cakeReducer,
  icecreams: icecreamReducer,
});

export default rootReducer;
