import React, { useEffect, useState } from "react";
import { Table } from "semantic-ui-react";
import axios from "axios";
export default function Read() {
  const [APIData, setAPIData] = useState([]);
  //useEffect(() => {}, []);
  useEffect(() => {
    axios.get(`http://localhost:8080/names`).then((response) => {
      setAPIData(response.data);
    });
  }, []);
  return (
    <div>
      <Table singleLine>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>First Name</Table.HeaderCell>
            <Table.HeaderCell>Last Name</Table.HeaderCell>
            <Table.HeaderCell>Premium Plan</Table.HeaderCell>
          </Table.Row>
        </Table.Header>
        <Table.Body>
          <Table.Row>
            <Table.Cell>abc</Table.Cell>
            <Table.Cell>kbc</Table.Cell>
            <Table.Cell>No</Table.Cell>
          </Table.Row>
          {APIData.map((data) => {
            return (
              <Table.Row>
                <Table.Cell>{data.firstName}</Table.Cell>
                <Table.Cell>{data.lastName}</Table.Cell>
                <Table.Cell>
                  {data.checkbox ? "Checked" : "Unchecked"}
                </Table.Cell>
              </Table.Row>
            );
          })}
        </Table.Body>
      </Table>
    </div>
  );
}
