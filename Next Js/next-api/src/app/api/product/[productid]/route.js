import { connectionStr } from "@/connection/db-connect";
import { Product } from "@/connection/model/product";
import mongoose from "mongoose";
import { NextResponse } from "next/server";

export async function PUT(request, url) {
  try {
    await mongoose.connect(connectionStr);
    const id = url.params.productid;
    const filter = { _id: id };
    const payload = await request.json();
    const result = await Product.findOneAndUpdate(filter, payload);
    return NextResponse.json(result);
  } catch (error) {
    console.log(error);
  }
}

export async function GET(request, url) {
  await mongoose.connect(connectionStr);
  const id = url.params.productid;
  const filter = { _id: id };
  const result = await Product.findById(filter);
  return NextResponse.json(result);
}

export async function DELETE(request, url) {
  await mongoose.connect(connectionStr);
  const id = url.params.productid;
  const filter = { _id: id };
  const result = await Product.deleteOne(filter);
  return NextResponse.json(result);
}
