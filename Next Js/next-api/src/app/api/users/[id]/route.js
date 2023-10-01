import { userData } from "@/app/util/user-data";
import { NextResponse } from "next/server";

export async function GET(request, url) {
  let id = url.params.id;
  let data = userData.filter((i) => i.id == id);
  return NextResponse.json(data.length != 0 ? data : [], {
    status: data.length != 0 ? 200 : 404,
    statusText: data.length != 0 ? "Awesome!" : "Not Awesome!",
  });
}

export async function PUT(request, url) {
  let payload = await request.json();
  console.log(payload);
  console.log(url);
  let id = url.params.id;
  payload.id = id
  return NextResponse.json(payload, {
    status: 200,
    statusText: "Awesome!",
  });
}
