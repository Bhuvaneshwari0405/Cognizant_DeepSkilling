import React, { Component } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  toggleLogin = () => {
    this.setState(prev => ({ isLoggedIn: !prev.isLoggedIn }));
  }

  render() {
    return (
      <div style={{ padding: '30px' }}>
        <h1>Ticket Booking App</h1>
        <button onClick={this.toggleLogin}>
          {this.state.isLoggedIn ? 'Logout' : 'Login'}
        </button>

        <hr />
        {this.state.isLoggedIn ? <UserPage /> : <GuestPage />}
      </div>
    );
  }
}

export default App;
