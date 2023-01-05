import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import HomeDeals from "./pages/HomeDeals";
import ElectronicDeals from "./pages/ElectronicDeals";
import ClothingDeals from "./pages/ClothingDeals";
import ToyDeals from "./pages/ToyDeals";
import BeautyDeals from "./pages/BeautyDeals";
import SearchResult from "./pages/SearchResult";
import SignIn from "./pages/SignIn";
import Product from "./pages/Product";
import Cart from "./pages/Cart";
import AddProduct from "./pages/AddProduct";
import UpdateProduct from "./pages/UpdateProduct";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Home-Deals" element={<HomeDeals />} />
        <Route path="/Electronic-Deals" element={<ElectronicDeals />} />
        <Route path="/Clothing-Deals" element={<ClothingDeals />} />
        <Route path="/Toy-Deals" element={<ToyDeals />} />
        <Route path="/Beauty-Deals" element={<BeautyDeals />} />
        <Route path="/Search-Results" element={<SearchResult />} />
        <Route path="/Sign-In" element={<SignIn />} />
        <Route path="/Product" element={<Product />} />
        <Route path="/Cart" element={<Cart />} />
        <Route path="/Add-Product" element={<AddProduct />} />
        <Route path="/Update-Product" element={<UpdateProduct />} />
        {/* <Route path="*" element={<NoPage />} /> */}
      </Routes>
    </Router>
  );
}

export default App;
