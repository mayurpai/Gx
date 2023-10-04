import Image from "next/image";
import Link from "next/link";
import DeleteButton from "../util/DeleteButton";

async function getProducts() {
  let data = await fetch("http://localhost:3000/api/product", {
    cache: "no-cache",
  });
  data = await data.json();
  return data.result;
}

export default async function Product() {
  let productData = await getProducts();
  console.log(productData);
  return (
    <div>
      <h1>Product Details</h1>
      <table>
        <tbody>
          {productData?.map((i) => {
            return (
              <tr key={i._id}>
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
                <td>
                  <Link href={`editproducts/${i._id}`}>Edit</Link>
                </td>
                <td>
                  <DeleteButton id={i._id}></DeleteButton>
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}
