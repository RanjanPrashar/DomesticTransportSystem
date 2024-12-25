// profile.js

document.addEventListener("DOMContentLoaded", () => {
    const logoutBtn = document.getElementById("logout-btn");

    // Handle logout
    logoutBtn.addEventListener("click", (e) => {
        e.preventDefault();
        alert("You have been logged out.");
        window.location.href = "index.html";
    });
});

