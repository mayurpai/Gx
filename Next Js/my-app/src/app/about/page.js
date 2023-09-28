"use client";
import { useRouter } from "next/navigation";

function page() {
  const router = useRouter();
  const navigate = (path) => {
    router.push(`/about/${path}`);
  };
  return (
    <div>
      <button onClick={() => navigate("about-student")}>About Student</button>
    </div>
  );
}

export default page;
