import { useState, useEffect } from "react";

export default function Demo2() {
  const [count, setCount] = useState(0);
  const [countOne, setCountOne] = useState(0);

  useEffect(() => {
    document.title = `You clicked ${count} and ${countOne} times`;
  });

  return (
    <div>
      <p>You clicked {count} {countOne} times</p>
      <button onClick={() => setCount(count + 1)}>Click me +</button>
      <button onClick={() => setCountOne(countOne - 1)}>Click me -</button>
    </div>
  );
}
