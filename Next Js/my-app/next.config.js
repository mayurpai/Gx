/** @type {import('next').NextConfig} */
const nextConfig = {
  images: {
    domains: ["upload.wikipedia.org"],
  },
  // output: "export",
  // Redirects Cannot Be Used With Output: Export
  redirects: async () => {
    return [
      {
        source: "/users",
        destination: "/",
        permanent: false
      },
      {
        source: "/study/:lectures/",
        destination: "/",
        permanent: false
      },
    ]
  }
};

module.exports = nextConfig;
