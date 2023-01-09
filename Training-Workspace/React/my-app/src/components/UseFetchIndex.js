import ReactDOM from "react-dom/client";
import UseFetch from "./UseFetch";

export default function UseFetchIndex() {
  const [data] = UseFetch("https://jsonplaceholder.typicode.com/todos");

  return (
    <>
      {data &&
        data.map((item) => {
          return <h3 key={item.id}>{item.title}</h3>;
        })}
    </>
  );
};
