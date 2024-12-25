// success.js

document.addEventListener("DOMContentLoaded", () => {
    const homeBtn = document.getElementById("home-btn");

    // Redirect to home page
    homeBtn.addEventListener("click", (e) => {
        e.preventDefault();
        window.location.href = "index.html";
    });
});
