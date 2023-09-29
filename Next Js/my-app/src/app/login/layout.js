"use client";
import { usePathname } from "next/navigation";

export default function Layout({ children }) {
  const pathName = usePathname();
  console.log(pathName);
  return (
    <div>{pathName != "/login" ? "Please Login" : <div>{children}</div>}Common Login Layout</div>
  );
}
