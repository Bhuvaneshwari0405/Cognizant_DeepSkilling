// src/App.js
import React from "react";
import "./App.css";

function App() {
  // Heading element using JSX
  const heading = <h1>Office Space Rental Listings</h1>;

  // Image attribute JSX
  const imageUrl =
    "https://images.unsplash.com/photo-1590650046871-92c887180603?ixlib=rb-4.0.3&auto=format&fit=crop&w=1050&q=80";

  // Object with office details
  const office = {
    name: "WeWork Tower",
    rent: 45000,
    address: "Mumbai, India",
  };

  // Array of offices
  const officeSpaces = [
    {
      name: "TechHub",
      rent: 40000,
      address: "Bangalore, India",
    },
    {
      name: "StartupSpace",
      rent: 65000,
      address: "Chennai, India",
    },
    {
      name: "InnovateHub",
      rent: 75000,
      address: "Hyderabad, India",
    },
    {
      name: "WeWork Tower",
      rent: 45000,
      address: "Mumbai, India",
    },
  ];

  return (
    <div className="App" style={{ textAlign: "center", fontFamily: "Arial" }}>
      {heading}
      <img
        src={imageUrl}
        alt="Office space"
        style={{ width: "400px", marginBottom: "20px" }}
      />

      <h2>Featured Office:</h2>
      <p>
        <strong>Name:</strong> {office.name}
      </p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
          ₹{office.rent}
        </span>
      </p>
      <p>
        <strong>Address:</strong> {office.address}
      </p>

      <h2>All Available Spaces:</h2>
      <div style={{ display: "flex", flexWrap: "wrap", justifyContent: "center" }}>
        {officeSpaces.map((space, index) => (
          <div
            key={index}
            style={{
              border: "1px solid #ccc",
              padding: "20px",
              margin: "10px",
              width: "250px",
              borderRadius: "10px",
              boxShadow: "0 4px 6px rgba(0,0,0,0.1)",
            }}
          >
            <p><strong>Name:</strong> {space.name}</p>
            <p>
              <strong>Rent:</strong>{" "}
              <span style={{ color: space.rent < 60000 ? "red" : "green" }}>
                ₹{space.rent}
              </span>
            </p>
            <p><strong>Address:</strong> {space.address}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
