import React, { useEffect, useState } from "react";
import axios from "axios";

export const MenuCategory = () => {
  const base_url = "https://www.themealdb.com/api/json/v1/1/categories.php";
  const [categories, setCategories] = useState([]);
  useEffect(() => {
    async function fetchData() {
      const request = await axios.get(base_url);
      setCategories(request.data.categories);
      console.log(request.data.categories);
    }
    fetchData();
  }, []);

  // const categoriesMenu = [
  //   {
  //     idCategory: "1",
  //     strCategory: "Chicken",
  //     strCategoryThumb:
  //       "https://th.bing.com/th/id/OIP.3UxeotDL0x1TbB-5L9vo5QHaHE?pid=ImgDet&rs=1",
  //     strCategoryDescription:
  //       "Chicken Is A Type Of Domesticated Fowl, A Subspecies Of The Red Junglefowl.",
  //   },
  //   {
  //     idCategory: "2",
  //     strCategory: "Dessert",
  //     strCategoryThumb:
  //       "https://th.bing.com/th/id/OIP.Yn4oqNQ897Y_tMwpivDhhQHaKX?pid=ImgDet&rs=1",
  //     strCategoryDescription: "Dessert Is A Course That Concludes A Meal.",
  //   },
  // ];
  return (
    <div>
      <div className="container pt-4 pb-2 border-bottom">
        {categories.map((categories) => (
          <div
            key={categories.idCategory}
            className="row border-bottom border-top border-left border-right"
          >
            <div className="col-lg-2 col-md-2 col-sm-2 px-0 text-center mt-3">
              <img
                style={{ width: "50%", height: "60%", margin: "0" }}
                alt="Natural Healthy Food"
                src={categories.strCategoryThumb}
              />
            </div>
            <div className="col-lg-10 col-md-10 col-sm-10 px-0">
              <h2 className="text-left">{categories.strCategory}</h2>
              <p className="mb-1 left-left">
                <small>{categories.strCategoryDescription}</small>
              </p>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};
