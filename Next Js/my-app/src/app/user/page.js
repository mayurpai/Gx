import { allConsts } from "@/config/constants";
async function getAllUsers() {
  let data = await fetch("https://dummyjson.com/users");
  data = await data.json();
  return data.users;
}

async function User() {
  console.log(process.env.PASSWORD);
  console.log(allConsts.API_BASE_URL);
  console.log(allConsts.DB_PASS);
  let res = await getAllUsers();
  let style = { padding: "10px" };
  // console.log(res);
  return (
    <div>
      <h1>Hello Users!</h1>
      <img src="/static.jpg"></img>
      <table>
        <tbody>
          {res.map((i) => {
            return (
              <tr key={i.id}>
                <td style={style}>{i.id}</td>
                <td style={style}>{i.firstName}</td>
                <td style={style}>{i.lastName}</td>
                <td style={style}>{i.age}</td>
                <td style={style}>{i.gender}</td>
                <td style={style}>{i.email}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}

// generateMetadat Doesn't Work With use client
export function generateMetadata() {
  return {
    title: "User Page",
    description: "A Page Decribing The User Page",
  };
}

export default User;
