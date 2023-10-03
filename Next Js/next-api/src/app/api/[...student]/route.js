import { NextResponse } from "next/server";

export async function GET(request, url) {
  return NextResponse.json(url.params.student, {status: 200, statusText: "Awesome!"})
}
