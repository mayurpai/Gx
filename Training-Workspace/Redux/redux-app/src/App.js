import "./App.css";
import { useDispatch, useSelector } from "react-redux";
import { decrement, increment } from "../src/redux/actions/Action";

function App() {
  const dispatch = useDispatch();
  const counter = useSelector((state) => state.count);
  return (
    <div className="App">
      <header className="App-header">
        <button
          onClick={() => {
            dispatch(increment());
            console.log("Count Value ", counter);
          }}
        >
          +
        </button>
        {counter}
        <button
          onClick={() => {
            dispatch(decrement());
            console.log("Count Value ", counter);
          }}
        >
          {" "}
          -{" "}
        </button>
      </header>
    </div>
  );
}

export default App;
