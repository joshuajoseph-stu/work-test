
const url = 'http://localhost:9191/api/train';

async function callApi() {
    let response = await fetch(url);
    let jsonStr = await response.text();
    console.log(jsonStr);

    createTable(jsonStr);
}

// fetch(YOUR_URL, {
//     method: 'DELETE',
//     headers: {
//       'Content-Type': 'application/json'
//     },
//     body: JSON.stringify(YOUR_ADDITIONAL_DATA)  //if you do not want to send any addional data,  replace the complete JSON.stringify(YOUR_ADDITIONAL_DATA) with null
//   })

function createTable(jsonStr) {

    const jsonObj = JSON.parse(jsonStr);

    //  const data = jsonObj.data;
    const data = jsonObj;

    const tableBody = document.getElementById('table_body')

    for (let x in data) {

        let obj = data[x];

        const row = document.createElement('tr');

        const cell1 = document.createElement('td');
        cell1.innerHTML = obj.trainNo;
        const cell2 = document.createElement('td');
        cell2.innerHTML = obj.trainName;
        const cell3 = document.createElement('td');
        cell3.innerHTML = obj.source;
        const cell4 = document.createElement('td');
        cell4.innerHTML = obj.destination;
        const cell5 = document.createElement('td');
        cell5.innerHTML = obj.ticketPrice;
        const cell6 = document.createElement('td');
        let btn = document.createElement('button');
        btn.classList.add('btn','btn-danger');
        btn.innerHTML='Delete';

        cell6.appendChild(btn);
        


        row.appendChild(cell1);
        row.appendChild(cell2);
        row.appendChild(cell3);
        row.appendChild(cell4);
        row.appendChild(cell5);
        row.appendChild(cell6);
        

        tableBody.appendChild(row);
    }
}

callApi();