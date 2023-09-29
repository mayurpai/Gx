"use client";
function ButtonComponent({ data }) {
  return <button onClick={() => alert(data.price)}>Check Price</button>;
}

export default ButtonComponent;
