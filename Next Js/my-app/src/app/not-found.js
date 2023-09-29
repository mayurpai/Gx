"use client";
import Image from "next/image";
import nextImage from "../../public/next.svg";
import { Roboto } from "next/font/google";
const roboto = Roboto({
  weight: "100",
  style: "italic",
  display: "swap",
  subsets: ["vietnamese"],
});
function NotFound() {
  return (
    <div>
      {console.log(nextImage)}
      <h1 className={roboto.className}>GLOBAL NOT FOUND </h1>
      <h2 style={{ fontFamily: "Onest" }}>404</h2>
      <Image alt="next" src={nextImage} height={200} width={200} />
      <img src={nextImage.src}></img>
    </div>
  );
}

export default NotFound;
