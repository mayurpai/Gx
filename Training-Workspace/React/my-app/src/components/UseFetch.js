import axios from "axios";
import { useState, useEffect } from "react";

const UseFetch = (url) => {
  const [data, setData] = useState(null);

  useEffect(() => {
    fetch(url)
      .then((res) => res.json())
      .then((data) => setData(data));
  }, [url]);

  // useEffect(() => {
  //   axios.get(url).then((res) => setData(res.data));
  // }, [url]);

  return [data];
};

export default UseFetch;
