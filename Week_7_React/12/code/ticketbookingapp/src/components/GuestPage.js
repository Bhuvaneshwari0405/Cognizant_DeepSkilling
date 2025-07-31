import React from 'react';

const GuestPage = () => {
  const flightDetails = [
    { id: 1, flight: 'IndiGo 6E-123', from: 'Chennai', to: 'Delhi', time: '10:00 AM' },
    { id: 2, flight: 'Air India AI-404', from: 'Mumbai', to: 'Bangalore', time: '02:00 PM' },
  ];

  return (
    <div>
      <h2>Guest View - Flight Details</h2>
      <ul>
        {flightDetails.map(f => (
          <li key={f.id}>
            {f.flight} | {f.from} → {f.to} at {f.time}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default GuestPage;
