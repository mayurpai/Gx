import React, { useContext } from "react";

const AppContext = React.createContext();
const AppProvider = ({ children }) => {
  return (
    <AppContext.Provider
      value={{
        userEmailStorage: window.atob(localStorage.getItem("token")),
        productIdStorage: window.atob(localStorage.getItem("productIdStore")),
      }}
    >
      {children}
    </AppContext.Provider>
  );
};

const useGlobalContext = () => {
  return useContext(AppContext);
};

export { AppContext, AppProvider, useGlobalContext };
