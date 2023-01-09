import { GET_WISHLIST_ITEMS } from "../constants/appConstant";
export default function (state = {}, action) {
  switch (action.type) {
    case GET_WISHLIST_ITEMS:
      return { ...state, wishlistData: action.payload.wishlistData };
    default:
      return state;
  }
}
