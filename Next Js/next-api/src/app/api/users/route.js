import { userData } from "@/app/util/user-data";
import { NextResponse } from "next/server";

function nameValidation(payload) {
  if (!payload.name) {
    return true;
  }
}

export async function GET(request) {
  let data = userData;
  return NextResponse.json(data, { status: 200, statusText: "Awesome!" });
}

export async function POST(request) {
  let payload = await request.json();
  let message;
  if (nameValidation(payload)) {
    message = {
      response: "Required Field name Not Entered!",
      status: 404,
      text: "Not Awesome!",
    };
  } else {
    message = { response: "Valid Name!", status: 200, text: "Awesome!" };
  }
  console.log(payload);
  console.log(message);
  return NextResponse.json(message, {
    status: message.status,
    statusText: message.text,
  });
}