import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import BottomFooter from "./components/BottomFooter";
import Footer from "./components/Footer";
import Header from "./components/Header";
import TopHeader from "./components/TopHeader";
import Home from "./pages/Home";

function App() {
  return (
    <Router>
      <TopHeader />
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
        {/* <Route path="Sample" element={<Sample />} /> */}
        {/* <Route path="*" element={<NoPage />} /> */}
      </Routes>
      <Footer />
      <BottomFooter />
    </Router>
  );
}

export default App;
