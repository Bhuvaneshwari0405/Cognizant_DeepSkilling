import React from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = false; 

  return (
    <div className="App" style={{ justifyContent: 'center', alignItems: 'center', padding: '20px' }}>
      <h1>🏏 Welcome to Cricket App</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
