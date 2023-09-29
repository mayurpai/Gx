import Link from "next/link";

function Student() {
  var listItems = (id, name) => {
    var studentPath = "/student/student-list/" + name;
    return (
      <ul>
        <>
          <Link href={`${studentPath}/${id}`}>
            {id} - {name}
          </Link>
        </>
      </ul>
    );
  };

  return (
    <div>
      Student List <br />
      <br />
      {listItems(1, "Mayur")}
      {listItems(2, "Reshma")}
      {listItems(3, "Kavya")}
      {listItems(4, "Thrish")}
      {listItems(5, "Aksh")}
      {listItems(6, "Sups")}
    </div>
  );
}

export default Student;
