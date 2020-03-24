import React, { Component } from 'react'
import ApiService from "../../service/ApiService";

class AddCardComponent extends Component {


    constructor(props) {
        super(props);
        this.state = {
            id: '',
            name: '',
            cardNumber: '',
            limit: '',
            balance: ''
        }
        this.saveCard = this.saveCard.bind(this);
    }

    valid_credit_card(value) {
        // Accept only digits, dashes or spaces
        if ('/[^0-9-\s]+/'.test(value)) return false;

        // The Luhn Algorithm. It's so pretty.
        let nCheck = 0, bEven = false;
        value = value.replace(/\D/g, "");

        for (var n = value.length - 1; n >= 0; n--) {
            var cDigit = value.charAt(n),
                nDigit = parseInt(cDigit, 10);

            if (bEven && (nDigit *= 2) > 9) nDigit -= 9;

            nCheck += nDigit;
            bEven = !bEven;
        }

        return (nCheck % 10) == 0;
    }

    saveCard = (e) => {
        e.preventDefault();
        let card = {
            id: this.state.id,
            name: this.state.name,
            cardNumber: this.state.cardNumber,
            limit: this.state.limit,
            balance: 0
        };
        ApiService.addCard(card)
            .then(res => {
                this.setState({ message: 'cards added successfully.' });
                this.props.history.push('/cards');
            });
    }

    onChange = (e) =>
        this.setState({ [e.target.name]: e.target.value });

    render() {
        return (
            <div>
                <h2 className="text-center">Add Card</h2>
                <form>
                    <div className="form-group">
                        <label>Name:</label>
                        <input type="text" placeholder="name" name="name" className="form-control"
                            value={this.state.name} onChange={this.onChange} />
                    </div>

                    <div className="form-group">
                        <label>Card Number:</label>
                        <input type="text" placeholder="cardNumber" name="cardNumber" className="form-control"
                            value={this.state.cardNumber} onChange={this.onChange} />
                    </div>


                    <div className="form-group">
                        <label>Limit:</label>
                        <input placeholder="limit" name="limit" className="form-control" value={this.state.limit} onChange={this.onChange} />
                    </div>

                    <button className="btn btn-success" onClick={this.saveCard}>Save</button>
                </form>
            </div>
        );
    }
}

export default AddCardComponent;