import React from 'react';

function IndianPlayers() {
  const oddTeam = ["Virat", "Dhoni", "KL Rahul", "Pant", "Ashwin"];
  const evenTeam = ["Rohit", "Hardik", "Shubman", "Jadeja", "Bumrah"];

  const [firstOdd, secondOdd, ...restOdd] = oddTeam;
  const [firstEven, secondEven, ...restEven] = evenTeam;

  const T20players = ["Raina", "Yuvraj", "Sehwag"];
  const RanjiTrophy = ["Prithvi Shaw", "Manish Pandey"];

  const allPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Team Split (Using Destructuring)</h2>
      <p><strong>Odd Team Top Players:</strong> {firstOdd}, {secondOdd}</p>
      <p><strong>Even Team Top Players:</strong> {firstEven}, {secondEven}</p>

      <h3>All Players from T20 + Ranji Trophy (Using Merge)</h3>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
