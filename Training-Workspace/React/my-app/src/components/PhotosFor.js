import React from "react";
function PhotosFor({ photosFor }) {
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "space-between",
        alignItems: "center",
        height: "100vh",
        width: "100vw",
        backgroundColor: "#282c34",
        color: "whitesmoke",
      }}
    >
      {photosFor.map(function (image) {
        return (
          <div style={{ display: "flex", flexDirection: "column" }}>
            <img src={image.src} height={300} width={300}></img>
            <h6
              style={{
                fontSize: "0.6rem",
                height: "30px",
                width: "40px",
                marginLeft: "2%",
              }}
            >
              {image.src}
            </h6>
          </div>
        );
      })}
    </div>
  );
}

export default PhotosFor;
