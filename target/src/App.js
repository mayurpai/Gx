import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import BottomFooter from "./components/BottomFooter";
import Footer from "./components/Footer";
import Header from "./components/Header";
import TopHeader from "./components/TopHeader";
import Home from "./pages/Home";
import HomeDeals from "./pages/HomeDeals";
import ElectronicDeals from "./pages/ElectronicDeals";
import ClothingDeals from "./pages/ClothingDeals";
import ToyDeals from "./pages/ToyDeals";
import BeautyDeals from "./pages/BeautyDeals";
import SearchResult from "./pages/SearchResult";

function App() {

  return (
    <Router>
      <TopHeader />
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Home-Deals" element={<HomeDeals />} />
        <Route path="/Electronic-Deals" element={<ElectronicDeals/>} />
        <Route path="/Clothing-Deals" element={<ClothingDeals />} />
        <Route path="/Toy-Deals" element={<ToyDeals />} />
        <Route path="/Beauty-Deals" element={<BeautyDeals />} />
        <Route path="/Search-Results" element={<SearchResult />} />
        {/* <Route path="*" element={<NoPage />} /> */}
      </Routes>
      <Footer />
      <BottomFooter />
    </Router>
  );
}

export default App;
