import React, { Component } from 'react'
import ApiService from "../../service/ApiService";

class ListCardsComponent extends Component {

    constructor(props) {
        super(props)
        this.state = {
            cards: [],
            message: null
        }

        this.addCard = this.addCard.bind(this);
    }

    componentDidMount() {
        this.reloadCardList();
    }

    reloadCardList() {
        ApiService.fetchCards()
            .then((res) => {
                this.setState({ cards: res.data.result })
            });
    }

    addCard() {
        this.props.history.push('/add-card');
    }

    render() {
        return (

            <div style={{ float: "center", marginTop: "20%", marginLeft: "30%", width: "100%" }}>
                <br></br><br></br>
                <div style={{ marginLeft: '30%', marginTop: '-5%', padding: '5%', width: "100%", height: '100%' }}>
                    <div style={{ margin: '5%', padding: '5%', width: "100%", height: '100%' }}>
                        <label align='left'>Existing Cards</label>
                        <button className="btn btn-danger" style={{ width: '100px', marginLeft: '50%' }} onClick={() => this.addCard()}>
                            Add Card</button>
                        <table className="table table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th >Name</th>
                                    <th>Card Number</th>
                                    <th>Limit</th>
                                    <th>Balance</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.cards.map(
                                        card =>
                                            <tr >
                                                <td>{card.name}</td>
                                                <td>{card.cardNumber} </td>
                                                <td>{card.cardLimit} </td>
                                                <td>{card.balance} </td>
                                            </tr>
                                    )
                                }
                            </tbody>
                        </table>
                    </div>
                </div>

                <br></br><br></br>


            </div >
        );
    }

}

export default ListCardsComponent;