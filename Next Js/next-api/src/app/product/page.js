import Image from "next/image";

async function getProducts() {
  let data = await fetch("http://localhost:3000/api/product");
  data = await data.json();
  return data.result;
}

export default async function Product() {
  let productData = await getProducts();
  return (
    <div>
      <h1>Product Details</h1>
      <table>
        <tbody>
          {productData?.map((i) => {
            return (
              <tr key={i.id}>
                <td>
                  <Image
                    src={i.image}
                    alt="Image"
                    height={100}
                    width={100}
                    loading="eager"
                  ></Image>
                </td>
                <td>{i.name}</td>
                <td>{i.company}</td>
                <td>{i.price}</td>
                <td>{i.category}</td>
                <td>{i.color}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}
