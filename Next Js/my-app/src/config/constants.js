export const allConsts = {
  API_BASE_URL:
    process.env.NODE_ENV == "development"
      ? "www.api.dev.example.com"
      : "www.api.prod.example.com",
  DB_PASS: process.env.NODE_ENV == "development" ? "pass123" : "pass789",
};
