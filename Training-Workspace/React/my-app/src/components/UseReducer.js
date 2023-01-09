// import React, { useState } from "react";

// export default function UseReducer() {
//   const [count, setCount] = useState(0);
//   const [showText, setShowText] = useState(true);
//   return (
//     <div>
//       <button
//         type="button"
//         onClick={() => {
//           setCount(count + 1);
//           setShowText(!showText);
//         }}
//       >
//         {count}
//         {showText && <p>This Is A Text</p>}
//       </button>
//     </div>
//   );
// }

import React, { useReducer } from "react";

function reducer(state, action) {
  switch (action.type) {
    case "INCREMENT":
      return { count: state.count + 1, showText: state.showText };
    case "toggleShowText":
      return { count: state.count, showText: !state.showText };
    default:
      return state;
  }
}

export default function UseReducer() {
  const [state, dispatch] = useReducer(reducer, { count: 0, showText: true });
  return (
    <div>
      <button
        type="button"
        onClick={() => {
          dispatch({ type: "INCREMENT" });
          dispatch({ type: "toggleShowText" });
        }}
      >
        {state.count}
        {state.showText && <p>This Is A Text</p>}
      </button>
    </div>
  );
}
