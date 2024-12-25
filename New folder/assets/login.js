// login.js

document.addEventListener("DOMContentLoaded", () => {
    const loginForm = document.getElementById("login-form");

    // Form validation and submission
    loginForm.addEventListener("submit", (e) => {
        e.preventDefault();

        // Get form values
        const email = document.getElementById("email").value;
        const password = document.getElementById("password").value;

        // Basic validation
        if (email === "" || password === "") {
            alert("Please fill in all fields.");
            return;
        }

        // Simulate successful login and redirect
        if (email === "test@example.com" && password === "password123") {
            alert("Login successful!");
            window.location.href = "profile.html";
        } else {
            alert("Invalid credentials.");
        }
    });

    // Email and password validation feedback
    const emailInput = document.getElementById("email");
    const passwordInput = document.getElementById("password");

    emailInput.addEventListener("input", validateForm);
    passwordInput.addEventListener("input", validateForm);

    function validateForm() {
        if (emailInput.value === "") {
            emailInput.classList.add("is-invalid");
        } else {
            emailInput.classList.remove("is-invalid");
        }

        if (passwordInput.value.length < 6) {
            passwordInput.classList.add("is-invalid");
        } else {
            passwordInput.classList.remove("is-invalid");
        }
    }
});
