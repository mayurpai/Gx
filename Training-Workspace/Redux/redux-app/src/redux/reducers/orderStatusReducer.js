import { GET_ORDER_STATUS } from "../constants/appConstant";
export default function (state = {}, action) {
  switch (action.type) {
    case GET_ORDER_STATUS:
      return { ...state, orderStatusData: action.payload.orderStatus };
    default:
      return state;
  }
}
