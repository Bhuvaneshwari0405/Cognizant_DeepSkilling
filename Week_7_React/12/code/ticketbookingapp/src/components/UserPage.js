import React from 'react';

const UserPage = () => {
  return (
    <div>
      <h2>Welcome, Logged-in User!</h2>
      <p>You can now book your flight tickets.</p>
      <button onClick={() => alert("Booking Confirmed!")}>Book Ticket</button>
    </div>
  );
};

export default UserPage;
