import React from 'react';

function ListofPlayers() {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 88 },
    { name: "Dhoni", score: 65 },
    { name: "KL Rahul", score: 45 },
    { name: "Shubman", score: 72 },
    { name: "Hardik", score: 67 },
    { name: "Pant", score: 54 },
    { name: "Jadeja", score: 75 },
    { name: "Ashwin", score: 60 },
    { name: "Shami", score: 50 },
    { name: "Bumrah", score: 80 }
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with Score Below 70</h3>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
