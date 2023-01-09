import React from "react";
import { NavLink } from "react-router-dom";

const Header = () => {
  return (
    <nav className="navbar">
      <ul>
        <li>
          <NavLink to="/" exact>
            Home
          </NavLink>
        </li>

        <li>
          {" | "}
          <NavLink to="/courses">Courses</NavLink>
        </li>

        <li>
          {" | "}
          <NavLink to="/about">About</NavLink>
        </li>

        <li>
          {" | "}
          <NavLink to="/menu-category">Menu Category</NavLink>
        </li>
      </ul>
    </nav>
  );
};

export default Header;
