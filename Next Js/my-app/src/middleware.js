import { NextResponse } from "next/server";

function middleware(request) {
  if (request.nextUrl.pathname != "/login") {
    return NextResponse.redirect(new URL("/login", request.url));
  }
}
export const config = {
  matcher: ["/about/:path*", "/student/student-list/:path*"],
};
export default middleware;
