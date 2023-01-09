import { Link } from "react-router-dom";

const Layout = () => {
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        height: "100vh",
        width: "100vw",
        backgroundColor: "#282c34",
        fontSize: "2rem",
        lineHeight: "2",
        color: "whitesmoke",
      }}
    >
      <nav>
        <ul>
          <li>
            <Link style={{ color: "whitesmoke" }} to="/home">
              Home
            </Link>
          </li>
          <li>
            <Link style={{ color: "whitesmoke" }} to="/blogs">
              Blogs
            </Link>
          </li>
          <li>
            <Link style={{ color: "whitesmoke" }} to="/contact">
              Contact
            </Link>
          </li>
          <li>
            <Link style={{ color: "whitesmoke" }} to="/photos">
              Photos
            </Link>
          </li>
          <li>
            <Link style={{ color: "whitesmoke" }} to="/photosFor">
              Photos For
            </Link>
          </li>
        </ul>
      </nav>
    </div>
  );
};

export default Layout;
