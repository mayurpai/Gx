"use client";
function Lectures({ params }) {
  console.log(params);
  return <div>{params.lectures.map((i) => i + "/")}</div>;
}

export default Lectures;
