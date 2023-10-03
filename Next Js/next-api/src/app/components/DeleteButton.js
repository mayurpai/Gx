"use client";
function DeleteButton({ id }) {
  const deleteUser = async () => {
    console.log(id);
    let res = await fetch("http://localhost:3000/api/users/" + id, {
      method: "DELETE",
    });
    res = await res.json();
    if (res.status == 200) {
      alert(res.response);
    }
  };
  return <button onClick={deleteUser}>Delete</button>;
}

export default DeleteButton;
