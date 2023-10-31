import Script from "next/script";

function page() {
  return (
    <div>
      <Script
        src="/getGeoLocation.js"
        onLoad={console.log("File Loaded")}
      ></Script>
      <h1>Get Geo Location</h1>
      <h1 id="demo"></h1>
    </div>
  );
}

export default page;
