async function getUsers(id) {
  let data = await fetch("http://localhost:3000/api/users/" + id);
  data = await data.json();
  return data;
}

export default async function User({params}) {
  let userData = await getUsers(params.id);
  return (
    <div>
      <h1>User Details</h1>
      <table>
        <tbody>
          {userData.map((i) => {
            return (
              <tr key={i.id}>
                <td>{i.id}</td>
                <td>{i.name}</td>
                <td>{i.age}</td>
                <td>{i.email}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}
