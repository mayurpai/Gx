"use client";
function DeleteButton({ id }) {
  const deleteProduct = async () => {
    let res = await fetch(process.env.NEXT_PUBLIC_PRODUCTS_URL + "/" + id, {
        method: "DELETE"
    });
    res = await res.json();
    return res;
  };
  return (
    <div>
      <button onClick={() => deleteProduct()}>Delete</button>
    </div>
  );
}

export default DeleteButton;
