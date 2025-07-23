import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="Bhuvana"
        School="Rasi International"
        total={456}
        goal={5} 
      />
    </div>
  );
}

export default App;
