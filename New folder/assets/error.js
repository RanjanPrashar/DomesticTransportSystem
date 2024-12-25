// error.js

document.addEventListener("DOMContentLoaded", () => {
    const backButton = document.querySelector("#back-btn");

    // Navigate to the homepage when "Back to Home" button is clicked
    backButton.addEventListener("click", (e) => {
        e.preventDefault();
        window.location.href = "index.html";
    });
});

