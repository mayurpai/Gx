import axios from "axios";
import React, { useState } from "react";
import { Link } from "react-router-dom";
import ApiService from "../ApiService";

function FileUpload() {
  const [selectedFile, setSelectedFile] = useState([]);

  const onFileChangeHandler = (e) => {
    const formData = new FormData();
    console.log(e);
    console.log(e.target.files[0].name);
    for (let i = 0; i < e.target.files.length; i++) {
      formData.append("file", e.target.files[i]);
    }
    ApiService.upload(formData).then((response) => {
      console.log(response.data);
      console.log(response.data);
      setSelectedFile(response.data);
      alert("File Uploaded Successfully.");
    });
  };

  const getInputFile = async (filename) => {
    await axios
      .get(`http://localhost:9091/file/api/v1/view/${filename}`)
      .then((response) => {
        document.getElementById("read").innerHTML = response.data;
      });
  };

  return (
    <div>
      <div className="container">
        <div className="row">
          <div className="col-md-6">
            <div className="form-group file color">
              <label>Upload Your File </label>
              <input
                type="file"
                className="form-control"
                name="file"
                multiple
                id
                onChange={onFileChangeHandler}
              />
              <a href="http://localhost:9091/file/api/v1/downloadFile">
                Download File
              </a>
              <button onClick={() => getInputFile(selectedFile[0].fileName)}>
                Get Input File
              </button>
              <div id="read"></div>
              {/* {selectedFile.map(function (data) {
                return <li>{data.data}</li>;
              })} */}
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default FileUpload;
