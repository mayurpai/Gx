import React, { useState, useEffect } from "react";
import { useLocation } from "react-router";
import "../styles/Product.scss";
import axios from "axios";
import BottomFooter from "../components/BottomFooter";
import Footer from "../components/Footer";
import Header from "../components/Header";
import TopHeader from "../components/TopHeader";
import ProductPage from "./ProductPage";

function Product() {
  const [StatusCode, setStatusCode] = useState();
  const [productFix, setProductFix] = useState([]);
  const location = useLocation();
  const getProductNavigateLink = location.state.getProductByIdUrl;
  const getProductNavigateId = location.state.productId;
  useEffect(() => {
    axios
      .get(`${getProductNavigateLink}/${getProductNavigateId}`)
      .then((response) => {
        setProductFix(response.data);
        setStatusCode(response.status);
      })
      .catch((error) => {
        if (error.response) {
          setStatusCode(error.response.status);
          setProductFix(error.response.data);
        } else if (error.request) {
          setStatusCode(error.request);
          setProductFix(Object.values(error.request));
        } else {
          setProductFix(Object.values(error.message));
        }
      });
  }, []);

  return (
    <div>
      <TopHeader />
      <Header />
      <ProductPage product={productFix} />
      <Footer />
      <BottomFooter />
    </div>
  );
}

export default Product;
