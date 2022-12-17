import axios from "axios";

class ApiService {
  upload(data) {
    return axios.post("http://localhost:9091/file/api/v1/upload", data);
  }
}

export default new ApiService();
