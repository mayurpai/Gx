// Server Side API Fetch
import ButtonComponent from './ButtonComponent'

async function apiCall() {
  let data = await fetch("https://dummyjson.com/products");
  data = await data.json();
  return data.products;
}

export default async function Product() {
  let productList = await apiCall();
  return (
    <div>
      <h1>Product List</h1>
      {console.log(productList)}
      {productList.map((i) => (
        <div style={{ display: "flex" }}>
          <h6>{i.title}</h6>
          <ButtonComponent data={i} />
        </div>
      ))}
    </div>
  );
}
