const { NAME, PASSWORD } = process.env;
export const connectionStr =
  "mongodb+srv://" +
  NAME +
  ":" +
  PASSWORD +
  "@cluster0.raazjmp.mongodb.net/productDB?retryWrites=true&w=majority";
