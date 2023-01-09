const Contact = ({ fName, lName }) => {
  return (
    <h1
      style={{
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        height: "100vh",
        width: "100vw",
        backgroundColor: "#282c34",
        color: "whitesmoke"
      }}
    >
      Contact Me {fName} {lName}
    </h1>
  );
};

export default Contact;
