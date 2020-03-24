import React from 'react';
import './App.css';
import {
    BrowserRouter as Router,
    Route,
    Switch
} from 'react-router-dom';
import ListCardsComponent from "./component/contact/ListCardsComponent";
import AddCardComponent from "./component/contact/AddCardComponent";

function App() {
    return ( <
        div className = "container" >
        <
        Router >
        <
        div className = "col-md-6" >
        <
        Switch >
        <
        Route path = "/add-card"
        component = {
            AddCardComponent
        }
        />  <
        Route path = "/cards"
        component = {
            ListCardsComponent
        }
        />  < /
        Switch > <
        /div>  < /
        Router > <
        /div>
    );
}

const style = {
    color: 'red',
    margin: '10px'
}

export default App;