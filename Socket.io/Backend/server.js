const app = require("express")();
const server = require("http").createServer(app);
const io = require("socket.io")(server, {
  cors: {
    origin: "*",
  },
});
const port = 5000;

io.on("connection", (socket) => {
  console.log(socket);

  socket.on("chat", (payload) => {
    console.log(payload);
    io.emit("chat", payload);
  });
});

server.listen(port, () => {
  console.log("Server Listening On Port " + port);
});
