"use client";

function StudentDetails({params}) {
  console.log(params);
  return (
    <div>
      Student Details
      <br />
      <br />
      <h1>Name: {params.student}</h1>
      <h1>Id: {params["student-list"]}</h1>
    </div>
  );
}

export default StudentDetails;
