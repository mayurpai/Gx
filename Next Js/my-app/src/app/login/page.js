"use client";
import { useRouter } from "next/navigation.js";
import Intro from "./intro.js";
import Link from "next/link";

function Login() {
  const router = useRouter();
  const navigate = () => {
    router.back();
  };
  return (
    <div>
      <Link href="/">Redirect To Home</Link>
      <Intro></Intro>
      <button onClick={() => navigate()}>Back</button>
    </div>
  );
}

export default Login;
