import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      rupees: "",
      euros: "",
      conversionRate: 0.011, // 1 INR = 0.011 EUR (sample rate)
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { rupees, conversionRate } = this.state;
    const euros = (parseFloat(rupees) * conversionRate).toFixed(2);
    this.setState({ euros });
  };

  render() {
    return (
      <div style={{ border: "2px solid green", padding: "20px", margin: "20px" }}>
        <h2>Currency Converter - INR to EURO</h2>
        <form onSubmit={this.handleSubmit}>
          <label>Enter Amount in ₹: </label>
          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
            required
          />
          <button type="submit">Convert</button>
        </form>
        {this.state.euros && (
          <h3>Converted Amount in €: {this.state.euros}</h3>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
