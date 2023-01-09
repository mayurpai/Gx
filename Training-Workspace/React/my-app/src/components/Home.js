import "semantic-ui-css/semantic.css";
import { Button, Form, Checkbox } from "semantic-ui-react";
import '../home.css'

const Home = () => {
  return (
    <div className="HomeHeader">
      <h1>Home</h1>
      <Form>
        <Form.Field>
          <label>
            <input placeholder="Enter Your First Name"></input>
          </label>
        </Form.Field>
        <Form.Field>
          <label>
            <input placeholder="Enter Your Last Name"></input>
          </label>
        </Form.Field>
        <Form.Field>
          <Checkbox
            label="I Agree To Terms And Conditons"
            placeholder="Enter Your Last Name"
          />
        </Form.Field>
        <Button type="submit">Submit</Button>
      </Form>
    </div>
  );
};

export default Home;
