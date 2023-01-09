import { combineReducers } from "redux";
import OrderStatusReducer from "./orderStatusReducer";
import GetWishlistDataReducer from "./getWishlistDataReducer";

const rootReducer = combineReducers({
  orderStatusReducer: OrderStatusReducer,
  getWishlistDataReducer: GetWishlistDataReducer,
});
export default rootReducer;
