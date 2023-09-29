"use client";
import Link from "next/link";
import styles from "./page.module.css";
import custom from "@/style/custom.module.css";
import { useRouter } from "next/navigation";

export default function Home() {
  const router = useRouter();
  const navigate = (routePage) => {
    router.push(routePage);
  };
  return (
    <>
      <Link href="/login">Redirect To Login</Link>
      <button className={styles.code} onClick={() => navigate("/login")}>
        Click Me To Go To Login
      </button>
      <button className={custom.main} onClick={() => navigate("/about")}>
        About
      </button>
    </>
  );
}
