import "./App.css";
import { useState, useEffect } from "react";
import io from "socket.io-client";
import { nanoid } from "nanoid";

const port = 5000;
const socket = io.connect("http://localhost:" + port);

function App() {
  const [message, setMessage] = useState("");
  const [chat, setChat] = useState([]);
  const user = nanoid(3);

  useEffect(() => {
    socket.on("chat", (payload) => {
      console.log(payload);
      setChat([...chat, payload]);
    });
  });

  const messageSendAction = (e) => {
    e.preventDefault();
    console.log(socket);
    let socketId = socket.id;
    socket.emit("chat", { message, socketId });
    setMessage("");
  };

  return (
    <div className="App">
      <header className="App-header">
        Chatty App!
        <form onSubmit={messageSendAction}>
          <input
            type="text"
            placeholder="Enter Message Here..."
            value={message}
            onChange={(e) => {
              setMessage(e.target.value);
            }}
          ></input>
          <button type="submit">Send Message</button>
        </form>
        {chat?.map((payload, index) => {
          return (
            <div key={index}>
              {`User: ${payload.socketId}, Message: ${payload.message}`}
              {/* {`${payload}`} */}
            </div>
          );
        })}
      </header>
    </div>
  );
}

export default App;
