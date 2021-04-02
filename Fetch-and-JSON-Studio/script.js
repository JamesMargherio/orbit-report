window.addEventListener("load", function() {
    const astronauts = fetch("https://handlers.education.launchcode.org/static/astronauts.json");
    astronauts.then(function(response) {
        response.json().then(function(json){
            for (i=0;i<json.length;i++) {
                const container = document.getElementById("container");
                const bio = 
                    `<div class="astronaut">
                        <div class="bio">
                            <h3>${json[i].firstName} ${json[i].lastName}</h3>
                            <ul>
                                <li>Hours in space: ${json[i].hoursInSpace}</li>
                                <li>Active: ${json[i].active}</li>
                                <li>Skills: ${json[i].skills}</li>
                            </ul>
                        </div>
                        <img class="avatar" src=${json[i].picture}>
                    </div>`
                    container.innerHTML += bio
            };
        });
    });
});