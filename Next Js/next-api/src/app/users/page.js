import Link from "next/link";
import DeleteButton from "../components/DeleteButton";

async function getUsers() {
  let data = await fetch("http://localhost:3000/api/users");
  data = await data.json();
  return data;
}

export default async function User() {
  let userData = await getUsers();
  return (
    <div>
      <h1>User Details</h1>
      <table>
        <tbody>
          {userData.map((i) => {
            return (
              <tr key={i.id}>
                <Link href={`/users/${i.id}`}>
                  <td style={{ backgroundColor: "red", padding: "10px" }}>
                    {i.id}
                  </td>
                </Link>
                <td>{i.name}</td>
                <td>{i.age}</td>
                <td>{i.email}</td>
                <td><Link href={`/users/${i.id}/update`}>Edit</Link></td>
                <td><DeleteButton id={i.id}></DeleteButton></td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}
