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
