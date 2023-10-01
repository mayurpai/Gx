import { NextResponse } from "next/server";

export async function GET(request) {
  console.log(request);
  return NextResponse.json(
    [
      { name: "Mayur", email: "mayur5pai@gmail.com" },
      { name: "Kavya", email: "kavyasrinivasa@gmail.com" },
    ],
    { status: 200, statusText: "Awesome!" }
  );
}
