function playGame() {
    fetch('/api/game/play')
        .then(res => res.text())
        .then(data => {
            document.getElementById('result').innerText = data;
        })
        .catch(err => console.error(err));
}
