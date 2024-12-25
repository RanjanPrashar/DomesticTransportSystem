// index.js

document.addEventListener("DOMContentLoaded", () => {
    const loginBtn = document.getElementById("login-btn");
    const registerBtn = document.getElementById("register-btn");

    // Redirect to login page
    loginBtn.addEventListener("click", (e) => {
        e.preventDefault();
        window.location.href = "login.html";
    });

    // Redirect to register page
    registerBtn.addEventListener("click", (e) => {
        e.preventDefault();
        window.location.href = "register.html";
    });
});

