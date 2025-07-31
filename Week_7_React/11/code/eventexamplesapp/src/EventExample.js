import React, { Component } from "react";

class EventExample extends Component {
  constructor() {
    super();
    this.state = {
      counter: 0,
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  sayHello = () => {
    console.log("Hello from Bhuvana! 😊");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  onPress = () => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ border: "2px solid black", padding: "20px", margin: "20px" }}>
        <h2>Event Handling Example</h2>
        <h3>Counter: {this.state.counter}</h3>

        <button onClick={this.handleIncrement}>Increment</button>{" "}
        <button onClick={this.decrement}>Decrement</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome to the eventexamplesapp!")}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.onPress}>OnPress</button>
      </div>
    );
  }
}

export default EventExample;
