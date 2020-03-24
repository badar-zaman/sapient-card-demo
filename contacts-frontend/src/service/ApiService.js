import axios from 'axios';

const CONTACT_API_BASE_URL = 'http://localhost:8080/cards';

class ApiService {

    fetchCards() {
        return axios.get(CONTACT_API_BASE_URL + "/fetchCards");
    }

    addCard(card) {
        return axios.post("" + CONTACT_API_BASE_URL, card);
    }

}

export default new ApiService();