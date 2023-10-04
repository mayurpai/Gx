import { connectionStr } from "@/connection/db-connect";
import { Product } from "@/connection/model/product";
import mongoose from "mongoose";
import { NextResponse } from "next/server";

export async function GET(request, url) {
  let data = [];
  try {
    await mongoose.connect(connectionStr);
    data = await Product.find();
    console.log(data);
  } catch (error) {
    console.log(error);
  }
  return NextResponse.json({ result: data });
}

export async function POST(request, url) {
  let payload = await request.json();
  console.log(payload);
  try {
    await mongoose.connect(connectionStr);
    // let product = new Product({
    //   name: "Poco M4 Pro",
    //   price: "17999",
    //   company: "Poco",
    //   category: "Mobile",
    //   color: "Pink",
    //   image: "https://th.bing.com/th/id/OIP.v7Kp7UUUyF5wEtXHPHyPUgHaHd?pid=ImgDet&rs=1"
    // });
    let product = new Product(payload);
    const res = await product.save();
    return NextResponse.json({ result: res });
  } catch (error) {
    console.log(error);
  }
}
