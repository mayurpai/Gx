import React from "react";
import { connect } from "react-redux";
import PropTypes from "prop-types";
import { bindActionCreators } from "redux";
import CourseList from "./CourseList";
import { Redirect } from "react-router-dom";
import Spinner from "../common/Spinner";
import { toast } from "react-toastify";
import axios from "axios";

class CoursesPage extends React.Component {
  constructor() {
    super();
    this.state = {
      redirectToAddCoursePage: false,
      courseList: [],
      authorList: [],
    };
    this.getAuthors = this.getAuthors.bind(this);
    this.getCourses = this.getCourses.bind(this);
  }
  componentDidMount() {
    const { courses, authors, actions } = this.props;
    this.getAuthors();
    this.getCourses();
  }

  //Method to fetch author data  from the API
  getAuthors = async () => {
    try {
      const response = await axios.get(process.env.API_URL + "/authors/");
      const authorsListData = response.data;
      console.log("Author List", authorsListData);
      this.setState({ authorList: authorsListData });
    } catch (error) {
      console.log("error", error);
    }
  };

  //Method to fetch list of courses  from the API
  getCourses = async () => {
    try {
      const response = await axios.get(process.env.API_URL + "/courses/");
      const coursesListData = response.data;
      console.log("Courses List", coursesListData);
      this.setState({ courseList: coursesListData });
    } catch (error) {
      console.log("error", error);
    }
  };

  //Method to delete a course
  handleDeleteCourse = async (course) => {
    try {
      const response = await axios.delete(
        process.env.API_URL + "/courses/" + course.id
      );
      console.log("Delete Response", response);
      toast.success("Course Deleted Successfully!");
    } catch (error) {
      toast.error("Delete Operation Failed!" + error.message, {
        autoClose: false,
      });
      console.log("error", error);
    }
  };

  render() {
    return (
      <>
        {this.state.redirectToAddCoursePage && <Redirect to="/course" />}
        <h2>Courses</h2>
        {this.props.loading ? (
          <Spinner />
        ) : (
          <>
            <button
              style={{ marginBottom: 20 }}
              className="btn btn-primary add-course"
              onClick={() => this.setState({ redirectToAddCoursePage: true })}
            >
              Add Course
            </button>

            <CourseList
              onDeleteClick={this.handleDeleteCourse}
              courses={this.state.courseList}
            />
          </>
        )}
      </>
    );
  }
}

CoursesPage.propTypes = {
  loading: PropTypes.bool.isRequired,
};

function mapStateToProps(state) {
  console.log("Map state", state);
  return {
    loading: state.apiCallsInProgress > 0,
  };
}

export default connect(mapStateToProps, null)(CoursesPage);
